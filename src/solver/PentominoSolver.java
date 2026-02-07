package solver;

import model.Board;
import model.Pentomino;

import java.util.List;

public class PentominoSolver {

    private int steps = 0;

    public boolean solve(Board board, List<Pentomino> pieces, int index) {
        if (index == pieces.size()) return true;

        Pentomino p = pieces.get(index);

        for (boolean[][] shape : p.getOrientations()) {
            for (int r = 0; r < 10; r++) {
                for (int c = 0; c < 10; c++) {
                    steps++;
                    if (board.canPlace(shape, r , c)) {
                        board.place(shape, r, c, p.getName());
                        if (solve(board, pieces, index + 1)) return true;
                        board.remove(shape, r, c);
                    }
                }
            }
        }
        return false;
    }

    public int getSteps() {
        return steps;
    }
}   
