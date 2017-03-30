package exam2;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/3/29.
 */
public class bagPro {
    static class Bag{
        public int weight;
        public int value;
    }

    public static int bestBag(Bag[] bag,int n, int limit){
        if(n==0 || limit==0)
            return 0;
        else{
            for(int i=n-1;i>=0;i--){
                if(bag[i].weight>limit){
                    return bestBag(bag,n-1,limit);
                }else{
                    int temp1=bestBag(bag,n-1,limit);
                    int temp2=bestBag(bag,n-1,limit-bag[i].weight)+bag[i].value;
                    return temp1>temp2?temp1:temp2;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp0 = input.nextLine();
        int Num = Integer.valueOf(temp0);



        int[] Value = new int[Num];
        int[] Weight = new int[Num];

        String temp1 = input.nextLine();
        String[] s1 = temp1.trim().split(" ");

        for (int i = 0; i < Value.length; i++) {
            Value[i] = Integer.parseInt(s1[i]);
        }

        String temp2 = input.nextLine();
        String[] s2 = temp2.trim().split(" ");

        for (int i = 0; i < Value.length; i++) {
            Weight[i] = Integer.parseInt(s2[i]);
        }
        int limit=input.nextInt();

        input.close();

        Bag[] bag = new Bag[Num];
        for(int i=0;i<Num;i++){
            bag[i]=new Bag();
            bag[i].weight=Weight[i];
            bag[i].value=Value[i];
        }

        System.out.println(bestBag(bag,Num,limit));









    }
}
