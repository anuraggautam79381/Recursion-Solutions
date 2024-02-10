public class index {
    public static void main(String[] args) {
       System.out.println(tilingproblem(3));
    }
    public static int tilingproblem(int n){
         if(n==0 || n==1){
           return 1;
         }
         //kaam
         int fn1=tilingproblem(n-1);
         int fn2=tilingproblem(n-2);
         int totalways=fn1+fn2;
         return totalways;
    }
}
