package Question2;

public class Program {
    public static void main(String[] args) throws Exception {
        //part1.txt --> funciona (é do professor)
        //part2.txt --> funciona (randômico)
        //part3.txt --> não funciona
        String data = Utils.readFile("C:\\Projects\\TELUQ\\src\\Question2\\resources\\part4.txt");
        Sudoku sudoku = new Sudoku(data);
        int[][] transposedMatrix = sudoku.transposeMatrix(sudoku.getMatrix());
        sudoku.showMatrix(sudoku.getMatrix());
        System.out.println("**********************************");
        sudoku.showMatrix(transposedMatrix);
    }
}
