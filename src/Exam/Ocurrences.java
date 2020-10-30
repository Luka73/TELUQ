package Exam;

public class Ocurrences {

    String s = "je ne mange pas";
    char c = 'e';

    public static int[] occurrences(String s, char c) {
        char[] ch = s.toCharArray();
        int j = 0;

        for(char v : ch) {
            if(v == c) {  j++; }
        }

        int[] indexes = new int[j];
        int count = 0;

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == c) {
                indexes[count] = i + 1;
                count++;
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        Ocurrences ocurrences = new Ocurrences();
        int[] indexes = occurrences(ocurrences.s, ocurrences.c);

        for(int i : indexes) {
            System.out.println("Index: " + i);
        }
    }
}


