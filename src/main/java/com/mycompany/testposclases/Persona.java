package com.mycompany.testposclases;

public class Persona {
    private int dni;
   private String nombre;
   private String apellido;
   private String telefono;
   private String email;
   
    public Persona (){};

    public Persona(
            int dni,
            String nombre,
            String apellido,
            String telefono,
            String email
    ) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    //--------------------
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //-----------------

    @Override
    public String toString() {
        return "Persona{" 
                + "dni=" + dni 
                + ", nombre=" + nombre 
                + ", apellido=" + apellido 
                + ", telefono=" + telefono 
                + ", email=" + email 
                + '}';
    }
}
