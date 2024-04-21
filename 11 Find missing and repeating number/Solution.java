import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n = A.size();
        int repeat = 0; 
        int miss = 0;
        
        int x[] = new int[n+1];
        
        for(int i=0; i<n; i++){
            x[A.get(i)]++;
        }
        
        for(int i=0; i<=n; i++){
            if(x[i] > 1){
                repeat = i;
            }
            if(x[i] == 0){
                miss = i;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeat);
        result.add(miss);
        return result;
        }

    public static void main(String args[]){
        List<Integer> A = new ArrayList<>();
        A.addAll(List.of(4,5,3,4,2,1));
        Solution solution = new Solution(); 
        ArrayList<Integer> result = solution.repeatedNumber(A);
        System.out.println("Missing: " + result.get(1) + ", Repeated: " + result.get(0));
    }
}
