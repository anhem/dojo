package se.java.meetup.chess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgebraicNotationParser {

    public static List<String> toList(String record) {
        List<String> moves = new ArrayList<>();
        String[] movePairs = record.split("\\d*\\. ");
        for (String movePair : movePairs) {
            if (!movePair.trim().isEmpty()) {
                String[] split = movePair.trim().split(" ");
                Collections.addAll(moves, split);
            }
        }
        return moves;
    }
}
