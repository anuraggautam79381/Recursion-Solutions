public class index{
    public static void main(String[] args) {
        numbers(5);
    }
    public static void numbers(int n){
    //base case
    if(n==1){
      System.out.println(n);
      return;
    }
    System.out.println(n);
    numbers(n-1);
    }
}
