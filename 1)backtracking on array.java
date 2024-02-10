public class index {
    public static void main(String[] args) {
        int arr[]=new int[5];
        array(arr, 0, 1);
        printarr(arr);
    }
   static void printarr(int arr[]){
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
      }
      System.out.println();
   }

    static void array(int arr[],int i,int value){
          //base case
          if(i==arr.length){
            printarr(arr);
            return;
          }
          //kaam(recursion)
        arr[i]=value;
        array(arr, i+1, value+1);
        //backtrack
        arr[i]=arr[i]-2;
    }
}
