import java.util.Scanner;

public class lab01_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two inputs: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("---Before Swap---");
        System.out.println("First Number "+x);
        System.out.println("Second Number "+y);

        int temporary = x;

        x = y;

        y = temporary;
        System.out.println("---After Swap---");
        System.out.println("First Number "+x);
        System.out.println("Second Number "+y);
    }

}
