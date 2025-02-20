import java.util.Scanner;

public class Prefix_of_Array_String {
    public static int solve(Scanner sc) {
        int ans = 0;
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        if (n <= 0) return -1; // Handle edge case of no strings
        
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }

        if (n == 1) return s[0].length(); // Single string: full length is prefix
        
        String first = s[0];
        String last = s[s.length - 1];
        int minLength = Math.min(first.length(), last.length());
        
        while (ans < minLength && first.charAt(ans) == last.charAt(ans)) {
            ans++;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = solve(sc);
        System.out.println("Common prefix length: " + result);
    }
}
