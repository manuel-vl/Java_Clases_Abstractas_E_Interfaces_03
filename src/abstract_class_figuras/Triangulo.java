package abstract_class_figuras;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;

    public Triangulo(String color, Double base, Double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double area() {
        return base*altura/2;
    }
}
