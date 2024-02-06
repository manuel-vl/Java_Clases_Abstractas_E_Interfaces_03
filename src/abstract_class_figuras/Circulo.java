package abstract_class_figuras;

public class Circulo extends Figura {
    private Double radio;

    public Circulo(String color, Double radio) {
        super(color);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double area() {
        return Math.PI * radio * radio;
    }
}
