import java.util.Scanner;
public class StaircaseProblem {
    static int count=0;
    public static void ways(int n){
        if(n==1){
            count++;
            return;
        }
        else if(n==2){
            count++;
            ways(n-1);
        }
        else if(n==3){
            count++;
            ways(n-1);
            ways(n-2);
        }
        else{
            ways(n-1);
            ways(n-2);
            ways(n-3);
        }
    }

    public static void main(String[] args) {
        int nosteps;
        System.out.println("Enter the number of steps");
        Scanner sc=new Scanner(System.in);
        nosteps=sc.nextInt();
        ways(nosteps);
        System.out.println("Number of ways of climbing the stairs is "+count);
    }
}
