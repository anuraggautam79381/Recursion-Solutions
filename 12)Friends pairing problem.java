public class kmps{
  public static void main(String[] args) {
    System.out.println(friendspairing(3));
  }
  public static int friendspairing(int n){
    //base case
    if(n==1 || n==2){
       return n;
    }
    //kaam for single and pairing
    return friendspairing(n-1)+n-1*friendspairing(n-2);
  }
}
