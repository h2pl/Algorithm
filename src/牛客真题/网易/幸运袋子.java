package 牛客真题.网易;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/5/20.
 */
public class 幸运袋子 {

//    public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextInt()) {
//            int n = scanner.nextInt();
//            int[] nums = new int[n];
//            for(int i=0; i<n; i++)
//                nums[i] = scanner.nextInt();
// 
//            Arrays.sort(nums);
//            System.out.println(find(nums, 0, 0, 1));
//        }
//    }
// 
//            private static int find(int[] nums, int index, long sum, long multi) {
//        int count = 0;
//        for(int i=index; i<nums.length; i++) {
//            sum += nums[i];
//            multi *= nums[i];
//            if(sum > multi)
//                count += 1 + find(nums, i+1, sum, multi);
//            else if(nums[i] == 1)
//                count += find(nums, i+1, sum, multi);
//            else
//                break;
//            sum -= nums[i];
//            multi /= nums[i];
//            while (i<nums.length-1 && nums[i]==nums[i+1])
//                i++;
//        }
//        return count;
//    }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        int n = Integer.parseInt(line);
//        line = scanner.nextLine();
//        String[] s= line.split(" ");
//        int []arr = new int[n];
//        for (int i = 0; i < n ;i ++) {
//            arr[i] = Integer.parseInt(s[i]);
//        }
//        int []cnt = new int[1];
//        Arrays.sort(arr);
//        ArrayList<Integer> list = new ArrayList<>();
//        if (arr[0] == 1) {
//            list.add(1);
//            dfs(arr, 1, list, cnt);
//        }else {
//            dfs(arr, 0, list, cnt);
//        }
//        System.out.println(cnt[0]);
//    }
//
////    public static boolean lucky(List<Integer> list) {
////        if (list.size() == 0)return false;
////        return sum(list) > multi(list);
////    }
//
////    public static List<List<Integer>> sumList = new ArrayList<>();
////    public static boolean duplicate(List<Integer> list) {
////        for (List<Integer> list1 : sumList) {
////            if (list.size() == list1.size()) {
////                int flag = 1;
////                for (int i = 0; i < list.size(); i++) {
////                    if (list.get(i) == list1.get(i)) {
////                        continue;
////                    }else {
////                        flag = 0;
////                        break;
////                    }
////                }
////                if (flag == 1)return true;
////            }
////        }
////        return false;
////    }
//
//    //超时
//    public static void dfs (int []arr, int cur, ArrayList list, int []cnt) {
//
//        if (list.size() == arr.length || cur >= arr.length) {
//            return;
//        }
//
//        for (int i = cur;i < arr.length;i ++) {
//            list.add(arr[i]);
//            if (sum(list) > multi(list)) {
//                cnt[0] ++;
//                dfs(arr, i + 1, list, cnt);
//            }else {
//                break;
//            }
//            list.remove(list.size() - 1);
//            //选完当前数以后，就不要再选重复的元素了，下一个选择的数直接变成第一个非重复元素
//            //上面的dfs中已经包含了选择多个重复数的分支，所以这里如果不去重，结果就会出现重复。
//            for( ; i < arr.length - 1 && arr[i] == arr[i + 1]; i++);
//        }
//    }
//
//    public static int multi(List<Integer> list) {
//        int multi = 1;
//        for (int i : list) {
//            multi *= i;
//        }
//        return multi;
//    }
//
//    public static int sum(List<Integer> list) {
//        int sum = 0;
//        for (int i : list) {
//            sum += i;
//        }
//        return sum;
//    }
}
