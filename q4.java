//4. Write a program to print PW SKILL using pattern programming logic.
public class q4 {
    public static void main(String[] args) {

        int n=11;
        for (int i=0; i<n ; i++)
        {


            //for P
            for(int j=0 ; j<n ; j++)
            {
                if( (j==(n-1)/4) || i==0 && j>=(n-1)/4 && j<=n-1 || i==(n-1)/2 && j>=(n-1)/4 && j<=n-1 || j==n-1 && i<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            //for W
            for(int j=0 ; j<n ; j++)
            {
                if (i+j == n-1 && j<=(n-1)/2|| i-j ==0 && j>=(n-1)/2 || j==0 || j==n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("            ");
            //for S
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || i==(n-1)/2 || i==n-1 || j==0 && i<=(n-1)/2 || j==n-1 && i>=(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");
            //for K
            for(int j=0 ; j<n ; j++)
            {
                if(i+j==(n-1)/2 || i-j==(n-1)/2 || j==0)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("");
            //for I
            for(int j=0 ; j<n ; j++)
            {
                if( (j==(n-1)/2) || i==0 || i==n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //for L
            for(int j=0 ; j<n ; j++)
            {
                if( (j==0 || i==n-1 ))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //for L
            for(int j=0 ; j<n ; j++)
            {
                if( (j==0 || i==n-1 ))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            //for S
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || i==(n-1)/2 || i==n-1 || j==0 && i<=(n-1)/2 || j==n-1 && i>=(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
