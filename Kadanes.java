public class Kadanes{
    public static void main(String[] args){
        int[] arr = {-1,-3,4,-1,-2,1,5,-3};
        int maxsum = arr[0];
        int currentsum = arr[0];
        for (int i = 0; i< arr.length;i++){
            currentsum = Math.max(arr[i],currentsum+arr[i]);
            maxsum = Math.max(maxsum,currentsum);
        }
        System.out.println("Max = "+ maxsum);
    }
}