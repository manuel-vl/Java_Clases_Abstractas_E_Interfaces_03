package interface_vehiculos;

public class ManillasCromada implements Vehiculo{
    protected  Vehiculo vehiculo;

    public ManillasCromada(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public Double getPrecio() {
        return this.vehiculo.getPrecio()+12.5;
    }

    @Override
    public String getAccesorios() {
        return this.vehiculo.getAccesorios()+ " Manillas cromadas";
    }
}
