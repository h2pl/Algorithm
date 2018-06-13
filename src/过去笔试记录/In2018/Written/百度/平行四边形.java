package 过去笔试记录.In2018.Written.百度;

/**
 * Created by 周杰伦 on 2018/4/18.
 */
public class 平行四边形 {
    public int[] toCompleteParallelogram(int rows, int cols,
                                         char[][] positionsInPark, int euclidX,
                                         int euclidY, int monteX, int monteY)
    {
        // WRITE YOUR CODE HERE
        int x = 0,y = 0;
        for (int i = 0;i < rows;i ++){
            for (int j = 0;j < cols;j ++) {
                if (positionsInPark[i][j] == '+') {
                    if (i == euclidX && j == euclidY) {
                        continue;
                    }else if (i == monteX && j == monteY) {
                        continue;
                    }else {
                        x = i;
                        y = j;
                        break;
                    }
                }
            }
        }
        //根据e和m算出中心点。
        int cX = (euclidX + monteX)/2;
        int cY = (monteX + monteY)/2;
        //根据中心点和帕斯卡的坐标反推毕达哥斯拉的坐标。
        int dX = 2 * cX - x;
        int dY = 2 * cY - y;
        int []res = new int[2];
        res[0] = dX;
        res[1] = dY;
        return res;
    }
    // METHOD SIGNATURE ENDS
}
