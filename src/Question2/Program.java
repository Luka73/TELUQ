package Question2;

public class Program {
    public static void main(String[] args) throws Exception {
        String data = Utils.readFile("C:\\Projects\\TELUQ\\src\\Question2\\resources\\part1.txt");
        Sudoku sudoku = new Sudoku(data);
        sudoku.showMatrix(sudoku.getMatrix());
    }
}
