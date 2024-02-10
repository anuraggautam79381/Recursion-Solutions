public class index {
    public static void main(String[] args) {
        int n=4;
        System.out.println(sum(n));
    }
    public static int sum(int n){
     if(n==1){
      return 1;//base class
     }
     int s=n+sum(n-1);//jo chahiye result
     sum(n-1);//inner function
     return s;
    }
}
