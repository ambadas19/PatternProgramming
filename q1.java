//1. Write a program to prints Alphabets A,B,C,D,E,F,G,H, using pattern programmin logic
public class q1 {

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
            //for C
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || i==0 || i==n-1)
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

            //for F
            for(int j=0 ; j<n ; j++)
            {
                if( (i==0 && j>=(n-1)/4) || j==(n-1)/4 || i==(n-1)/2 && j>=(n-1)/4 )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            //for G
            for(int j=0 ; j<n ; j++)
            {
                if( i==0 || j==0 || (i==n-1 && j<(3*(n-1)/4)) || j==(3*(n-1)/4) && i>=(n-1)/2 || i==(n-1)/2 && j>=(n-1)/2 && j!=n-1)
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


            System.out.println();
        }
    }
}
