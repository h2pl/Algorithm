package 牛客往年真题.笔试16年.美团;

/**
 * Created by 周杰伦 on 2018/6/26.
 */
public class 直方图内最大矩形 {
    public static void main(String[] args) {
        int []A = {2,7,9,4,1};
        System.out.println(countArea(A, 5));
    }
    public static int countArea(int[] A, int n) {
        // write code here
        int max = 0;
        for (int i = 0;i < n;i ++) {
            for (int j = i + 1;j < n;j ++ ) {
                int min = Integer.MAX_VALUE;
                for (int k = i;k <= j && k < n;k ++) {
                    min = Math.min(min, A[k]);
                }
                max = Math.max(max, min * (j - i + 1));
            }
        }
        return max;
    }

    //优化方案
//    链接：https://www.nowcoder.com/questionTerminal/13ba51c3fec74b58bbc8fa8c3eedf877
//    来源：牛客网
//
//    int i,j,L1,L2;
//    int max=0;
//    for(i=0;i<n;i++)
//                {
//        L1=0;L2=0;
//        for(j=i;j<n;j++)
//        {
//            if(A[j]>=A[i])L1++;
//            else break;
//                 
//        }
//        for(j=i-1;j>=0;--j)
//        {
//            if(A[j]>=A[i])L2++;
//            else break;    
//        }
//        area=(L1+L2)*A[i];
//        if(area>max)max=area;
//    }
//    //printf("max area:%d\n",max);
//            return max;
}
