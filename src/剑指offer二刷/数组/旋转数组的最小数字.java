package 剑指offer二刷.数组;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 旋转数组的最小数字 {
    public static void main(String[] args) {
        int []arr = {3,4,5,6,1,2};
        System.out.println(rotateMin(arr));
    }
    public static int rotateMin(int []arr) {
        for (int i = 1;i < arr.length;i ++) {
            if (arr[i - 1] > arr[i]) {
                return arr[i];
            }
        }
        return arr[0];
    }
}
