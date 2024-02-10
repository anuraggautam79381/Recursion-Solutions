public class index{
    public static void main(String[] args){
     int arr[]={1,2,3,4,66,77};
     int target=4;
     System.out.println(binarysearch(arr, 4, 0, arr.length-1));
 }
 public static int binarysearch(int arr[],int target,int s,int e){
    int m=s+(e-s)/2;
    //base case
    if(s>e){
        return -1;
         }
    //kaam karo
    if(arr[m]==target){
    return m;
    }
    if(target<arr[m]){
      return binarysearch(arr, target, s, m-1);
    }
    return binarysearch(arr, target, m+1, e);
 }   
}