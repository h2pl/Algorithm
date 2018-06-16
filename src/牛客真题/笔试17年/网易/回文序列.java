package 牛客真题.笔试17年.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/23.
 */
public class 回文序列 {


//    //链接：https://www.nowcoder.com/questionTerminal/7e7ccd30004347e89490fefeb2190ad2
//    来源：牛客网
//
//#include <iostream>
//    using namespace std;
//    int main(){
//    int n = 0;
//    while(cin >> n){
//        long long dp[31] = {0};
//        dp[1] = 3, dp[2] = 9;
//        for( int i = 3; i <= n; i++ )
//            dp[i] = 2*dp[i-1]+dp[i-2];
//        cout<<dp[n]<<endl;
//    }  
//    }

//    链接：https://www.nowcoder.com/questionTerminal/4284c8f466814870bae7799a07d49ec8
//    来源：牛客网
//
//    思路2：贪婪算法
//    贪婪算法并不一定能得到最优解，但是一个可行的，较好的解。
//
//    该问题若采用贪婪算法求解，并不会得到最优解，只会得到一个可行的，较好的解。例如，下述程序中采用了贪婪算法求解。每次都选取最大的约数前进一步。若后续发生不可到达目标点，则进行回溯，取第2大的约数作为步进值。下述程序通过率为80%，并不能AC。例如，对于N=676, M=12948情况，贪婪算法求解为13步，而动态规划算法求解为10步。
//
//    贪婪算法并不一定能得到最优解，但是一个可行的，较好的解。例如，给定硬币coins=[1,2,10,25]，金额总数amounts=30，不限制每种币值的硬币数量，要求用所给硬币凑出所需金额，并且硬币数量最少。若采用贪婪算法求解，需要6枚（25+5*1）硬币。 若采用动态规划求解，所需3枚（10+10+10）硬币。 --- 贪婪算法
//
//// 程序通过率为80%，并不能AC
////对于N=676, M=12948情况，贪婪算法求解为13步，而动态规划算法求解为10步。
//// 贪婪算法并不一定能得到最优解，但是一个可行的，较好的解。
//#include <iostream>
//    using namespace std;
//
//    int stepSearch(int N, int M) {
//        if (N > M) {
//            return -1;
//        }
//        if (N == M) {
//            return 0;
//        }
//        int res = 0;
//        for (int i = 2; i<N; i++) {
//            if (i*(N / i) == N) {
//                res++;
//                if (stepSearch(N + N/i, M) != -1) {
//                    res += stepSearch(N + N/i, M);
//                    return res;
//                }
//                else {
//                    res--;
//                }
//            }
//        }
//        return -1;
//    }
//
//    int main() {
//        int N, M;
//        while (cin >> N >> M) {
//            cout << stepSearch(N, M) << endl;
//        }
//        return 0;
//    }

//模仿 bupt渣硕 大神的
//import java.util.Scanner;
//    public class Main {
//    public static void main(String[] args){    
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            int times = 0;
//            int n = scanner.nextInt();
//            int[] inputArr = new int[n];
//            for(int i = 0; i < n; i++){
//                inputArr[i] = scanner.nextInt();
//            }
//            int head = 0;
//            int tail = n - 1;
//            while(head < tail){
//                if(inputArr[head] > inputArr[tail]){
//                    inputArr[--tail] += inputArr[tail + 1];
//                    times++;
//                }else if(inputArr[head] < inputArr[tail]){
//                    inputArr[++head] += inputArr[head - 1];
//                    times++;
//                }else{
//                    head++;
//                    tail--;
//                }
//            }      
//            System.out.println(times);
//        }
//        scanner.close();
//    }
//    }

    //想复杂了。stop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        line = scanner.nextLine();
        String []s = line.split(" ");
        int []arr = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        if (legal(arr)) {
            System.out.println(0);
        }else {
            System.out.println(modify(arr));
        }
    }

    public static int modify(int []arr) {
        int cnt = 0;
        int i = 0, j = arr.length - 1;
        retry:
        while (i < j) {
            if (arr[i] == 0) {
                i ++;
                continue;
            }
            if (arr[j] == 0) {
                j --;
                continue;
            }
            if (arr[i] != arr[j] ) {
                if (arr[i] < arr[j] && j > i + 1 ) {
                    for (int k = i + 1;i < j;i ++) {
                        if (arr[k] != 0) {
                            arr[i] = arr[i] + arr[k];
                            arr[k] = 0;
                            break;
                        }
                    }
                    cnt ++;
                    if (legal(arr)) return cnt;
                    continue;
                }else if (arr[i] > arr[j] && j - 1 > i ){
                    for (int k = j - 1;k > i;k --) {
                        if (arr[k] != 0) {
                            arr[k] = arr[j] + arr[k];
                            arr[j] = 0;
                            j = k;
                            break;
                        }
                    }
                    cnt ++;
                    if (legal(arr))return cnt;
                    continue;
                }
            }else {
                if (legal(arr)) {
                    return cnt;
                }
                i++;
                j--;
            }
            if (i >= j) {
                i = 0;j = arr.length - 1;
                continue retry;
            }
        }
        return -1;
    }

    public static boolean legal(int []arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 0) {
                i ++;
                continue;
            }
            if (arr[j] == 0) {
                j --;
                continue;
            }
            if (arr[i] != arr[j]) {
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }
}
