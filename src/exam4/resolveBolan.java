package exam4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * 输入:
 输入数据是一个单行的合法逆波兰表达式（可能存在上溢出或者下溢出，但是不会出现语法不合法的情形，比如空字符串或者存在不支持的运算符）
 输出:
 一个整数
 输入范例:
 1 1 + 2 ^ *
 输出范例:
 6
 * Created by 周杰伦 on 2017/4/26.
 *
 * 一个对于一个单行的逆波兰表达式，由如下元素构成：
 数字：十进制数字字符构成的正整数，比如 223
 运算符：支持三种运算符^+和*，分别代表自增，加法和乘法
 分隔符：一个或者多个空格
 例如下面的字符串就是个逆波兰表达式
 2 3  4 * ^ 5 +
 逆波兰表达式在一个基于栈的虚拟机中求解，虚拟机的栈能保存16个整数，虚拟机从左向右扫描表达式，遇到整数就压栈，遇到表达式则从栈顶弹出若干个整数进行计算，计算结果重新压回栈中。其中运算符^从栈顶弹出一个整数，增加1之后压栈；运算符+和*从栈顶弹出两个整数，分别做相加和相乘运算后压栈。如果遇到运算符的时候，栈内没有足够的整数，称为下溢出，返回-1；把整数压栈的时候，如果栈没有足够的空间，称为上溢出，返回-2；如果整个计算过程中没有发生溢出，在整个表达式求解完成后，返回栈顶的整数。
 */



public class resolveBolan {


            public static void main(String[] args) {

                ArrayList<Integer> inputs = new ArrayList<Integer>();
                Scanner in = new Scanner(System.in);
                String line = in.nextLine();
                if(line != null && !line.isEmpty()) {
                    int res = resolve(line.trim());
                    System.out.println(String.valueOf(res));
                }
            }

        // write your code here
        public static int resolve(String expr) {
            String []str=expr.split(" ");
            int temp=0;
            Stack<Integer>stack =new Stack<Integer>();
            int maxsize=16;
            int num1,num2;
            for(int i=0;i<str.length;i++){
                if(str[i].toCharArray()[0]=='^'){
                   if(stack.isEmpty())return -1;
                   else {
                        temp=stack.pop();
                        stack.push(temp+1);
                   }
                }
                else if(str[i].toCharArray()[0]=='*'){
                   if(stack.size()<=1)return -1;
                   else {
                       num2=stack.pop();
                       num1=stack.pop();
                       stack.push(num1*num2);
                   }

                }
                else if (str[i].toCharArray()[0]=='+'){
                    if(stack.size()<=1)return -1;
                    else {
                        num2=stack.pop();
                        num1=stack.pop();
                        stack.push(num1+num2);
                    }
                }
                else {
                    temp = Integer.parseInt(str[i]);
                    if(stack.size()>=16)return -2;
                    else {
                        stack.push(temp);
                    }
                }
            }

            return stack.peek();

        }



}
