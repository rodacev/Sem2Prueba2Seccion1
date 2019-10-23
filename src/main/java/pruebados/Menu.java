
package pruebados;

public abstract class Menu implements ICalculable{
    
    private String nombre;
    private String detalle;
    private int precio;
    
    public Menu(){
        
        this.nombre = "";
        this.detalle = "";
        this.precio = 0;
    }

    public Menu(String nombre, String detalle, int precio) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Menu{" + "nombre=" + nombre + ", detalle=" + detalle + ", precio=" + precio + '}';
    }
    
    
    public void mostrarInfoMenu(){
        
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("DETALLE: " + this.detalle);
        System.out.println("PRECIO: " + this.precio);
        
    }
    
    public abstract String mostrarInfoEspec();
    
    
}
