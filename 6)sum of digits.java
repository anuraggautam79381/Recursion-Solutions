public class index {
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }
   static int sum(int n){
    //base case:
    if(n==0){
     return 0;
    }
    //kaam karege
    return (n%10)+sum(n/10);
   }
}
