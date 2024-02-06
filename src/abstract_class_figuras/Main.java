package abstract_class_figuras;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado=new Cuadrado("Blue", 2.0,2.0);
        Triangulo triangulo=new Triangulo("Green", 2.0, 3.0);
        Circulo circulo=new Circulo("Red", 2.0);
        Figura figura=new Cuadrado("Black", 3.0, 4.0);

        System.out.println("Color: "+cuadrado.getColor()+ " Area: "+cuadrado.area());
        System.out.println("Color: "+triangulo.getColor()+ " Area: "+triangulo.area());
        System.out.println("Color: "+circulo.getColor()+ " Area: "+circulo.area());
        System.out.println("Color: "+figura.getColor()+ " Area: "+figura.area());
    }

}
