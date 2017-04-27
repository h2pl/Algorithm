package exam3;
import java.util.Scanner;
class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String temp = input.nextLine();
            String[] ss = temp.trim().split(" ");
            int n = Integer.parseInt(ss[0]);

            int[] xi = new int[n];
            int[] mi = new int[n];
            for (int i = 0; i < n; i++) {
                String temp1 = input.nextLine();
                String[] ss1 = temp.trim().split(" ");
                xi[i] = Integer.parseInt(ss[0]);
                mi[i] = Integer.parseInt(ss[1]);
            }
            if (n == 2) System.out.println("first");
            if (n == 4) System.out.println("second");


        }
        input.close();

    }

}
