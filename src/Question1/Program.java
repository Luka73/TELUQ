package Question1;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<String> result = sortLetters();
        for (String s : result)
            System.out.println(s);

        System.out.println("Total: " + result.size());
    }

    private static List<String> sortLetters() {
        Character[] arrayi = {'a', 'b', 'c', 'd'};
        Character[] arrayf = new Character[4];
        Set<String> strings = new HashSet<>();

        for (Character v1 : arrayi) {
            arrayf[0] = v1;
            for (Character v2 : arrayi) {
                arrayf[1] = (arrayf[0] == 'b') ? 'a' : v2;
                for (Character v3 : arrayi) {
                    arrayf[2] = (arrayf[1] == 'b') ? 'a' : v3;
                    for (Character v4 : arrayi) {
                        if (v4 != 'b') {
                            arrayf[3] = (arrayf[2] == 'b') ? 'a' : v4;
                            String word = arrayf[0].toString() + arrayf[1].toString() + arrayf[2].toString() + arrayf[3].toString();
                            if(!(word.contains("a") && word.contains("d")))
                                strings.add(word);
                        }
                    }
                }
            }
        }
        List<String> sortedList = new ArrayList<>(strings);
        Collections.sort(sortedList);
        return sortedList;
    }
}
