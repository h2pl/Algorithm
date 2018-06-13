package 过去笔试记录.Basic.practice;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/12.
 */
public class TheShortest {
    //最短路径数量
    int shortestRoad(int m,int n){
        if(m==0 || n==0)return 1;
        else return  shortestRoad(m-1,n)+shortestRoad(m,n-1);
    }

   //矩阵相乘
   void matMulti(){
//不会
    }

    int longestSubstr(int []m,int []n,int i,int j){

        if(i==0 || j==0)return 0;
       else if(m[i]==n[j]){
           return longestSubstr(m,n,i-1,j-1)+1;
       }
       else return Math.max(longestSubstr(m,n,i-1,j),longestSubstr(m,n,i,j-1));



    }
    int []p = {0, 6, 3, 5, 4, 6}; // p 价值，多放置一个0，是为了让下标统一，方便理解和计算。
    int []w = {0, 2, 2, 6, 5, 4}; // w 重量
    // int x[6];
    int n = 5;  // 所有物品的数量
    int c = 10; // 实际最大总容量
    int bagPro(int i,int y){


// F函数的返回值是，当前剩为余容量为y，并且当前仍有剩余物品从i到n时，的最优解。
// i为当前检索到哪个物品的序号

            if (i == n) return (y < w[n]) ? 0 : p[n]; // 最终返回点，一次性比较搞定！
            if (y < w[i]) return bagPro(i+1, y); // 如果y小于当前重量，那么只有一个选择：继续向下搜寻，看看能不能放下后面的物品
            // 如果y大于当前物品的重量w[i]，就有两个选择了（虽然不能当场计算出这两个选择的值，但是没关系，让它们继续往下计算就是了）：
            // 最后返回（假设当前不放入物品，y的值不变）和（假设当前放入物品，y减去当前物品的重量）的两种不同选择之后，所造成不同价值的比较结果。
            // 在i=n之前，所有的F函数代表的临时总价值，都是悬而未决的。但是一旦i=n之后，依次返回正确的值。
            // F(i+1,y) 和 F(i+1, y-w[i])+p[i]，它们都是i+1时候的情况，分头进行计算，相互不依赖。层次分解，就好象是一颗二叉树（中间如果y<w[i]就只有一个节点）。
            // 最后只得出一个F的值（最优值），其余F的临时总价值，全部丢弃。
            return Math.max(bagPro(i+1,y), bagPro(i+1, y-w[i])+p[i]); // 切记，返回的是物品的总价值（最大值=最优解）
        }


    @Test
    public void test(){
       // int []p = {0, 6, 3, 5, 4, 6}; // p 价值，多放置一个0，是为了让下标统一，方便理解和计算。
       // int []w = {0, 2, 2, 6, 5, 4}; // w 重量
//        int []c={0,1,2};
//        int []w={0,3,4};
        System.out.println(bagPro(1,6));
//        int []a={0,1,2,3,4,5,6};
//        int []b={0,1,3,5,6};
//        System.out.println(longestSubstr(a,b,6,4));
    }
}
