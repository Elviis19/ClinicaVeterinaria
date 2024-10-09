package main;

import objetos.Gato;
import objetos.Perro;

public class Ejecutarr {
    
    public static void main(String[] args) {
        
            Gato gato_1= new Gato();
            gato_1.setNombre("Pedro: ");
            gato_1.setEdad(4);
            gato_1.setPeso(10.2);
            gato_1.setRaza("Silvestre");
            
            System.out.println(gato_1.toString());
           
            gato_1.meow();
          
            Perro perro_1 = new Perro();
            perro_1.setNombre("Apolo: ");
            
            System.out.println(perro_1.getNombre());
            perro_1.gouf();
            
           
    }
}
