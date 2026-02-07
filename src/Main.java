import dao.GameResultDAO;
import model.Board;
import model.Pentomino;
import solver.PentominoSolver;

public class Main {

    public static void main(String[] args) throws Exception {

        Board board = new Board(6, 10);
        PentominoSolver solver = new PentominoSolver();

        long start = System.currentTimeMillis();
     /* boolean solved = solver.solve(board, PentominoFactory.createAll(), 0);
        long end = System.currentTimeMillis();

        if (solved) {
            System.out.println("✔ Solución encontrada");
            System.out.println(board.serialize());

            new GameResultDAO().save(
                    6, 10,
                    board.serialize(),
                    solver.getSteps(),
                    end - start
            );
        } else {
            System.out.println("❌ No hay solución");
        } */
    }
}