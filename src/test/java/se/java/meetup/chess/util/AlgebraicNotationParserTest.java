package se.java.meetup.chess.util;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlgebraicNotationParserTest {

    public static final String RECORD = "1. e4 e5 2. Nf3 Nf6 3. Bc4 d5 4. d3 Be6 5. Qe2 Qe7 6. g3 Nc6 7. 0-0 0-0-0 8. exd5 Bxd5 9. Bxd5 Nxd5 10. Nxe5 Qxe5 11. Qxe5 Nxe5 12. Re1 Re8 13. Rxe5 Rxe5";

    @Test
    public void recordIsParsedToList() {
        List<String> recordList = AlgebraicNotationParser.toList(RECORD);

        assertEquals(26, recordList.size());
        assertEquals("e4", recordList.get(0));
        assertEquals("Rxe5", recordList.get(25));
    }
}