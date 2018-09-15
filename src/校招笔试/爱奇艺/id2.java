package 校招笔试.爱奇艺;

/**
 * Created by 周杰伦 on 2018/9/15.
 */
import java.util.Arrays;
import java.util.Scanner;

public class id2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = 0;
        int end = 0;

        for(int i = 0; i<3; i++){
            start += Integer.parseInt(str.charAt(i)+"");
        }
        for(int i = 3; i<6; i++){
            end += Integer.parseInt(str.charAt(i)+"");
        }
        if(start<end){
            int tmp = end - start;
            int count = 0;
            String[] f = str.substring(0, 3).split("");
            int[] arr = new int[3];
            for(int j=0; j<f.length; j++){
                arr[j] = Integer.parseInt(f[j]);
            }
            sort(arr);
            while(tmp>0){
                tmp -= 9-arr[count];
                count++;
            }
            System.out.println(count);
        }else if(start>end){
            int tmp = start - end;
            int count = 0;
            String[] f = str.substring(3, 6).split("");
            int[] arr = new int[3];
            for(int j=0; j<f.length; j++){
                arr[j] = Integer.parseInt(f[j]);
            }
            sort(arr);
            while(tmp>0){
                tmp -= 9-arr[count];
                count++;
            }
            System.out.println(count);
        }else{
            System.out.println("0");
        }
    }

    public static void sort(int[] numbers)
    {
        int temp = 0;
        int size = numbers.length;
        for(int i = 0 ; i < size-1; i ++)
        {
            for(int j = 0 ;j < size-1-i ; j++)
            {
                if(numbers[j] > numbers[j+1])  //交换两数位置
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
