package 牛客真题.网易.难题;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/20.
 */
//错误
public class 数列还原 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] s = line.split(" ");
        int n = Integer.parseInt(s[0]);
        long k = Long.parseLong(s[1]);
        line = scanner.nextLine();
        s =  line.split(" ");
        int []arr = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = Integer.parseInt(s[i]);
        }
//        System.out.println(num(arr, k));
    }
    //暴力枚举不可取。考虑回溯
//    public static int num(int []arr, int k) {
//        int []seq = new int[arr.length];
//        int cnt = 0;
//        //分别表示剩余的数和0的位置
//
//        int []rem = new int[arr.length + 1];
//        for (int i = 0;i < arr.length;i ++) {
//            if(arr[i] != 0) {
//                //该数不能再出现
//                rem[arr[i]] = 0;
//            }
//        }
//        int i = 1,j = 0;
//        return 1;
//    }
    //
//    public static int num(int []arr, long k) {
//        int []seq = Arrays.copyOf(arr, arr.length);
//        int cp = 0;
//        //统计初始顺序对
//        cp = cp(seq);
//        //表示某个数是否已经加入数组，这些数不能再使用
//        int []visit = new int[seq.length + 1];
//        int usednums = 0;
//        for (int i = 0;i < seq.length;i ++) {
//            if (seq[i] != 0) {
//                usednums ++;
//                visit[seq[i]] = 1;
//            }
//        }
//        int []cnt = new int[1];
//        dfs(seq, cp, k, cnt, visit, usednums);
//        return cnt[0];
//    }
//
//    public static void dfs(int []arr, int cp, long k, int []cnt, int[] visit, int usednums) {
//        if (cp > k)return;
//        if (usednums == arr.length && cp == k) {
//            cnt[0] ++;
//            return;
//        }
//        for (int i = 0;i < arr.length;i ++) {
//            if (arr[i] == 0) {
//                for (int j = 1;j < visit.length;j ++) {
//                    if (visit[j] == 0) {
//                        arr[i] = j;
//                        usednums ++;
//                        visit[j] = 1;
//                        cp = cp(arr);
//
//                        dfs(arr, cp, k, cnt, visit, usednums);
//                        //回溯
//                        visit[j] = 0;
//                        usednums --;
//                    }
//                }
//                arr[i] = 0;
//            }
//        }
//    }
//
//    public static int cp(int []seq){
//        int cp = 0;
//        for (int i = 0;i < seq.length;i ++) {
//            for (int j = 0;j < seq.length;j ++) {
//                if (i > j && seq[i] > seq[j] && seq[j] > 0) {
//                    cp ++;
//                }
//            }
//        }
//        return cp;
//    }

}
//正确解法，注意此处的全排列函数，需要会一下
//for(int i=m;i<=n;i++){
//        swap(a[i],a[m]);
//        pai_xu(a,m+1,n);
//        swap(a[i],a[m]);
//        }
//        在这一部分代码是整个程序的核心部分，很多人都是对这里有疑问，在这部分中可以这样理解，m代表着数列的开头，a[i]和a[m]交换既是由a[i]所对应的数字打头阵，由于有for循环的存在，显然1-n都会有机会打头阵，接下来的递归调用就是把n的全排列问题转化为n-1的全排列问题，然后逐步推导，一直到m=n时可以输出第一个排列，这时候程序就会执行上面语句段的第二个交换语句，这个语句的作用是要把原来交换了的排列恢复，让前面的语句再换一个数字打头阵接着又反复进行。
//
//        注意：把m理解为数列的开头，上面那句和a[m]交换，理解为把哪个数字换到开头位置，后面的交换理解为换开头数字前恢复排列的作用。


//public class Main{
// 
//            /**
//      * @param args
//      */
//            public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            int RES = 0;
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            int[] A = new int[n];
//            boolean[] flag = new boolean[n+1];
//            //flag标记哪些数字已经存在
//            for(int i=0;i<n;i++){
//                A[i] = sc.nextInt();
//                if(A[i] != 0){
//                    flag[A[i]] = true;
//                }
//            }
//             
//            //统计排列中不存在的数字
//            ArrayList<Integer> list = new ArrayList<Integer>();
//            for(int i=1;i<=n;i++){
//                if(flag[i] == false)
//                    list.add(i);
//            }
//             
//            //perm用来存模糊数字的全排列
//            List<ArrayList<Integer>> perm = new ArrayList<ArrayList<Integer>>();
//             
//            //计算perm
//            calperm(perm, list, 0);
//             
//            //统计已有的排列的顺序对
//            int cv = 0;
//            for(int i=0;i<n;i++){
//                if(A[i]!= 0){
//                    for(int j=i+1;j<n;j++){
//                        if(A[j] != 0 && A[i] < A[j])
//                            cv++;
//                    }
//                }
//            }
//             
//            //计算每个模糊数字排列的顺序对，如果与k相等，则结果RES加一
//            for(ArrayList<Integer> tmp : perm){
//                int val = cv;
//                int[] tmpA = Arrays.copyOf(A, n);
//                val += calvalue(tmp, tmpA);
//                if(val == k)
//                    RES++;
//            }
//             
//            System.out.println(RES);
//        }
//    }
//     
//            //计算排列的顺序对
//            public static int calvalue(List<Integer> list, int[] A){
//        int val = 0;
//        int j = 0;
//        for(int i=0;i<A.length;i++){
//            if(A[i] == 0){
//                A[i] = list.get(j++);
//                for(int k = 0;k<i;k++){
//                    if(A[k]!=0 && A[k]<A[i])
//                        val++;
//                }
//                for(int k=i+1;k<A.length;k++){
//                    if(A[k]!=0 && A[k]>A[i])
//                        val++;
//                }
//            }
//        }
//        return val;
//    }
//     
//            //计算全排列
//            public static void calperm(List<ArrayList<Integer>> perm , ArrayList<Integer> list, int n){
//        if(n == list.size()){
//            perm.add(new ArrayList<Integer>(list));
//        }else{
//            for(int i=n;i<list.size();i++){
//                Collections.swap(list, i, n);
//                calperm(perm, list, n+1);
//                Collections.swap(list, i, n);
//            }
//        }
//    }
//}
