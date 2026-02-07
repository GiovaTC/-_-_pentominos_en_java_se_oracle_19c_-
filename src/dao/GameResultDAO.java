package dao;

import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class GameResultDAO {

    public void save(int rows, int cols, String solution, int steps, long timeMs) throws Exception {

        String sql = """
            INSERT INTO PENTOMINO_GAME
            (BOARD_ROWS, BOARD_COLS, SOLUTION_TEXT, STEPS, EXEC_TIME_MS)
             VALUES (?, ?, ?, ?, ?)
         """;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, rows);
            ps.setInt(2, cols);
            ps.setString(3, solution);
            ps.setInt(4, steps);
            ps.setLong(5, timeMs);
            ps.executeUpdate();
        }
    }
}   
