package 牛客真题.笔试17年.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/21.
 */
public class 小易喜欢的单词 {
    //正则表达式的引用匹配
//    正则表达式中
//‘\1’ 匹配的是 字符 ‘\1’ 。 (因为 ‘\’ 匹配字符 ‘\’ )
//            ‘\2’ 匹配的是 字符 ‘\2’
//
//    单独斜杠的 \1 ， \2 就是反向引用了。
//            ‘\1’ 匹配的是 所获取的第1个()匹配的引用。例如，’(\d)\1’ 匹配两个连续数字字符。如33aa 中的33
//‘\2’ 匹配的是 所获取的第2个()匹配的引用。
//    例如，’(\d)(a)\1’ 匹配第一是数字第二是字符a,第三\1必须匹配第一个一样的数字重复一次，也就是被引用一次。如9a9 被匹配，但9a8不会被匹配，因为第三位的\1必须是9才可以，
//
//            ‘(\d)(a)\2’ 匹配第一个是一个数字，第二个是a，第三个\2必须是第二组（）中匹配一样的，如，8aa被匹配，但8ab，7a7不会被匹配，第三位必须是第二组字符的复制版，也是就引用第二组正则的匹配内容。
//
//    以此类推
        //标准答案，奈斯正则
//    import java.util.Scanner;
//    public class Main {
//  
//            public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String word = sc.next();
//             
//            if(isAllUpCase(word) && isConEql(word) && isThrEql(word))
//                System.out.println("Likes");
//            else
//                System.out.println("Dislikes");
//        }
//    }
//    //条件1
//             public static boolean isAllUpCase(String word){
//        return word.matches("[A-Z]+");
//    }
//    //条件2
//            public static boolean isConEql(String word){
//        return !word.matches(".*(.)(\\1).*");
                //Java中的转义要用双反斜杠，\\1表示重复第一个括号的匹配内容。
//    }
//    //条件3
                //.*匹配任意内容多次，\\1重复第一个括号的(.),\\2重复第二个括号的(.)
                //其余.*可以保证不连续或者连续的情况都考虑到
//            public static boolean isThrEql(String word){
//        return !word.matches(".*(.).*(.)(.*\\1)(.*\\2).*");
//    }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        boolean like = like(line);
        if (like) {
            System.out.println("Likes");
        }else {
            System.out.println("Dislikes");
        }
    }

    public static boolean like(String s) {
        if (s.length() == 1)return true;
        return legalcon(s) && legalSub(s);
    }

    public static boolean legalcon(String s) {
        for (int i = 0;i < s.length() - 1;i ++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean legalSub(String s) {
        int i = 0, j = 0;
        int wall = s.length();

        return false;
    }

}
