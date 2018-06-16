package 牛客真题.笔试17年.网易.难题;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/19.
 */
//难题
public class 分田地 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        String[] s = line.split(" ");
//        int n = Integer.parseInt(s[0]);
//        int m = Integer.parseInt(s[1]);
//        int [][]map = new int[n][m];
//        for (int i = 0; i < n;i ++) {
//            line = scanner.nextLine();
//            for (int j = 0;j < m;j ++) {
//                map[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
//            }
//        }
//        System.out.println(value(map));
//
//    }
//
//    public static int value(int [][]map) {
//        return 1;
//    }

    //大神标准答案，给跪。用到了二分+暴力枚举+贪心
    //计算matrix矩阵中左上顶点(i,j)到右下顶点(x-1,y-1)确定的田地的价值和
    public static int cal(int x,int y,int i,int j,int[][] sum)
    {
        return sum[x][y]-sum[x][j]-sum[i][y]+sum[i][j];
    }
    //判断x是否小于等于小于田地中最小一块的值
    public static boolean judge(int x,int n,int m,int[][] sum)
    {
        for (int i=1;i<=m-3 ;i++ )
        {
            for (int j=i+1;j<=m-2 ;j++ )
            {
                for (int k=j+1;k<=m-1 ;k++ )
                {
                    int last=0,cnt=0;
                    for (int r=1;r<=n ;r++ )
                    {
                        int s1=cal(r,i,last,0,sum);
                        int s2=cal(r,j,last,i,sum);
                        int s3=cal(r,k,last,j,sum);
                        int s4=cal(r,m,last,k,sum);
                        //当前横切一刀条件满足
                        if (s1>=x&&s2>=x&&s3>=x&&s4>=x)
                        {
                            last=r;
                            cnt++;
                        }
                    }
                    //表明x小于等于16块田地中的最小值，返回true
                    if (cnt>=4)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext())
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] matrix=new int[n][m];
            for (int i=0;i<n ;i++ )
            {
                String str=sc.next();
                for (int j=0;j<m ;j++ )
                {
                    matrix[i][j]=str.charAt(j)-'0';
                }
            }
            //sum[i][j]表示
            //左上顶点matrix[0][0]到右下顶点matrix[i-1][j-1]
            //确定的的矩阵元素的和
            //例如sum[1][1]就表示matrix[0][0];
            int[][] sum=new int[n+1][m+1];
            for (int i=1;i<=n ;i++ )
            {
                for (int j=1;j<=m ;j++ )
                {
                    sum[i][j]=sum[i-1][j]+
                            sum[i][j-1]-sum[i-1][j-1]+matrix[i-1][j-1];
                }
            }
            int left=0,right=sum[n][m],res=0;
            while (left<=right)
            {
                int mid=(left+right)/2;
            /*对于题目输入示例中的情况
            输入示例
                4 4
                3332
                3233
                3332
                2323
                输出
                2
            sum矩阵为
            0 0  0  0  0
            0 3  6  9  11
            0 6  11 17 22
            0 9  17 26 33
            0 11 22 33 43
            mid依次为21->10->4->1->2
                            */
                if (judge(mid,n,m,sum))
                {
                    left=mid+1;
                    res=mid;
                }
                else
                {
                    right=mid-1;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
