//package 校招笔试.拼多多.第二波;
//
//import java.util.Scanner;
//
///**
// * Created by 周杰伦 on 2018/8/30.
// */
//public class 循环小数 {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        loop(a, b);
//    }
//
//    public static int loop(int a,int b){
//        if(a % b == 0){
//            System.out.println("0 0");
//            return 0;
//        }
//        a %= b;
//        unordered_map<, int> map;
//        int index = 1;
//        while(a != 0 && map.find(a) == map.end()){
//            map[a] = index;
//            a *= 10;
//            a = a % b;
//            index++;
//        }
//        if(a != 0){
//            cout<<map[a] - 1<<" "<<index - map[a]<<endl;
//        }
//        else{
//            cout<<index - 1<<" "<<0<<endl;
//        }
//        return 0;
//    }
////    public static void loop(int a, int b) {
////
////    }
//}
