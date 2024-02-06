package interface_vehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1=new ManillasCromada(
                new ChapaProtectora(
                        new RinesDeLujo(
                                new VehiculoReforzado(
                                        new VehiculoBase(100.0, "Onix", "Camara")
                                )
                        )
                )
        );

        Vehiculo vehiculo2=new ManillasCromada(
                new VehiculoReforzado(
                        new VehiculoBase(100.0, "Mazda 3", "Estandar")
                )
        );

        Vehiculo vehiculo3=new VehiculoReforzado(
                new ChapaProtectora(
                        new VehiculoBase(200.0, "Mazda CX-30", "Estandar")
                )
        );

        System.out.println("El vehiculo 1 tiene un precio de: "+vehiculo1.getPrecio()+ " Con accesorios: "+vehiculo1.getAccesorios());
        System.out.println("El vehiculo 2 tiene un precio de: "+vehiculo2.getPrecio()+ " Con accesorios: "+vehiculo2.getAccesorios());
        System.out.println("El vehiculo 3 tiene un precio de: "+vehiculo3.getPrecio()+ " Con accesorios: "+vehiculo3.getAccesorios());
    }
}
