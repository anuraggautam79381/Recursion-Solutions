import java.util.HashSet;

public class index {
 public static void main(String[] args) {
    HashSet<String> set=new HashSet<>();
    subsequences("aaa", 0, "",set);
 }
 static void subsequences(String str,int idx,String newString,HashSet<String> set){
    if(idx==str.length()){
        if(set.contains(newString)){
            return;
        }
        else
        System.out.println(newString);
        set.add(newString);
      return;
    }
    char curr=str.charAt(idx);
    //aana chahta hai
    subsequences(str, idx+1, newString+curr,set);
    //nahi aana chahta
    subsequences(str, idx+1, newString,set);
 }
    
}