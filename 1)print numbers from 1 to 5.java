public class index{
    public static void main(String[] args) {
        number(1);
    }
    public static void number(int n){
      //base case
    if(n==5){
   System.out.println(n);
   return;
    }
      //kaam karo
      System.out.println(n);
      number(n+1);
    }
}