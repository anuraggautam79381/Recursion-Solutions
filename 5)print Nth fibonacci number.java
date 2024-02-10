public class index{
  public static void main(String[] args) {
    int n=4;
    System.out.println(fibo(n));
  }

  public static int fibo(int n){
    if(n==0 || n==1){
        return n;
    }
  int a=fibo(n-1);
  int b=fibo(n-2);
  int sum=a+b;
  return sum;
  }
} 