public class index{
    public static void main(String[] args) {
        int n=1;
        increase(n);
    }
    public static void increase(int n){
      if(n==10){
       System.out.print(n+" ");//base class
       return;
      }
      System.out.print(n+" ");
      increase(n+1);
    }
}