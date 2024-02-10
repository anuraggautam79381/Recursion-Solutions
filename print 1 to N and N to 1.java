import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        number(n);
        System.out.println();
        number2(n1);
    }
    static void number(int n){
      if(n==10){
        return;
      }
      System.out.print(n+" ");
      number(n+1);
    }
    static void number2(int n1){
     if(n1==1){
        System.out.print(n1+" ");
        return;
     }
     System.out.print(n1+" ");
     number2(n1-1);
    }
}