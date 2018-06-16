package 牛客真题.笔试17年.滴滴;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/27.
 */
public class 数字和为sum的方法数 {


////递归会超时，只能过40%，用dp. dp[i][j]表示用前i个值组成和为j的方案个数（相比一维的，更容易理解一些）
//#include <iostream>
//#include <algorithm>
//    using namespace std;
////注意：最终结果int类型存不下，需要64位数据
////注意：dp不能放在main里，栈存不下。需要存在全局数据区
//    long long dp[1000][1000];
//    int main()
//    {
//    int n,sum;
//    cin>>n>>sum;
// 
//    int p[1000];
//    for(int i = 1 ; i <= n ; i++)
//        cin>>p[i];
////初始化dp,用前i个组成和为0的方案，只有1种，就是什么都不取，和为0；
//    for (int i = 0 ; i < n ;i++)
//    {
//        dp[i][0] = 1;
//    }
////用0个元素不能组成1~sum
//    for (int j = 1 ; j < sum ;j++)
//    {
//        dp[0][j] = 0;
//    }
// 
//    for (int i = 1 ; i <= n ;i++)
//    {
//        for (int j = 0 ; j<=sum ;j++)
//        {
                                                //没加p[i]的方法数  //加了p[i]的方法数
//            if(p[i]<=j) dp[i][j] = dp[i-1][j]+dp[i-1][j-p[i]];
//            else dp[i][j] = dp[i-1][j];
//        }
//    }
//    cout<<dp[n][sum]<<endl;
//    return 0;
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = scanner.nextInt();
        }
        int []cnt = new int[1];
        for (int i = 0;i < arr.length;i ++) {
            dfs(arr, i, arr[i], sum, cnt);
        }
        System.out.println(cnt[0]);
    }

    public static void dfs(int []arr, int cur, int sum, int goal, int[] cnt) {
        if (sum == goal) {
            cnt[0] ++;
            return;
        }
        if (sum > goal) {
            return;
        }
        for (int i = cur + 1;i < arr.length;i ++) {
            dfs(arr, i, sum + arr[i], goal , cnt);
        }
    }
}
