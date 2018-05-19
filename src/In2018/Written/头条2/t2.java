package In2018.Written.头条2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/4/15.
 */
public class t2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        int n1 = Integer.parseInt(ss[0]);
        int n2 = Integer.parseInt(ss[1]);
        int m = Integer.parseInt(ss[2]);
        int []a = new int[n1];
        int []b = new int[n2];
        String temp1 = input.nextLine();
        String[] ss1 = temp.trim().split(" ");
        String temp2 = input.nextLine();
        String[] ss2 = temp2.trim().split(" ");
        System.out.println(temp);
        System.out.println(temp1);
        System.out.println(temp2);
        for (int i = 0;i < n1;i ++) {
            a[i] = Integer.parseInt(ss1[i]);
        }
        for (int i = 0;i < n2;i ++) {
            b[i] = Integer.parseInt(ss2[i]);
        }
        input.close();
        int cnt = coinsWay(a,m);
        for (int i = 0;i < b.length;i ++) {
            cnt += coinsWay(a,b[i]);
        }
        System.out.println(cnt);
    }
    static int res = 0;
    public static int coinsWay(int[] coins, int aim) {
        if(aim == 0)return 0;
        if(coins.length == 0)return 0;
        res = 0;
        int money = coins[0];

        return coinsLope(coins, 0, aim);
    }

    public static int coinsLope(int[] coins, int index, int aim) {

        if(index >= coins.length) return  0;
        if(index == coins.length - 1){
            res = (aim%coins[index] == 0) ? 1:0;
            return res;
        }
        for(int i = 0;coins[index]*i <= aim;i ++) {
            res += coinsLope(coins, index + 1, aim - coins[index] * i);
        }
        return res;
    }

    //记忆化搜索，防止重复计算
    public int coinsMap(int []coins, int index, int aim) {

        int [][]map = new int[index + 1][aim + 1];
        Arrays.fill(map, -1);
        if(index >= coins.length) return  0;
        if(index == coins.length - 1){
            res = (aim%coins[index] == 0) ? 1:0;
            return res;
        }
        for(int i = 0;coins[index]*i <= aim;i ++) {
            int temp = 0;
            if (map[index][aim] == -1) {
                temp = coinsLope(coins, index + 1, aim - coins[index] * i);
                map[index][aim] = temp;
            }else temp = map[index][aim];
            res += temp;
        }
        return res;
    }

    public int coinsDP(int []coins,int n, int aim) {
        int [][]map = new int[n][aim + 1];
        Arrays.fill(map, -1);
        //填充第一列
        for(int i = 0; i < n; i ++) {
            map[i][0] = 1;
        }
        //填充第一行
        for(int i=0;i<aim+1;i++)
            if(i%coins[0]==0)
                map[0][i]=1;
            else
                map[0][i]=0;

        //根据第一行和第一列的结果可以算出第二行和第二列的结果，以此类推。
        //注意特殊情况，当j很小时，可能一张coins[i]都用不了。此时使用coins[i]的情况就不需要考虑了。
        //此时直接等于只是用0到i-1种纸币的情况总数！
        for(int i = 1;i < n;i++) {
            for(int j = 1;j < aim; j++) {
                if(j - coins[i] >= 0) {
                    map[i][j] = map[i][j - coins[i]] + map[i-1][j];
                }
                else map[i][j] = map[i-1][j];
            }
        }
        return map[n-1][aim];

    }
}
