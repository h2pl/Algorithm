package 牛客往年真题.笔试17年.网易.难题;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/20.
 */

//错误
public class 混合颜料 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        line = scanner.nextLine();
        String []s = line.split(" ");
        long []arr = new long[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = Long.parseLong(s[i]);
        }
        System.out.println(mix(arr));
    }
    //求最小值，想到dp
    public static int mix(long []arr) {
        //由于1 ^ 2 = 3,2 ^ 3 = 1, 3 ^ 1 = 2，所以颜料的顺序没有关系。我们可以先排序。
        //a ^ a = 0  a ^ 0 = a  a ^ a ^ b = b
        //完成前n个颜色需要几种颜料
        int []dp = new int[arr.length + 1];
        dp[0] = 0;
        dp[1] = 1;
        long mix = 0;
        for (int i = 1; i < arr.length;i ++) {
            if (arr[i] == (mix ^ arr[i - 1])) {
                dp[i + 1] = dp[i];
            }else {
                dp[i + 1] = dp[i] + 1;
                mix = mix ^ arr[i];
            }
        }
        return dp[arr.length];
    }


//    这道题小白表示理解起来很困难，结合了@我要变橙色和@夕阳Co'de的解题思路后，将再进一步的自己的理解写在下面：
//
//    题目翻译理解
//
//    ok，这道题翻译过来，就是进行多次输入，每次输入n个数，将这些数之间进行多次xor（异或操作），其中一个数可能被xor多次，看最后能剩余多少不重复的数，输出数量即可。
//
//    解题思路
//
//    在C++中，将两个数进行xor，用的是^符号，但是实际上是将十进制转换为二进制之后，再进行xor，这样，这n个十进制的数，就被转换成了n个二进制的包含1，0的字符串，将每个数转换成二进制之后单成一行，位数小的前面被补全0，这样这n个数就变成了n行矩阵，由于1 ≤ xi ≤ 1,000,000,000，而2的30次幂是10亿多，所以这个矩阵最大是n＊30的矩阵。
//
//    现在将这个矩阵列出来，如：
//
//            101010
//            111010
//            101101
//            110110
//
//    然后进行行与行之间的xor，其中1^1=0;  0^0=0;  1^0=1; 0^1=1;
//    有没有发现这种运算很像求矩阵的秩？相同的相减为0，不同的相减为1.
//
//            矩阵的秩定义：是其行向量或列向量的极大无关组中包含向量的个数。
//    矩阵的秩求法：用初等行变换化成梯矩阵, 梯矩阵中非零行数就是矩阵的秩.
//
//            所以这道题就被转化成了求矩阵的秩, 求法如下。
//
//
//    链接：https://www.nowcoder.com/questionTerminal/5b1116081ee549f882970eca84b4785a
//    来源：牛客网

//数组从小到大排列，从最下面一行开始，每次消去最高位的1，比如A行的系数减去B行，直接A = A^B就行
//import java.util.*;
//    public class hunheyanliao {
//     
//            public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        while(scan.hasNext()){
//            int n = scan.nextInt();
//            int[] col = new int[n];
//            for(int i=0; i<n; i++){
//                col[i] = scan.nextInt();       
//            }
//            Arrays.sort(col);
//            int count = 0;
//            for(int i=n-1; i>=0; i--){
//                for(int j=i-1; j>=0; j--){
    //对于矩阵的每一行，只要有一个位相等，那么异或结果就可以搞出一个0，于是乎每行都多搞出几个0.
    //那么最后剩余的不为0的行可以组成一个阶梯矩阵，行数就是秩，也就是得到这些行所需要的最少行数，也就是颜料数
//                    if(highbit(col[i]) == highbit(col[j])){
//                        col[j] = col[j] ^ col[i];
//                    }
//                }
//                Arrays.sort(col);
//            }
//            for(int i=0 ;i<n;i++)
//                if(col[i] !=0){
//                    count ++;
//            }
//            System.out.println(count);
//        }
//    }
//    public static int highbit(int x){
//        for(int i=31;i>=0;i--)
//        {
//           int m = (x>>i)&1;
//           if(m != 0)
//               return i+1;
//        }
//        return 0;
//    }
//    }
//            //
////  main.cpp
//
////  NiuKe_HunHeYanLiao
//
////
//
////  Created by 麦心 on 16/8/18.
//
////  Copyright © 2016 年 程序工匠 0_0 小姐 . All rights reserved.
//
////
//
//            #include <iostream>
//
//    using namespace std ;
//
//#include <vector>
//
//#include <algorithm>
//
//// 求一个数的二进制的最高位是哪位
//
//    int getHighBit( int num){
//
//    int highbit = 0 ;
//
//    while (num) {
//
//        // 将该数的二进制右移一位
//
//        num>>= 1 ;
//
//        highbit++;
//
//    }
//
//    return highbit;
//
//    }
//
//    int main() {
//
//    vector < int > colors;
//
//    int n;
//
//    
//
//    while ( cin >> n){
//
//        colors. clear ();
//
//        int result = 0 ;
//
//        int temp;
//
//        int i = n;
//
//        while (i--) {
//
//            cin >>temp;
//
//            colors. push_back (temp);
//
//        }
//
//        
//
//        // 将 colors 进行从小到大的排序
//
//        sort (colors. begin (), colors. end ());
//
//        int bigger, smaller;
//
//        //bigger 和 smaller 始终指向的是最后一位和倒数第二位数
//
//        bigger = n - 1 ;
//
//        smaller = bigger - 1 ;
//
//        
//
//        while (colors. size ()> 2 ) {
//
//            // 如果两者的最高位相同，说明最高位可以消掉，
//
//            // 将两者 xor ，或者说将矩阵两行相减消掉最高位
//
//             if ( getHighBit (colors[ bigger ]) == getHighBit (colors[ smaller ])){
//
//                int tem = colors[ bigger ]^colors[ smaller ];
//
//                //find 函数头文件是 <algorithm>
//
//                // 泛型算法的 find ，在非 string 类型的容器里，可以直接找出所对应的元素
//
//                // 从 vector 的头开始一直到尾，找到第一个值为 temp 的元素，返回的是一个指向该元素的迭代器 std::vector<int>::iterator 类型
//
//                
//
//                // 因为现在 xor 的是两个最大的数，而且最高位已被消掉，所以 xor 得到的结果一定比这两个数小
//
//                
//
//                // 如果 temp 这个 比最大两个数小的 数没有被找到，则将 temp 加到 colors 数组中，进行再次 xor
//
//                // 找不到的话，返回 colors.end 应该是固定用法
//
//                if ( find (colors. begin (), colors. end (), tem)==colors. end ()){
//
//                    colors. push_back (tem);
//
//                    sort (colors. begin (), colors. end ());
//
//                    bigger++; // 因为 colors 中多了一个数，所以需要位数＋ 1
//
//                    smaller++;
//
//                }
//
//            } else {
//
//                result++;
//
//            }
//
//            // 如果两者最高位不同，说明已经所有数的最高位已经只有最大的那个数是 1 了，这样它已经不可能被消掉了，结果＋ 1
//
//            
//
//            // 如果两个最大数的最高位可以消掉，那么消除之后，最大数已被消掉，没有用了
//
//            // 如果两个最大数的最高位不可以消掉，那么结果＋ 1 ，最大数也没有用了。
//
//            // 弹出最大数
//
//            colors. pop_back ();
//
//            
//
//            // 因为弹出了一个数，所以 bigger 和 smaller 都要相应－ 1
//
//            bigger = smaller;
//
//            smaller--;
//
//        }
//
//        cout <<result+2 << endl ;
//
//    }
//
//    }


}
