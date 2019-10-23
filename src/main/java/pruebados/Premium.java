package pruebados;


public class Premium extends Menu{
    
    boolean vegano;
    
    public Premium(){
        
        super();
        this.vegano = false;
    }

    public Premium(boolean vegano, String nombre, String detalle, int precio) {
        super(nombre, detalle, precio);
        this.vegano = vegano;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    @Override
    public String toString() {
        return "Premium{" + "vegano=" + vegano + '}';
    }
    
    public String mostrarInfoEspec(){
        
        return "PREMIUM: " + this.getDetalle() + ", $" + this.getPrecio();
    }


    
    @Override
    public int obtenerTotalConsumido(int cantidad) {
        int total = cantidad * this.getPrecio();
        return total;
    }

    @Override
    public int descontar(int cantidad) {
        int descuento = (int)(this.obtenerTotalConsumido(cantidad) * DSCTOMENUPREM);
        return descuento;
    }

    @Override
    public int obtenerTotalCompra(int cantidad) {
        int total = (int)((this.obtenerTotalConsumido(cantidad) - this.descontar(cantidad))*IVA);
        return total;
    }
    
    
    
    
    
}
