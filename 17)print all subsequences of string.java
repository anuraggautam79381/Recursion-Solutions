public class index {
    public static void main(String[] args) {
        subsequences("abc", 0, "");
    }
    static void subsequences(String str,int idx,String newString){
        //base condition
        if(idx==str.length()){
         System.out.println(newString);
         return;
        }
        char curr=str.charAt(idx);
        //aana chahta hai
          //call 1=> 
          subsequences(str, idx+1, newString+curr);
        //nahi aana chahta
        //call 2=> 
         subsequences(str, idx+1, newString);
    }
}
