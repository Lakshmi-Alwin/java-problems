import java.util.Scanner;
public class TowerOfHanoy {
    public static void steps(int n,char start,char stop,char support){
        if(n==1){
            System.out.println(start+" - "+stop);
            return;
        }
        else{
            steps(n-1,start,support,stop);
            System.out.println(start+" - "+stop);
            steps(n-1,support,stop,start);
        }
    }

    public static void main(String[] args) {
        int n;
        char A='A',B='B',C='C';
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        steps(n,A,B,C);
    }
}
