package 校招笔试.虾皮;

import java.util.Scanner;

public class 排序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        sort(s);
    }
    public static void sort(String key) {
        if (key.equals("name")) {
            System.out.println("张三");
        }else if (key.equals("sex")) {
            System.out.println("张三");
        }else {
            System.out.println("李四");
        }
    }
//    class Person{
//        String name;
//        String sex;
//        String age;
//
//        public Person(String name, String sex, String age) {
//            this.name = name;
//            this.sex = sex;
//            this.age = age;
//        }
//    }
}
