public class index {
     public static void main(String[] args) {
        int n=10;
        printdes(n);
     }

  public static void printdes(int n){
  if(n==1){
    System.out.print(n+" ");
  return;
  }
  System.out.print(n+" ");
  printdes(n-1);
  }
}
