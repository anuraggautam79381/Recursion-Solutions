public class index {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(sorted(arr, 0));
    }
    public static boolean sorted(int[] arr,int i){
     if(i==arr.length-1){
       return true;//base case
     }
     if(arr[i]>arr[i+1]){//kaam karo -> check for two number
       return false;
     }
     return sorted(arr,i+1);//inner function(i+1)
    }
}
