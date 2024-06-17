/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Usuario {
    
    private String nombreUsuario, contraseña;
    private int rut;

    public Usuario() {
    }

    public Usuario(String nombreCliente, String contraseña, int rut) {
        this.nombreUsuario = nombreCliente;
        this.contraseña = contraseña;
        this.rut = rut;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreCliente=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + ", run=" + rut + '}';
    }
    
    
}
