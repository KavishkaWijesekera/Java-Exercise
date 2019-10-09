import java.util.Scanner;


public class lab01_1 {

    //Write a java program to print the sum of two numbers.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers to be add: ");
        int x = sc.nextInt();
        int y = sc.nextInt();


        System.out.println("The sum of two Numbers is " + (x+y));

    }

}
