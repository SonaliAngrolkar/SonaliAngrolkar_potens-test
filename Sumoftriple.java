package secondprogram;

public class Sumoftriple
{
    boolean number(int A[], int a_size, int sum)
    {
       
        for (int i = 0; i < a_size - 2; i++) {
 
           
            for (int j = i + 1; j < a_size - 1; j++) {
 
               
                for (int k = j + 1; k < a_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
 
   
    public static void main(String[] args)
    {
    	Sumoftriple triplet = new Sumoftriple();
        int A[] = { 1, 2,6,9,3 };	
        int sum = 13;
        int a_size = A.length;
 
        triplet.number(A, a_size, sum);
    }
}
    