package interface_vehiculos;

public class VehiculoReforzado implements  Vehiculo{
    protected Vehiculo vehiculo;

    public VehiculoReforzado(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public Double getPrecio() {
        return vehiculo.getPrecio()+20.0;
    }

    @Override
    public String getAccesorios() {
        return vehiculo.getAccesorios() + "Vidrios reforzados";
    }
}
