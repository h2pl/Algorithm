package 过去笔试记录.In2017.exam;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 周杰伦 on 2017/3/24.
 * 有两个有序的集合，集合的每个元素都是一段范围，求其交集.
 * 例如集合{[4,8],[9,13]}和{[6,12]}的交集为{[6,8],[9,12]}
 */
public class CommonArray {
    public ArrayList<Integer []> CommonArray(ArrayList<Integer []> arrayList1,ArrayList<Integer []> arrayList2){
        Iterator<Integer []> iterator1=arrayList1.listIterator();
        Iterator<Integer []> iterator2=arrayList2.listIterator();
        Integer[] arr1;Integer[] arr2;
        Integer[] temp=new Integer[2];

        ArrayList<Integer []>arrayList=new ArrayList<>();
        while (iterator1.hasNext() && iterator2.hasNext()){
            arr1=iterator1.next();
            arr2=iterator2.next();

            if(arr1[0]>arr2[0]){
                if(arr1[0]>arr2[1])return null;
                else if(arr1[1]>arr2[1]){
                    temp[0]=arr1[0];
                    temp[1]=arr2[1];
                }
                else {
                    temp=arr1;
                }

            }
            else {
                if(arr1[1]<arr2[0]){
                    temp=null;
                }
                else if(arr1[1]>arr2[1]){
                    temp[0]=arr2[1];
                    temp[1]=arr1[1];
                }
                else {
                    temp[0]=arr2[0];
                    temp[1]=arr1[1];
                }

            }
            arrayList.add(temp);

        }
        return arrayList;
    }
}
