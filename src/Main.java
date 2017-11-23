/**
 * Created by Prasanga Fernando on 11/16/2017.
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i<5;i++){
                for (int j = 0; j<i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        /* Pattern1
            *
            **
            ***
            ****
            *****
         */


        System.out.println();//Break between two loops


        for (int i =0; i<5;i++){
            for (int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

        System.out.println();//Break between two loops

        for (int i=5;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("*");
        }

        System.out.println();//break


        for (int i=5;i>0;i--){//Latest pattern again
            for (int j=i;j>0;j--){
                System.out.print(" ");//This asterisk has been removed.




            }
            System.out.println("*");
        }
        System.out.println();
        System.out.println();

        for(int i=1;i<=5;i++) {//Odd pattern
            for (int j = 1; j <= 5 - i; j++)

            {
                System.out.print(".");//Printing "." in reverse order
            }

            for (int k = 1; k <= i * 2 - 1; k++)

            {
                System.out.print("c");
            }

            System.out.println();


        }


        //////////////////////////Even pattern
        int c = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= c; k++) {
                if (k % 2 == 0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
            c += 2;
        }

    }

}

