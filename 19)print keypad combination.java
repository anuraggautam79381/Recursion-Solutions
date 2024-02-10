public class index {
    static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        keypadcombination("23", 0, "");
    }
    static void keypadcombination(String str,int idx,String combination){
        if(idx==str.length()){
         System.out.println(combination);
         return;
        }
      char curr=str.charAt(idx);
      String mapping=keypad[curr-'0'];
      for(int i=0;i<mapping.length();i++){
       keypadcombination(str, idx+1, combination+mapping.charAt(i));
      }
    }

}
