import java.util.Scanner;



public class lab01_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number to get the square root: ");
        int num = sc.nextInt();

        System.out.println("Math.sqrt(" + num + ")=" + Math.sqrt(num));
    }

}
