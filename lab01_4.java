import java.util.Scanner;

public class lab01_4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your index Number: ");
        int id = sc.nextInt();
        int i = 1;

        do{
            System.out.println(id);
            i++;
        }while(i<=4);

    }

}

