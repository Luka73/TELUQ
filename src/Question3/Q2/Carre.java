package Question3.Q2;

public class Carre extends Forme implements Resizable {
    double taille = 0;

    public Carre(double taille) {
        this.taille = taille;
    }

    public double getPerimeter() {
        return taille*4;
    }

    public void resize(double taille) {
        this.taille = taille;
    }
}
