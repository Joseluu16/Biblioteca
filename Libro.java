/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema6.Biblioteca;

/**
 *
 * @author jolun
 */
public class Libro {
    private String Titulo;
    private String Autor;
    private int TotalCopias;
    private int CopiasPrestadas;

    public Libro() {
    }
     public Libro(String title, String author, int totalCopies, int borrowedCopies) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.TotalCopias = TotalCopias;
        this.CopiasPrestadas = CopiasPrestadas;
    }
     
     public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String title) {
        this.Titulo = Titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    public int getTotalCopias() {
        return TotalCopias;
    }
    public void setTotalCopias(int TotalCopias) {
        this.TotalCopias = TotalCopias;
    }
    public int getCopiasPrestadas() {
        return CopiasPrestadas;
    }
    public void setCopiasPrestadas(int CopiasPrestadas) {
        this.CopiasPrestadas = CopiasPrestadas;
    }
    
    public boolean Prestamo() {
        boolean res = false;
        if (TotalCopias > CopiasPrestadas) {
            CopiasPrestadas++;
            res =true;
        }
         return res;
    }

    public boolean Devolucion() {
        boolean res =false;
        if (CopiasPrestadas > 0) {
            CopiasPrestadas--;
            res = true;
        }
        return res;
    }
    @Override
    public String toString() {
        return "Libro [Titulo=" + Titulo + ", Autor=" + Autor + ", Copias Totales=" + TotalCopias + ", Copias Prestadas="
                + CopiasPrestadas + "]";
    }
}

    