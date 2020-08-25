package Question2;

public class Program {
    public static void main(String[] args) throws Exception {
        String data = Utils.readFile("C:\\Projects\\TELUQ\\src\\Question2\\resources\\part1.txt");
        Sudoku sudoku = new Sudoku(data);
        int[][] tMatrix = new int[9][9];
        for(int i = 0; i < tMatrix.length; i++) {
            for (int j = 0; j < tMatrix[i].length; j++) {
                tMatrix[i][j] = sudoku.matrix[j][i];
            }
        }
        if(sudoku.validMatrix()) {
            sudoku.showMatrix(sudoku.getMatrix());
            System.out.println("*********************");
            sudoku.showMatrix(tMatrix);
        } else {
            throw new Exception("Inavalid Sudoku");
        }
    }
}
