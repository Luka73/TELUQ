package Exam;

public class Tableau {

    String[] array = {"bah", "bah", "be", "bo", "bo", "bo"};

    public static int unique(String[] t) {
        int count = 0;
        for(int i = 0; i < t.length; i++) {
            if((i + 1) < t.length && t[i].equals(t[i+1])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Tableau t = new Tableau();
        System.out.println("Repetitions: " + unique(t.array));
    }
}
