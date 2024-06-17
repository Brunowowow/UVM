/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Registro_Usuario {
    
    private ArrayList<Usuario> listaUsuarios;
    private static Registro_Usuario instance;

    public Registro_Usuario() {
        listaUsuarios =  new ArrayList<Usuario>();
        listaUsuarios.add(new Usuario("admin", "hola", 0));
    }
    
    public static Registro_Usuario getInstance() {
        if (instance == null) {
            instance = new Registro_Usuario();
        }
        return instance;
    }
    
    public void agregarUsuario(Usuario usuario){
        //verificar existencia del auto
        listaUsuarios.add(usuario); 
    }
    
    public void listarUsuarios(){
        for (Usuario i : listaUsuarios) {
            System.out.println(i);  
        }
    }
    
    public Usuario buscarUsuario(String nombreUsuario){
        for (Usuario i : listaUsuarios) {   
            if (i.getNombreUsuario().equals(nombreUsuario)) {
                return i;
            }  
        }
        return null;
    }
    
    public void eliminarUsuario(String nombreUsuario){
        if (buscarUsuario(nombreUsuario) != null) {
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (listaUsuarios.get(i).getNombreUsuario().equals(nombreUsuario)) {
                    listaUsuarios.remove(i);
                    System.out.println("USUARIO ELIMINADO");  
                    break;                
                }
                else{
                    System.out.println("USUARIO NO ELIMINADO");   
                } 
            }
        }
    }
}
