public class index {
    public static void main(String[] args) {
       permutation("abc", "");
    } 
     static void permutation(String str,String newString){
     //base condition
     if(str.length()==0){
        System.out.println(newString);
        return;
     }

     for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        String s1=str.substring(0, i);
        String s2=str.substring(i+1);
        String sum=s1+s2;
        permutation(sum, newString+ch);
     }
    }
}
