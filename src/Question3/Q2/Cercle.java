package Question3.Q2;

// : --> C# / extends --> Java
public class Cercle extends Forme{
    double diametre = 3;

    public Cercle(double diametre) {

        this.diametre = diametre;
    }

    @Override
    public double getPerimeter() {
        return diametre * Math.PI;
    }
}
