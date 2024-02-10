public class index {
    public static void main(String[] args) {
        binary(3, 0, "");
    }
    public static void binary(int n,int lastplace,String str){
       //base case
       if(n==0){
         System.out.println(str);
         return;
       }
       binary(n-1, 0, str+"0");
       if(lastplace==0){
        binary(n-1, 1, str+"1");
       }
    }
}
