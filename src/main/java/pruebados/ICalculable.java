
package pruebados;


public interface ICalculable {
    
    public static final double IVA = 1.19;
    public static final double DSCTOMENUEJEC = 0.15;
    public static final double DSCTOMENUPREM = 0.10;
    
    
    public int obtenerTotalConsumido(int cantidad);
    public int descontar(int cantidad);
    public int obtenerTotalCompra(int cantidad);
    
}
