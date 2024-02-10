public class index {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n){
        //base condition:
        if(n==1){
         return n;
        }
        //kaam karo
        return n*fact(n-1);
    }
}
