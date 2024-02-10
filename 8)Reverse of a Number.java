public class index {
    static int sum=0;
    public static void main(String[] args) {
        reverse(1824);
        System.out.println(sum);
    }
    static void reverse(int n){
        //base condition:
        if(n==0){
             return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
}
