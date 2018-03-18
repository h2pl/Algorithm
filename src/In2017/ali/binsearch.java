package In2017.ali;

/**
 * Created by 周杰伦 on 2017/5/20.
 */
public class binsearch {
    public static void main(String []args){
        int []num = {1,2,3,5,6,8,10};
        int []num1 = {1};
        System.out.println(binfind(1,num1));
    }

    public static int binfind(int x,int []num){
        int left,right,mid;
        left = 0;
        right = num.length-1;

        while (left <= right){
            mid = (left + right)/2;
            if(x > num[mid]){
                left = mid + 1;
            }
            else if(x < num[mid]){
                right = mid - 1;
            }
            else return mid;
        }
        return -1;
    }
}
