import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LinesOfActionBoardTest {


    @Test
    void countPieces() {
        char c = 'O';
        Board board = new Board();
        int n = board.countPieces(c);
        assertEquals(12,n);
    }

    @Test
    void findMoveInDirection() {

    }

    @Test
    void findAllLegalMovesFrom() {
    }


    @Test
    void testCountPieces() {

        }
    @Test
    void hasWon() {

    }

    @Test
    void findWinner() {
    }
}