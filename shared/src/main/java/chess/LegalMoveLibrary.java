package chess;

public class LegalMoveLibrary {

    public enum DiagDir {
        NE,
        NW,
        SW,
        SE
    }

    public static ChessPosition north(ChessPosition beginPos, int moveDist) {
        return new ChessPosition(beginPos.getRow() + moveDist, beginPos.getColumn());
    }

    public static ChessPosition south(ChessPosition beginPos, int moveDist) {
        return new ChessPosition(beginPos.getRow() - moveDist, beginPos.getColumn());
    }

    public static ChessPosition west(ChessPosition beginPos, int moveDist) {
        return new ChessPosition(beginPos.getRow(), beginPos.getColumn() - moveDist);
    }

    public static ChessPosition east(ChessPosition beginPos, int moveDist) {
        return new ChessPosition(beginPos.getRow(), beginPos.getColumn() + moveDist);
    }

    public static ChessPosition diagonal(ChessPosition beginPos, int moveDist, DiagDir dir) {
        ChessPosition endPos;
        if (dir == DiagDir.NE) {
            endPos = new ChessPosition(beginPos.getRow() + moveDist, beginPos.getColumn() + moveDist);
        }
        else if (dir == DiagDir.NW) {
            endPos = new ChessPosition(beginPos.getRow() - moveDist, beginPos.getColumn() + moveDist);
        }
        else if (dir == DiagDir.SW) {
            endPos = new ChessPosition(beginPos.getRow() - moveDist, beginPos.getColumn() - moveDist);
        }
        else {
            endPos = new ChessPosition(beginPos.getRow() + moveDist, beginPos.getColumn() - moveDist);
        }
        return endPos;
    }

    public static ChessPosition LShape(ChessPosition beginPos, int rowDist, DiagDir dir) {
        ChessPosition endPos;
        if (dir == DiagDir.NE) {
            if (rowDist == 2) {
                endPos = new ChessPosition(beginPos.getRow() + 2, beginPos.getColumn() + 1);
            }
            else {
                endPos = new ChessPosition(beginPos.getRow() + 1, beginPos.getColumn() + 2);
            }
        }
        else if (dir == DiagDir.NW) {
            if (rowDist == 2) {
                endPos = new ChessPosition(beginPos.getRow() - 2, beginPos.getColumn() + 1);
            }
            else {
                endPos = new ChessPosition(beginPos.getRow() - 1, beginPos.getColumn() + 2);
            }
        }
        else if (dir == DiagDir.SW) {
            if (rowDist == 2) {
                endPos = new ChessPosition(beginPos.getRow() - 2, beginPos.getColumn() - 1);
            }
            else {
                endPos = new ChessPosition(beginPos.getRow() - 1, beginPos.getColumn() - 2);
            }
        }
        else {
            if (rowDist == 2) {
                endPos = new ChessPosition(beginPos.getRow() + 2, beginPos.getColumn() - 1);
            }
            else {
                endPos = new ChessPosition(beginPos.getRow() + 1, beginPos.getColumn() - 2);
            }
        }
        return endPos;
    }
}
