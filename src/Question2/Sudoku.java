package Question2;

import java.util.ArrayList;
import java.util.List;

public class Sudoku {
    public int[][] matrix = new int[9][9];

    public Sudoku(String data) throws Exception {
        int i = 0;
        int x, y, z;
        List<Integer> list = new ArrayList<>();
        String[] xyz = data.split(" ");

        if(xyz.length != 81) throw new Exception("Inavalid Sudoku");

        for (String s : xyz) {
            if(s.length() != 3) throw new Exception("Inavalid Sudoku");
            x = Character.getNumericValue(s.charAt(0));
            y = Character.getNumericValue(s.charAt(1));
            z = Character.getNumericValue(s.charAt(2));

            if(x == 9 || y == 9 || z == 0) throw new Exception("Inavalid Sudoku");

            if(x == i) {
                if(!list.contains(z)) list.add(z);
                else throw new Exception("Inavalid Sudoku");
            } else {
                list.clear();
                i++;
            }

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

     public int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }
}
