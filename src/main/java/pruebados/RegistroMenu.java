package pruebados;

import java.util.ArrayList;

public class RegistroMenu {
    
    private ArrayList<Menu>ListaMenus;
    
    public RegistroMenu(){
        
       this.ListaMenus = new ArrayList<>();
    }

    public RegistroMenu(ArrayList<Menu> ListaMenus) {
        this.ListaMenus = ListaMenus;
    }

    public ArrayList<Menu> getListaMenus() {
        return ListaMenus;
    }

    public void setListaMenus(ArrayList<Menu> ListaMenus) {
        this.ListaMenus = ListaMenus;
    }

    @Override
    public String toString() {
        return "RegistroMenu{" + "ListaMenus=" + ListaMenus + '}';
    }
    
    
    public void almacenarMenu(Menu menu){
        
        boolean validador = false;
        
        for (Menu x: ListaMenus){
            
            if (x.getNombre().equalsIgnoreCase(menu.getNombre())){
                
                validador = true;
                break;
            }
        }
        if (validador){
            System.out.println("ERROR - EL MENU YA EXISTE");
        }else{
            this.ListaMenus.add(menu);
            System.out.println("MENU INGRESADO HA SIDO ALMACENADO CORRECTAMENTE");
        } 
    }
    
    
    public void listarMenus(){
        
        for (Menu x: ListaMenus){
            
            if (x instanceof Ejecutivo){
                System.out.println("\nMENU EJECUTIVO");
            }
            else if (x instanceof Premium){
                System.out.println("\nMENU PREMIUM");
            }
            
            
            System.out.println(x.mostrarInfoEspec());
        }
    }
    
    
    public void eliminarMenu(String nombre){
        
        boolean validador = false;
        int posicion = 0;
        
        for (int i=0;i<ListaMenus.size();i++){
            
            if (ListaMenus.get(i).getNombre().equalsIgnoreCase(nombre)){
                
                validador =  true;
                posicion = i;
                break;
            }
        }
        if (validador){
            ListaMenus.remove(posicion);
            System.out.println("\nEL MENU HA SIDO ELIMINADO CORRECTAMENTE\n");
        }else{
            System.out.println("\nIMPOSIBLE ELIMINAR, EL MENU NO EXISTE EN NUESTROS REGISTROS\n");
        } 
    }
    
    
    public int menusCaros(){
        int contador = 0;
        for (Menu x: ListaMenus){
            
            if (x.getPrecio()>7000){
                contador+=1;
            }
        }
        return contador;
    }
    
    
    
    
    
    
    
}
