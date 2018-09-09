package 校招笔试.京东;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/9.
 */
public class 完全多部图 {




        public static int[][] map;
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int numbers = sc.nextInt();
            while (numbers -- > 0){
                int n = sc.nextInt();
                int e = sc.nextInt();
                map = new int[n + 5][n + 5];

                for(int i = 0; i < e; i++){
                    int startNode = sc.nextInt();
                    int endNode = sc.nextInt();
                    map[startNode][endNode] = 1;
                    map[endNode][startNode] = 1;
                }
                boolean isRight = true;
                outer:{
                    for(int i = 1; i <= n; i++){
                        for(int j = 1; j <= n; j++){
                            if(j == i) continue;
                            if(map[i][j] != 1 ){
                                for(int k = 1; k <= n; k++){
                                    if(map[i][k] != map[j][k]){
                                        isRight = false;
                                        break outer;
                                    }
                                }
                            }
                        }
                    }
                }

                if(isRight){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }



}
