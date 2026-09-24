package chess;

import java.util.List;
import java.util.ArrayList;

public class LegalMoveCheck {

    ArrayList<ChessMove> legalMoveCheck(ChessBoard board, ChessPosition pos,
                                        ChessPiece piece, ArrayList<ChessMove> list) {
        switch (piece.getPieceType()) {
            case ChessPiece.PieceType.KING:
                LegalMoveAdder.northAdder(pos,1,board,piece,list);
                LegalMoveAdder.southAdder(pos,1,board,piece,list);
                LegalMoveAdder.westAdder(pos,1,board,piece,list);
                LegalMoveAdder.eastAdder(pos,1,board,piece,list);
                LegalMoveAdder.diagonalAdder(pos,1,board,piece,list);
                break;
            case ChessPiece.PieceType.QUEEN:
                LegalMoveAdder.northAdder(pos,8,board,piece,list);
                LegalMoveAdder.southAdder(pos,8,board,piece,list);
                LegalMoveAdder.westAdder(pos,8,board,piece,list);
                LegalMoveAdder.eastAdder(pos,8,board,piece,list);
                LegalMoveAdder.diagonalAdder(pos,8,board,piece,list);
                break;
            case ChessPiece.PieceType.BISHOP:
                LegalMoveAdder.diagonalAdder(pos,8,board,piece,list);
                break;
            case ChessPiece.PieceType.KNIGHT:
                LegalMoveAdder.LAdder(pos,board,piece,list);
                break;
            case ChessPiece.PieceType.ROOK:
                LegalMoveAdder.northAdder(pos,8,board,piece,list);
                LegalMoveAdder.southAdder(pos,8,board,piece,list);
                LegalMoveAdder.westAdder(pos,8,board,piece,list);
                LegalMoveAdder.eastAdder(pos,8,board,piece,list);
                break;
            case ChessPiece.PieceType.PAWN:
                LegalMoveAdder.pawnAdder(pos,board,piece,list);
                break;
        }
        return list;
    }
}
