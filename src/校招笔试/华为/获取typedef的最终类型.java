package 校招笔试.华为;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by 周杰伦 on 2018/8/8.
 */
public class 获取typedef的最终类型 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String def = scanner.nextLine();
        String name = scanner.next();
        System.out.println(printName(def, name));
    }
    public static String printName(String def, String name) {
        String []arr = def.split(";");
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0;i < arr.length;i ++) {
            String[] defArr = arr[i].split(" ");
            if (defArr.length != 3 && defArr.length != 4){
                return "none";
            }
            if (defArr[0].equals("typedef")) {
                if (!defArr[1].contains("*") && !legal(defArr[1])) {
                    return "none";
                }else {
                    map.put(defArr[2], defArr[1]);
                }
            } else if (defArr[1].equals("typedef")){
                if (!defArr[2].contains("*") && !legal(defArr[2])) {
                    return "none";
                }else {
                    map.put(defArr[3], defArr[2]);
                }
            } else {
                return "none";
            }
        }
        if (!map.containsKey(name)) {
            return "none";
        }else {
            int num = 0;
            String val = map.get(name);
            String s1 = val.substring(0, val.length() - 1);
            String s2 = s1.substring(0, s1.length() - 1);
            while (map.containsKey(val) || map.containsKey(s1) || map.containsKey(s2)) {
                if (map.containsKey(val)) {
                    val = map.get(val);
                    num = 0;
                }
                else if (map.containsKey(s1)) {
                    val = map.get(s1);
                    num = 1;
                }
                else {
                    val = map.get(s2);
                    num = 2;
                }
                s1 = val.substring(0, val.length() - 1);
                s2 = s1.substring(0, val.length() - 1);
            }
            for (int i = 0;i < num;i ++) {
                val = val + " *";
            }
            return val;
        }
    }

    public static boolean legal(String type) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("int", 1);
        map.put("short", 1);
        map.put("long", 1);
        map.put("float", 1);
        map.put("double", 1);
        map.put("char", 1);
        return map.containsKey(type);
    }
}

