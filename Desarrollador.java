/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Desarrollador {
    
    private boolean java;   //true si es un desarrolador java
    private boolean movil;  // true si es un desarrolador movil 
    private boolean web;    // ture si es un desarrolador web
    private String nombre;  //nombre del desarrollador 
    
    
    public Desarrollador(String nombre,boolean java,boolean web, boolean movil){
        this.nombre = nombre;       
        this.java = java;
        this.web = web;
        this.movil = movil; 
    }
    
    
    //Get y set
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre; 
    }
    
    public void setJava(boolean java){
        this.java=java;
    }
    public boolean getJava(){
        return this.java; 
    }
    
    public void setWeb(boolean web){
        this.web=web;
    }
    public boolean getWeb(){
       return this.web;
    }
  
    public void setMovil(boolean movil){
        this.movil=movil; 
    }
    public boolean getMovil(){
        return this.movil; 
    }
    
   
    
    //Metodosq 
   
}
