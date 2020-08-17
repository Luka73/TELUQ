package Question1;

import java.util.*;

public class Program { //classe!
    public static void main(String[] args) { //main --> static
        List<String> result = sortLetters(); //chamada, executar
        for (String word : result)
            System.out.println(word);

        System.out.println("Total: " + result.size()); //quantos elementos tem na Lista
    }

    //char --> 1 caracter { 'a'  'u'  '7' '&' '/' }
    //string --> n caracter (cadeira de caracteres) --> array (vetores e matrizes)
    // "Pedro" --> 'P' + 'e' + 'd' + 'r' + 'o'

    private static List<String> sortLetters() { //Estruturas de dados otimizadas (Algoritmos Complexos)
        Character[] inicio = {'a', 'b', 'c', 'd'}; //char e string
        Character[] fim = new Character[4];
        Set<String> strings = new HashSet<>(); //elimina as redundâncias

        //foreach --> for (int i = 0; i < inicio.length; i++)
        for (Character v0 : inicio) { //a
            fim[0] = v0;
            for (Character v1 : inicio) {
                fim[1] = (fim[0] == 'b') ? 'a' : v1;
                for (Character v2 : inicio) {
                    fim[2] = (fim[1] == 'b') ? 'a' : v2;
                    for (Character v3 : inicio) {  // a, c, d
                        if (v3 != 'b') {
                            fim[3] = (fim[2] == 'b') ? 'a' : v3; //fim [__, __, c, a]
                            String word = fim[0].toString() + fim[1].toString() + fim[2].toString() + fim[3].toString();
                            if (!(word.contains("a") && word.contains("d"))) //! --> not
                                strings.add(word); //add no set as palavras
                        }
                    }
                }
            }
        }

        List<String> sortedList = new ArrayList<>(strings); //ordem lexicografica
        Collections.sort(sortedList); //sort --> ordena em ordem lexicografica
        return sortedList;
    }
}
