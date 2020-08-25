package Question2;

public class Sudoku {
    public int[][] matrix = new int[9][9];
    private int[][] transposedMatrix = new int[9][9];
    private String[] xyz;

    public Sudoku(String data) {
        xyz = data.split(" ");
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public boolean validMatrix() {
        int x, y, z;
        if(xyz.length != 81) return false;

        for (String s : xyz) {
            if(s.length() != 3) return false;
            x = Character.getNumericValue(s.charAt(0));
            y = Character.getNumericValue(s.charAt(1));
            z = Character.getNumericValue(s.charAt(2));

            if(x == 9 || y == 9 || z == 0) return false;

            matrix[x][y] = z;
        }

        return true;
    }

    public void showMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void setTransposedMatrix() {
        for(int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
    }

    public int[][] getTransposedMatrix() {
        return transposedMatrix;
    }
}
