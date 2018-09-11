package 校招笔试.宜信;

/**
 * Created by 周杰伦 on 2018/9/11.
 */
import javax.swing.*;
import java.util.*;
public class one {


        static List<List<int[]>> res = new ArrayList<>();
        public static void main(String[] args) {
            HashMap<Integer, Integer> map = new HashMap();
            Set<Integer> set = map.keySet();
            TreeMap<Integer, Integer> map1 = new TreeMap<>();
            Set<Integer> set1 = map1.descendingKeySet();
            for (int i : set) {

            }

            Scanner sc = new Scanner(System.in);
            List<int[]> list = new ArrayList<>();
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int i = 0;
            while (i < strs.length) {
                int[] arr = new int[2];
                arr[0] = Integer.valueOf(strs[i]);
                arr[1] = Integer.valueOf(strs[i + 1]);
                list.add(arr);
                i += 2;
            }
            for( i=0;i<list.size();i++){
                List<int[]> temp= new ArrayList<>();
                temp.add(list.get(i));
                List target=new ArrayList(list);
                target.remove(i);
                solution(temp,target);
            }
            int maxSize=Integer.MIN_VALUE;
            int index=-1;
            for(i=0;i<res.size();i++){
                List temList=res.get(i);
                if(temList.size()>maxSize){
                    maxSize=temList.size();
                    index=i;
                }
            }
            List<int[]> result=res.get(index);
            for(int[] arr:result){
                System.out.print("("+arr[0]+", "+arr[1]+") ");
            }
        }
        static void solution(List<int[]> temp,List<int[]>target){
            if(target.size()==0){
                res.add(temp);
                return;
            }
            int[] arr=temp.get(temp.size()-1);
            for(int i=0;i<target.size();i++){
                int []tempArr=target.get(i);
                if(arr[1]<tempArr[0]){
                    List newList = new ArrayList(target);
                    newList.remove(i);
                    List newTemp = new ArrayList(temp);
                    newTemp.add(tempArr);
                    solution(newTemp,newList);
                }else{
                    List newList = new ArrayList(target);
                    newList.remove(i);
                    List newTemp = new ArrayList(temp);
                    solution(newTemp,newList);
                }
            }
        }

}
