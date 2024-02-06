package abstract_class_figuras;

public class Cuadrado extends Figura{
    private double ladoA;
    private double ladoB;

    public Cuadrado(String color, double ladoA, double ladoB) {
        super(color);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public Double area() {
        return ladoA*ladoB;
    }
}
