package 校招笔试.头条.头条三轮;

/**
 * Created by 周杰伦 on 2018/9/9.
 */
import java.util.Scanner;

public class utf8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String []ss = s.split(",");
        int []arr = new int[ss.length];
        for (int i = 0;i < arr.length;i ++) {
            arr[i] = Integer.parseInt(ss[i]);
        }
        System.out.println(validUtf8(arr));
    }
    public static boolean validUtf8(int[] data) {
        if (data == null || data.length == 0) return false;
        int i = 0;
        while (i < data.length) {
            int cur = data[i++];
            int bytes = 0;
            for (int j = 7; j >= 3; j--) {
                if ((cur & (1 << j)) != 0) bytes++;
                else break;
            }
            if (bytes > 4 || bytes == 1) return false;
            while (bytes - 1 > 0) { // > 0 not >= 0
                if (i >= data.length || (data[i] & (1 << 7)) == 0 || (data[i] & (1 << 6)) != 0) {
                    return false;
                }
                bytes--;
                i++;
            }
        }
        return true;
    }
}