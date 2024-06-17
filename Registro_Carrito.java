/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ProdCarrito;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Registro_Carrito {
    
    ArrayList<ProdCarrito> carritoActual;

    public Registro_Carrito() {
        carritoActual =  new ArrayList<ProdCarrito>();
    }
    
    public void agregarProdCarrito(ProdCarrito carrito){
        //verificar existencia del auto
        carritoActual.add(carrito); 
    }
    
    public void listarCarrito(){
        for (ProdCarrito i : carritoActual) {
            System.out.println(i);  
        }
    }
    
    public boolean buscarEnCarrito(int id){
        for (ProdCarrito i : carritoActual) {
            if (i.getIdProducto()==id) {
                return true;
            }  
        }
        return false;
    }
    
    public void eliminarDelCarrito(int id){
        if (buscarEnCarrito(id)==true) {
            for (int i = 0; i < carritoActual.size(); i++) {
                if (carritoActual.get(i).getIdProducto()==id) {
                    carritoActual.remove(i);
                    System.out.println("PRODUCTO ELIMINADO DEL CARRITO");  
                    break;                
                }
                else{
                    System.out.println("PRODUCTO NO ELIMINADO DEL CARRITO");   
                } 
            }
        }
    }
}
