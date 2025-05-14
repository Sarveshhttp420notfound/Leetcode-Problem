import java.util.ArrayList;
import java.util.List;

class Solution {
    // Function to generate the given row of Pascal's Triangle
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long value = 1;

        // Generate each element of the row
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) value);
            value = value * (rowIndex - i) / (i + 1);
        }

        return row;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.getRow(3)); // Output: [1, 3, 3, 1]
        System.out.println(sol.getRow(4)); // Output: [1, 4, 6, 4, 1]
        System.out.println(sol.getRow(5)); // Output: [1, 5, 10, 10, 5, 1]
    }
}
