package pruebados;

public class Test {


    public static void main(String[] args) {
        
        RegistroMenu registroMenu = new RegistroMenu();
        
        
        Ejecutivo ejecutivo = new Ejecutivo();
        ejecutivo.setNombre("CARMECH");
        ejecutivo.setDetalle("CARNE MECHADA CON ARROZ");
        ejecutivo.setPrecio(4500);
        ejecutivo.setRangoMinProteinas(100);
        ejecutivo.setRangoMaxProteinas(200);
        
        Ejecutivo ejecutivodos = new Ejecutivo();
        ejecutivodos.setPrecio(9800);
        
        Premium premium = new Premium();
        premium.setNombre("SALPU");
        premium.setDetalle("PURE CON SALMON");
        premium.setPrecio(8900);
        premium.setVegano(false);
        
        registroMenu.almacenarMenu(premium);
        registroMenu.almacenarMenu(ejecutivo);
        registroMenu.almacenarMenu(ejecutivodos);
        
        System.out.println("TOTAL COMPRA: $" + ejecutivo.obtenerTotalCompra(2));
        
        System.out.println("TOTAL COMPRA: $" + premium.obtenerTotalCompra(15));
        
        System.out.println("CANTIDAD DE MENUS CAROS: " + registroMenu.menusCaros());
        
        registroMenu.listarMenus();
        
        registroMenu.eliminarMenu("carmech");
        
        
        ejecutivo.mostrarInfoMenu();
        
        

        
        
        
        
    }
    
}

