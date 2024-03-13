//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
    private boolean[][] grid;

    /**
     * Constructs a new instance with the given grid.
     * Does not make a copy.
     *
     * @param grid
     */
    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }



    public void clearRows() {
        int numRows = grid.length;
        int numCols = grid[0].length;

        for (int i = numRows - 1; i >= 0; i--) {
            boolean rowFull = true;
            for (int j = 0; j < numCols; j++) {
                if (!grid[i][j]) {
                    rowFull = false;
                    break;
                }
            }

            if (rowFull) {
                for (int k = i; k < numRows - 1; k++) {
                    grid[k] = grid[k + 1];
                }
                grid[numRows - 1] = new boolean[numCols];
                i++;
            }
        }
    }


    /**
     * Returns the internal 2d grid array.
     *
     * @return 2d grid array
     */
    boolean[][] getGrid() {
        return grid;
    }
}
