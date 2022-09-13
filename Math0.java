//Arjun Vasudevan
import java.util.*;
public class Math0
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side 1 -->");
        int side1 = (int)Math.pow(in.nextInt(),2);
        System.out.print("Enter Side 2 -->");
        int side2 = (int)Math.pow(in.nextInt(),2);
        double hyp = side2+side1;
        hyp = Math.sqrt(hyp);
        hyp=Math.round(hyp);
        System.out.println("\nThe hypotenuse of the triangle = " + (int)hyp);
        

    }
}