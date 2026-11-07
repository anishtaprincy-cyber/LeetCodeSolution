/*class Solution {
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
}*/
class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length())
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();

        int row = 0;
        int direction = 1;

        for (char c : s.toCharArray()) {
            rows[row].append(c);

            if (row == 0)
                direction = 1;
            else if (row == numRows - 1)
                direction = -1;

            row += direction;
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder r : rows)
            result.append(r);

        return result.toString();
    }
}