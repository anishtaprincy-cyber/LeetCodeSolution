class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        String[] rows = new String[numRows];
        Arrays.fill(rows, "");

        int row = 0, dir = 1;

        for (char c : s.toCharArray()) {
            rows[row] += c;

            if (row == 0) dir = 1;
            if (row == numRows - 1) dir = -1;

            row += dir;
        }

        return String.join("", rows);
    }
}