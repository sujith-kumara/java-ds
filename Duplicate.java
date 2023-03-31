
import java.util.HashSet;
import java.util.Set;
public class Duplicate{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,1};
        Set<Integer> seen = new HashSet<Integer>();
        for(int i = 0; i < arr.length;i++){
            if(seen.contains(arr[i])){
                System.out.println("Array contains duplicates");
                return;
            }
            seen.add(arr[i]);
        }

    }
}