/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Registro_Productos {
    private ArrayList<Producto> listaProductos;
    private static Registro_Productos instance;

    public Registro_Productos() {
        listaProductos = new ArrayList<Producto>();
    }

    public static Registro_Productos getInstance() {
        if (instance == null) {
            instance = new Registro_Productos();
        }
        return instance;
    }
    
    public void ingreso_producto(Producto producto){
        listaProductos.add(producto);
    }
    
    public boolean buscarIdProducto(int id){
        for (Producto i : listaProductos) {
            if (i.getIdProducto()==id) {
                return true;
            }  
        }
        return false;
    }
    
    public boolean buscarNombreProducto(String nombre){
        for (Producto i : listaProductos) {
            if (i.getNombreProducto().equals(nombre)) {
                return true;
            }  
        }
        return false;
    }
    
    public int generarId(){
        int aux = 0;
        if(listaProductos.isEmpty()){
            return 100; //Los ID son numeros que empiezan desde el 100
        }
        for (Producto i : listaProductos) {
             if (i.getIdProducto() > aux){
                 aux = i.getIdProducto();
             }
        }
        return aux+1;
    }
    
    public void modificar_producto(int id){
        if (buscarIdProducto(id)==true){
            //odkfa
        }
    }
    
    public void eliminar_produycto(int idProducto){
        if (buscarIdProducto(idProducto)==true) {
            for (int i = 0; i < listaProductos.size(); i++) {
                if (listaProductos.get(i).getIdProducto()==idProducto) {
                    listaProductos.remove(i);
                    System.out.println("PRODUCTO ELIMINADO");  
                    break;                
                }
                else{
                    System.out.println("PRODUCTO NO ELIMINADO");   
                } 
            }
        }
    }
}
