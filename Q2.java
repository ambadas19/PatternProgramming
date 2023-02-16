//2. Write a program to print triangle using star pattern programming logic
public class Q2 {

    public static void main(String[] args) {

        int n=11;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i+j >= (n-1)/2 + (n-1)/2 && j<=(n-1)/2|| i>=j && j>=(n-1)/2 ||i==n-1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
