/**
 * Created by Prasanga Fernando on 11/16/2017.
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i<5;i++){
                for (int j = 0; j<i; j++){
                    System.out.print("*");
                }
                System.out.println("*");
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








    }






}

