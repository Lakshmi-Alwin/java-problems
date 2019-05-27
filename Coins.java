import java.util.Scanner;
public class Coins{

    public static float maxSum(int no_coins,int first,int last,float A[]){
        int i,oddsum=0,evensum=0,sum=0;

        while (first<=last) {
            for (i = first; i < last; i = i + 2) {
                oddsum += A[i];
            }
            for (i = first + 1; i <= last; i = i + 2) {
                evensum += A[i];
            }
            if (oddsum > evensum) {
                sum+=A[first];
                first++;
            }
            else{
                sum+=A[last];
                last--;
            }
            oddsum=0;evensum=0;
            for (i = first; i < last; i = i + 2) {
                oddsum += A[i];
            }
            for (i = first + 1; i <= last; i = i + 2) {
                evensum += A[i];
            }
            if (oddsum > evensum) {

                first++;
            }
            else{
                last--;
            }
            oddsum=0;evensum=0;
        }
        return sum;

    }
    public static void main(String[] args) {
        int no_coins,i_index;
        float maxscore;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of coins");
        no_coins=sc.nextInt();
        float llist[]=new float[no_coins];
        System.out.println("Enter the values");
        for(i_index=0;i_index<no_coins;i_index++){
            llist[i_index]=sc.nextFloat();
        }
        maxscore=maxSum(no_coins,0,no_coins-1,llist);
        System.out.println(maxscore);
    }

}