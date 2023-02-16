//5.  Write a program to print your full name using pattern programming logic.
public class q5 {
    public static void main(String[] args) {

        int n = 11;
        for(int i=0 ; i<n ; i++)
        {
            //for A
            for(int j=0 ; j<n ; j++)
            {
                if(i==0  || i==(n-1)/2 || j==0 || j==n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            //for M
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || j==n-1 || i==j && j<=(n-1)/2 || i+j==(n-1)/2 + (n-1)/2 && j>=(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            //for B
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 && j!=n-1 || i==(n-1)/2 && j!=n-1 && i!=n-1|| j==0 || j==n-1 && i!=0 && i!=(n-1)/2 && i!=n-1|| i==n-1 && j!=n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            //for A
            for(int j=0 ; j<n ; j++)
            {
                if(i==0  || i==(n-1)/2 || j==0 || j==n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            //for D
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || i==0 && j!=n-1|| i==n-1 && j!=n-1 || j==n-1 && i!=n-1 && i!=0)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            //for A
            for(int j=0 ; j<n ; j++)
            {
                if(i==0  || i==(n-1)/2 || j==0 || j==n-1)
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

            System.out.print("             ");
            //for V
            for(int j=0 ; j<n ; j++)
            {
                if(i==j  )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //for V
            for(int j=0 ; j<n ; j++)
            {
                if(i+j==((n-1)/2 + (n-1)/2))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
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

            //for T
            for(int j=0 ; j<n ; j++)
            {
                if( (j==(n-1)/2) || i==0 )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            //for T
            for(int j=0 ; j<n ; j++)
            {
                if( (j==(n-1)/2) || i==0 )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            //for H
            for(int j=0 ; j<n ; j++)
            {
                if( (j==(n-1)/4) || j==n-1 || i==(n-1)/2 && i!=0 && j>=(n-1)/4)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            //for A
            for(int j=0 ; j<n ; j++)
            {
                if(i==0  || i==(n-1)/2 || j==0 || j==n-1)
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

            System.out.print(" ");

            //for R
            for(int j=0 ; j<n ; j++)
            {
                if((j==(n-1)/4) || (i==0 && j>=(n-1)/4) || i==(n-1)/2 && j>=(n-1)/4 || j==n-1 && i<=(n-1)/2 || i-j==((n-1)/4)+1 && j>=(n-1)/4)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            //for A
            for(int j=0 ; j<n ; j++)
            {
                if(i==0  || i==(n-1)/2 || j==0 || j==n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            //for O
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 && j>1 && j<=(3*(n-1)/4) || i==n-1 && j>1 && j<=(3*(n-1)/4)|| j==1 && i!=0 && i!=n-1 || j==n-2 && i!=0 && i!=n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("              ");
            //for D
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || i==0 && j!=n-1|| i==n-1 && j!=n-1 || j==n-1 && i!=n-1 && i!=0)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");

            //for E
            for(int j=0 ; j<n ; j++)
            {
                if( (i==0 && j>=(n-1)/4) || j==(n-1)/4 || i==(n-1)/2 && j>=(n-1)/4 || i==n-1 && j>=(n-1)/4)
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

            System.out.print("  ");

            //for H
            for(int j=0 ; j<n ; j++)
            {
                if( (j==(n-1)/4) || j==n-1 || i==(n-1)/2 && i!=0 && j>=(n-1)/4)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            //for M
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || j==n-1 || i==j && j<=(n-1)/2 || i+j==(n-1)/2 + (n-1)/2 && j>=(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            //for U
            for(int j=0 ; j<n ; j++)
            {
                if (j==0 || j==n-1 || i == n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
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

            //for H
            for(int j=0 ; j<n ; j++)
            {
                if( (j==(n-1)/4) || j==n-1 || i==(n-1)/2 && i!=0 && j>=(n-1)/4)
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
