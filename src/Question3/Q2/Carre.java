package Question3.Q2;

public class Carre extends Forme implements Resizable{
    double taille = 5;

    public Carre(double taille) {
        this.taille = taille;
    }

    @Override
    public double getPerimeter() {
        return taille * 4;
    }

    @Override
    public void resize(double taille) {
        this.taille = taille;
    }
}
