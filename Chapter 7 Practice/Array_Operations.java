import java.util.Arrays;

public class Array_Operations
{
   public static void main(String[] args)
   {
       double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
       System.out.println(x.length + " " + x[0] + " " + x[x.length - 1]);
       for(int i = 0; i < x.length; i++)
       {
           System.out.println(x[i]);
       }
       System.out.print("Double: ");
       for(int a = 0; a < x.length; a++)
       {
           System.out.print(x[a] + " ");
       }
       System.out.print("\nDouble: ");
       for(int b = x.length - 1; b >= 0; b--)
       {
           System.out.print(x[b] + " ");
       }
       System.out.println();
       for(double a:x)
       {
           System.out.print(a + " ");
       }
   }
}
