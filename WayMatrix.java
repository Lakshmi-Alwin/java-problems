import java.util.Scanner;
import java.lang.Math;
public class WayMatrix {
    static int count=0;
    public static int adventurous(int[][] A, int n, int iindex, int jindex){
        if((iindex ==(n-1)) && (jindex ==(n-1))){
            count++;
            return ((A[iindex][jindex])%1000000007);
        }
        if(A[iindex][jindex]==1 && jindex <(n-1)){
            return ((1+ adventurous(A,n, iindex, jindex +1))%1000000007);
        }
        else if(A[iindex][jindex]==2 && iindex <(n-1)){
            return ((2+ adventurous(A,n, iindex +1, jindex))%1000000007);
        }
        else if(A[iindex][jindex]==3){
            if(jindex <(n-1) && iindex <(n-1)){
                return (Math.max((3+ adventurous(A,n, iindex, jindex +1)),(3+ adventurous(A,n, iindex +1, jindex)))%1000000007);
            }
            else if(jindex <(n-1)){
                return ((3+ adventurous(A,n, iindex, jindex +1))%1000000007);
            }
            else{
                return ((3+ adventurous(A,n, iindex +1, jindex))%1000000007);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n,iindex,jindex;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int A[][]=new int[n][n];
        for(iindex=0;iindex<n;iindex++){
            for(jindex=0;jindex<n;jindex++){
                A[iindex][jindex]=sc.nextInt();
            }
        }
        int s= adventurous(A,n,0,0);
        //s=s%1000000007;
        if(count==0){
            s=0;
        }
        System.out.println("total no.ways is "+count+" and adventurous path is "+s);
    }
}
