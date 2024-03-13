// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
    private char[][] grid;

    /**
     * Constructs a new CharGrid with the given grid.
     * Does not make a copy.
     *
     * @param grid
     */
    public CharGrid(char[][] grid) {
        this.grid = grid;
    }

    /**
     * Returns the area for the given char in the grid. (see handout).
     *
     * @param ch char to look for
     * @return area for given char
     */
    public int charArea(char ch) {
        int k = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == ch) {
                    k = 1;
                    break;
                }
            }
            if (k == 1) break;
        }
        if (k == 0) return 0;

        int minRow = grid.length;
        int maxRow = 0;
        int minCol = grid[0].length;
        int maxCol = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == ch) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        int rowLength = maxRow - minRow + 1;
        int colLength = maxCol - minCol + 1;

        return rowLength * colLength;
    }

    /**
     * Returns the count of '+' figures in the grid (see handout).
     *
     * @return number of + in grid
     */
    public int countPlus() {
        int count = 0;

        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                char thu = grid[i][j];
                if (thu == 'x') {
                    if (grid[i - 1][j] == 'x' && grid[i + 1][j] == 'x' && grid[i][j - 1] == 'x' && grid[i][j + 1] == 'x') {
                        count++;
                    }
                }
            }
        }

        return count;
    }

}
