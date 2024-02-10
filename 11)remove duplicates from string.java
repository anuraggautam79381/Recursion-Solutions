public class index{
    public static void main(String[] args) {
        String str="appnnacollege";
        removeduplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
    public static void removeduplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        //base case
        if(idx==str.length()){
           System.out.println(newstr);
           return;
        }
        //kaam
        char ch=str.charAt(idx);
        if(map[ch-'a']==true){
           //duplicates
           removeduplicates(str, idx+1, newstr, map);
        }
        else{
          map[ch-'a']=true;
          removeduplicates(str, idx+1, newstr.append(ch), map);
        }
    }
}
