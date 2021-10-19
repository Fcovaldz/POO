package com.generation;

public class Perro {

    String nombre;
    String raza;
    int edad;
    String tamanio;

    public Perro(){

    }
    public Perro(String nombre){
        this.nombre = nombre;
    }

    public Perro(String nombre, String raza, int edad, String tamanio){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public void caracteristicas(){
        System.out.println("Wassaap, yo soy " + this.nombre + ", soy de raza " + this.raza + " tengo " + this.edad +
                " años. Soy de tamaño " + this.tamanio);
    }
    public void comer(){
        System.out.println("Refinando...");
    }

    public void dormir(){
        System.out.println("Durmiendo....");
    }
    public void jugar(){
        System.out.println("Vente a jugar prroo");
    }
}
