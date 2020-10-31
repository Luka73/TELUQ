package Exam;

public class Fruit {

    public static int jetteCall = 1;
    public int mangeCall = 1;

    public int mange() {
        return mangeCall++;
    }

    public int jette(){
        return jetteCall++;
    }

    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        System.out.println(f1.mange());
        System.out.println(f1.mange());
        System.out.println(f1.mange());
        System.out.println(f1.mange());

        Fruit f2 = new Fruit();
        System.out.println(f2.jette());
        System.out.println(f2.jette());

        Fruit f3 = new Fruit();
        System.out.println(f3.jette());
        System.out.println(f3.jette());
    }

    /*
        Explicação

        Atributos estáticos pertencem a classe e não a sua instância, logo eles
        são compartilhados por todas as instâncias da clase. Como foi feito por
        exemplo com o atributo jetteCall.

        Já atributos não estáticos pertencem a instância da classe, logo cada
        objeto criado a partir de Fruit (f1, f2 e f3) possuem um valor diferente
        para mangeCall.

        Com isso é possível calcular quantas vezes um método é chamado tanto a partir
        de uma instância quanto de uma classe.

     */
}
