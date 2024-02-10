public class index{
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
   if(n==0){
   return 1;
   }
   int sp=n*fact(n-1);
   int bp=fact(n-1);
   return sp;
    }
}