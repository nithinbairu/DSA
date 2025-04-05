import java.util.HashSet;
// import java.util.List;
import java.util.Set;
public class FindDifferentBinaryString {
    public static String findDifferentBinaryString(String[] nums){
        int n=nums[0].length();
        Set<String> newSet=new HashSet<>();
        StringBuilder ans=new StringBuilder();
        for(String num:nums){
            newSet.add(num);
        }
        for (int i = 0; i < n; i++) {
            // Creating a binary string that differs at each diagonal position
            ans.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }
        
        return ans.toString();
    }
    public static void main(String[] args) {
        String[] nums = {"00", "01"};
        System.out.println(findDifferentBinaryString(nums)); // Expected Output: "10" or "11"
        System.out.println((char)98);
        int n = 30;
        String p = "";
        int i = 0;

        while (i <n) {
            if (i % 2 == 0) {
                p = (char) (97 + (i % 26)) + p;
                
            } else {
                p = p + (char) (97 + (i % 26));
            }
            i++; // Increment i to avoid infinite loop
        }

        System.out.println(p);
    }
}
