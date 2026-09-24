package chess;

import java.util.ArrayList;

public class LegalMoveAdder {

    public static void northAdder(ChessPosition beginPos, int maxMoveDist,
                           ChessBoard board, ChessPiece piece, ArrayList<ChessMove> list) {
        int pathDist = 1;
        boolean pathClear = true;
        while (pathDist <= maxMoveDist && pathClear) {
            if (beginPos.getRow() + pathDist <= 8) {
                ChessPosition endPos = new ChessPosition(beginPos.getRow() + pathDist, beginPos.getColumn());
                if (board.getPiece(endPos) == null) {
                    list.add(new ChessMove(beginPos,endPos,null));
                }
                else {
                    if (board.getPiece(endPos).getTeamColor() != piece.getTeamColor()) {
                        list.add(new ChessMove(beginPos,endPos,null));
                    }
                    pathClear = false;
                }
            }
            pathDist++;
        }
    }

    public static void southAdder(ChessPosition beginPos, int maxMoveDist,
                           ChessBoard board, ChessPiece piece, ArrayList<ChessMove> list) {
        int pathDist = 1;
        boolean pathClear = true;
        while (pathDist <= maxMoveDist && pathClear) {
            if (beginPos.getRow() + pathDist <= 8) {
                ChessPosition endPos = LegalMoveLibrary.south(beginPos, pathDist);
                if (board.getPiece(endPos) == null) {
                    list.add(new ChessMove(beginPos,endPos,null));
                }
                else {
                    if (board.getPiece(endPos).getTeamColor() != piece.getTeamColor()) {
                        list.add(new ChessMove(beginPos,endPos,null));
                    }
                    pathClear = false;
                }
            }
            pathDist++;
        }
    }

    public static void westAdder(ChessPosition beginPos, int maxMoveDist,
                          ChessBoard board, ChessPiece piece, ArrayList<ChessMove> list) {
        int pathDist = 0;
        boolean pathClear = true;
    }

    public static void eastAdder(ChessPosition beginPos, int maxMoveDist,
                          ChessBoard board, ChessPiece piece, ArrayList<ChessMove> list) {
        int pathDist = 0;
        boolean pathClear = true;
    }

    public static void diagonalAdder(ChessPosition beginPos, int maxMoveDist,
                              ChessBoard board, ChessPiece piece, ArrayList<ChessMove> list) {
        int pathDist = 0;
        boolean pathClear = true;
    }

    public static void LAdder(ChessPosition beginPos, ChessBoard board,
                              ChessPiece piece, ArrayList<ChessMove> list) {

    }

    public static void pawnAdder(ChessPosition beginPos, ChessBoard board,
                                 ChessPiece piece, ArrayList<ChessMove> list) {
        boolean pathClear = true;

    }

}
