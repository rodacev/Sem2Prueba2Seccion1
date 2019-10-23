package pruebados;


public class Ejecutivo extends Menu {
    
    private int rangoMinProteinas;
    private int rangoMaxProteinas;
    
    public Ejecutivo(){
        
        super();
        this.rangoMinProteinas = 0;
        this.rangoMaxProteinas = 0;
    }

    public Ejecutivo(int rangoMinProteinas, int rangoMaxProteinas, String nombre, String detalle, int precio) {
        super(nombre, detalle, precio);
        this.rangoMinProteinas = rangoMinProteinas;
        this.rangoMaxProteinas = rangoMaxProteinas;
    }

    public int getRangoMinProteinas() {
        return rangoMinProteinas;
    }

    public void setRangoMinProteinas(int rangoMinProteinas) {
        this.rangoMinProteinas = rangoMinProteinas;
    }

    public int getRangoMaxProteinas() {
        return rangoMaxProteinas;
    }

    public void setRangoMaxProteinas(int rangoMaxProteinas) {
        this.rangoMaxProteinas = rangoMaxProteinas;
    }

    @Override
    public String toString() {
        return "Ejecutivo{" + "rangoMinProteinas=" + rangoMinProteinas + ", rangoMaxProteinas=" + rangoMaxProteinas + '}';
    }
    
    
    @Override
    public String mostrarInfoEspec(){
        
        return "EJECUTIVO: " + this.getDetalle() + ", $" + this.getPrecio() 
                + " de " + this.rangoMinProteinas + " a " + this.rangoMaxProteinas + " proteinas";
    }
    

    
    
    

    @Override
    public int obtenerTotalConsumido(int cantidad) {
        int total = cantidad * this.getPrecio();
        return total;
    }

    @Override
    public int descontar(int cantidad) {
        int descuento = (int)(this.obtenerTotalConsumido(cantidad) * DSCTOMENUEJEC);
        return descuento;
    }

    @Override
    public int obtenerTotalCompra(int cantidad) {
        int total = (int)((this.obtenerTotalConsumido(cantidad) - this.descontar(cantidad)) * IVA);
        return total;
    }
    
    
    
}
