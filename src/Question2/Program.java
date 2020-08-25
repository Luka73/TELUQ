package Question2;

public class Program {
    public static void main(String[] args) {
        int x, y, z;
        String msg = "";
        int[][] vMatrix = new int[9][9];
        String data = Utils.readFile("C:\\Projects\\TELUQ\\src\\Question2\\resources\\part1.txt");
        String[] xyz = data.split(" ");
        if(xyz.length == 81) {
            for (String s : xyz) {
                if(s.length() == 3) {
                    x = Character.getNumericValue(s.charAt(0));
                    y = Character.getNumericValue(s.charAt(1));
                    z = Character.getNumericValue(s.charAt(2));

                    vMatrix[x][y] = z;
                } else { msg = "Invalid data"; }
            }
        } else { msg = "Invalid data"; }


        if(msg.isEmpty()) {
            for (int[] matrix : vMatrix) {
                for (int j = 0; j < vMatrix[0].length; j++) {
                    System.out.println(matrix[j]);
                }
            }
        } else {
            System.out.println(msg);
        }
    }
}
