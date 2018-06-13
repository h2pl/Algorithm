package mianshi.toutiao;

import java.util.ArrayList;

/**
 * Created by 周杰伦 on 2018/3/11.
 */
public class karray {
    public int mid() {

        //2
        //3
        //123
        //4
        //4567

        int n = 0;//数组总个数
        int []len = new int[n];//数组长度
        for (int i = 0 ; i < len.length; i ++) {
            ArrayList<Integer> list = new ArrayList<>();


        }


        return 1;
    }

    public int num (int x, int []arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i<j) {
            int mid = (i+j)/2;
            if(arr[mid] < x) {
                i = mid + 1;
                if(i<j){
                    continue;
                }
                else return mid +1;
            }
            else if(arr[mid] > x) {
                j = mid -1;
                if(i<j){
                    continue;
                }
                else return mid;
            }
            return mid;
        }

        return i;
    }
    public static void main(String[] args) {

    }
}
