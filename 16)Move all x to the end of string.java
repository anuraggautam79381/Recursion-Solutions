public class index {
    public static void main(String[] args) {
      move("axbcxxd", 0, 0, "");
    }
    static void move(String str,int idx,int count,String newString){
        //base condition
        if(idx==str.length()){
            for(int i=0;i<count;i++){
             newString+='x';
            }
           System.out.print(newString);
           return;
        }
        char curr=str.charAt(idx);
        if(curr=='x'){
          count++;
          move(str, idx+1, count, newString);
        }
        else{
            newString+=curr;
            move(str, idx+1, count, newString);
        }
    }
    }
    
    
