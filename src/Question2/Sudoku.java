package Question2;

public class Sudoku {
    public int[][] matrix = new int[9][9];

    public Sudoku(String data) throws Exception {
        int x, y, z;
        String[] xyz = data.split(" ");
        
        if(xyz.length != 81) throw new Exception("Inavalid Sudoku");

        for (String s : xyz) {
            if(s.length() != 3) throw new Exception("Inavalid Sudoku");
            x = Character.getNumericValue(s.charAt(0));
            y = Character.getNumericValue(s.charAt(1));
            z = Character.getNumericValue(s.charAt(2));

            if(x == 9 || y == 9 || z == 0) throw new Exception("Inavalid Sudoku");

            matrix[x][y] = z;
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void showMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
