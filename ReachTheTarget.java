package lesson3;
import java.util.*;

class ReachTheTarget {
    public static boolean ReachTarget(int a,int b,int c,int d){
        if(a<=c && d>0){
           
            return ReachTarget(a+b,b,c,d-1);
        }
        else if(a>=c && d>0){
            return ReachTarget(a-b,b,c,d-1);
        }
        else if(d==0 && a==c){
            return true;
        }
        else{
            return false;
        }
        
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(ReachTarget(a,b,c,d))
                System.out.println("yes");
            else
                System.out.println("no");
        }
	}
}