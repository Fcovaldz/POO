package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Perro lomito = new Perro();
       lomito.nombre = "chems";
       lomito.edad = 1;
       lomito.raza = "mestizo";
       lomito.tamanio = "wrande";
       lomito.caracteristicas();
       lomito.comer();

        Perro lomito2 = new Perro();
        lomito2.nombre = "Kiara";
        lomito2.edad = 4;
        lomito2.raza = "Pitbull";
        lomito2.tamanio = "enorme";
        lomito2.caracteristicas();
        lomito2.comer();
        lomito2.dormir();


        Perro lomito3 = new Perro("Milaneso");
        lomito3.jugar();

        Perro lomito4 = new Perro("Sr. Kawamura", "Husky", 4, "Gigante");
        lomito4.caracteristicas();

    }
}
