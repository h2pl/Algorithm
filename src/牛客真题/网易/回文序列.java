package 牛客真题.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/23.
 */
public class 回文序列 {
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
