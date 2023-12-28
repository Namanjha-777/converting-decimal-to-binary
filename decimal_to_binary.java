import java.util.*;
class decimal_to_binary{
    public static int conversion(int a){
        int b=0,s=0,c=a;
        while(a!=0){
            b=a%2;
            a/=2;
            s=s*10+b;
        }int r=0;
        while(s!=0){
            b=s%10;
            r=r*10+b;s/=10;
        }return r;
    }
    public static void main(){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int d=conversion(n);
        System.out.println("binary form="+d);
    }
    
}