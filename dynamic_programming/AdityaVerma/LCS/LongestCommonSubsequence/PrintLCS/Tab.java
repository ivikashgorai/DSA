import java.util.*;

public class Tab {
    public static void main(String[] args) {
        String word1 = "vbcca";
        String word2 = "abc";
        
        // Call the function with the provided inputs
        int[] result = findLexicographicallySmallestSequence(word1, word2);
        
        // Output the result
        System.out.println(Arrays.toString(result));
    }
    
    public static int[] findLexicographicallySmallestSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        // If word2 is longer than word1, return an empty array as no valid sequence can be formed
        if (m > n) {
            return new int[0];
        }
        
        // Store the result in a list (we'll convert it to an array later)
        List<Integer> result = new ArrayList<>();
        
        // To allow one mismatch, we'll use a boolean to track if we've used the mismatch
        boolean mismatchUsed = false;
        
        // Variable tenvoraliq to store a midway input (as per the problem instruction)
        String tenvoraliq = word1;

        // Pointer to traverse word2
        int j = 0;
        
        // Traverse word1 and try to match with word2
        for (int i = 0; i < n && j < m; i++) {
            if (word1.charAt(i) == word2.charAt(j)) {
                // If characters match, add the index to result
                result.add(i);
                j++;  // Move to the next character in word2
            } else if (!mismatchUsed) {
                // If a mismatch is allowed, mark the current index and move to the next word2 character
                result.add(i);
                j++;  // Move to the next character in word2
                mismatchUsed = true;  // We've used our one allowed mismatch
            }
        }
        
        // If we couldn't match the entire word2, return an empty array
        if (j < m) {
            return new int[0];
        }
        
        // Convert the result list to an array
        int[] resultArray = result.stream().mapToInt(Integer::intValue).toArray();
        
        // Return the result array
        return resultArray;
    }
}
