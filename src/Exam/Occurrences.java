package Exam;

public class Occurrences {

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
        Occurrences occurrences = new Occurrences();
        int[] indexes = occurrences(occurrences.s, occurrences.c);

        for(int i : indexes) {
            System.out.println("Index: " + i);
        }
    }


    /*
         Explicação

         Para resolver essa questão, primeiro optei por transformar a string em um array
         de char, pois a manipulação dos dados seria muito mais facil.

         Em seguida optei por contar a quantidade de ocorrências do elemento da frase.
         Com iso, eu posso criar um array com o tamanho exato para guardar os índices
         dessas ocorrências. Isso seria melhor resolvido usando List, mas como eu devo
         usar array, mantive assim.

         Então, percorro array de caracteres guardando os índices dos caracteres iguais
         ao elemnto buscado. Por fim, basta retornar esse array.

     */
}


