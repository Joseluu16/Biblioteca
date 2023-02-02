/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema6.Biblioteca;

/**
 *
 * @author jolun
 */
public class TestBiblioteca {
   public static void main(String[] args) {
        Libro L1 = new Libro("El Quijote", "Cervantes", 10, 5);
        System.out.println("Antes del préstamo:");
        System.out.println(L1);
     
   boolean EsElQuijote = L1.Prestamo();
        if (EsElQuijote){
             System.out.println("Préstamo realizado con éxito.");
         } else {
            System.out.println("No se puede realizar el préstamo, no quedan ejemplares disponibles.");
        }
}
 
}