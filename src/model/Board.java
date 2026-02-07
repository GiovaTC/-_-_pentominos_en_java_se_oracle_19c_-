package model;

public class Board {

    private final int rows;
    private final int cols;
    private final char[][] grid;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new char[rows][cols];

        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                grid[r][c] = '.';
    }

    public boolean canPlace(boolean[][] shape, int r, int c) {
        for (int i = 0; i < shape.length; i++)
            for (int j = 0; j < shape[i].length; j++)
                if (shape[i][j]) {
                    int rr = r + i;
                    int cc = c + j;
                    if (rr < 0 || cc < 0 || rr >= rows || cc >= cols || grid[rr][cc] != '.')
                    return false;
                }
        return true;
    }

    public void place(boolean[][] shape, int r, int c, char name) {
        for (int i = 0; i < shape.length; i++)
            for (int j = 0; j < shape[i].length; j++)
                if (shape[i][j])
                    grid[r + i][c + j] = name;
    }

    public void remove(boolean[][] shape, int r, int c) {
        for (int i = 0; i < shape.length; i++)
            for (int j = 0; j < shape[i].length; j++)
                if (shape[i][j])
                    grid[r + i][c + j] = '.';
    }

    public String serialize() {
        StringBuilder sb = new StringBuilder();
        for (char[] row : grid) {
            sb.append(row).append('\n');
        }
        return sb.toString();
    }
}
