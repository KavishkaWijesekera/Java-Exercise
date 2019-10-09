import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lab01_3
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input the two Numbers: ");
        double x = Double.parseDouble(br.readLine());
        double y = Integer.parseInt(br.readLine());

        System.out.println("Enter operation to be Done: ");
        String operation = br.readLine();

        if (operation.equals("+"))
        {
            System.out.println("The addition of two numbers: "+(x+y));
        }

        else if (operation.equals("-"))
        {
            System.out.println("The subtraction of two numbers: "+(x-y));
        }

        else if (operation.equals("/"))
        {
            System.out.println("The addition of two numbers: "+(x/y));
        }

        else if (operation.equals("*"))
        {
            System.out.println("The addition of two numbers: "+(x*y));
        }
    }

}
