package sort;

/**
 * Created by 周杰伦 on 2017/3/9.
 */
public class Heapsort {
    public static int[] bulidMaxHeap(int[] array)
    {
        for(int i=(array.length-2)/2;i>=0;i--)
        {
           adjustHeap(array,i,array.length);
        }
        return array;
    }

    public static void adjustHeap(int[] array,int parent,int length)
    {
        int temp=array[parent];
      for(int i=parent*2+1;i<length-1;i=i*2+1){
          if(i<length &&array[i]<array[i+1])
              i++;
          if(temp>array[i]) break;
          else {
              array[parent]=array[i];
              parent=i;
          }
          array[i]=temp;

      }
    }

    public static int[] heapsort(int []arr){
        int []array=bulidMaxHeap(arr);
        int len=arr.length;
        for(int i=len-1;i>1;i--){
            int temp=array[i];
            array[i]=array[0];
            array[0]=temp;
            adjustHeap(array,0,i);



        }
       return  arr;
    }

    public void toString(int[] array){
        for(int i:array){
            System.out.print(i+" ");
        }
    }

    public static void main(String args[]){
        Heapsort hs = new Heapsort();
        int[] array = {87,45,78,32,17,65,53,9,122};
        System.out.print("构建大根堆：");
        hs.toString(hs.bulidMaxHeap(array));
//        System.out.exam.print("\n"+"删除堆顶元素：");
//        hs.toString(hs.deleteMax(array));
//        System.out.exam.print("\n"+"插入元素63:");
//        hs.toString(hs.insertData(array, 63));
       System.out.print("\n"+"大根堆排序：");
          hs.toString(hs.heapsort(array));
    }
}
