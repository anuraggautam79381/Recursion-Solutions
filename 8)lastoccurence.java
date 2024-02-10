public class index {
    public static void main(String[] args) {
        int[] arr={8,3,6,9,5,10,2,5,3};
       System.out.println(lastoccurence(arr, 5, 0));
    }
    public static int lastoccurence(int[] arr,int key,int i) {
        if(i==arr.length){
           return -1;//base case
        }
          //look forward then compare with self
          int lastindex=lastoccurence(arr, key, i+1);
          if(lastindex==-1 && key==arr[i]){
              return i;
          }
          return lastindex;
    }
}
