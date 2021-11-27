
package Operaciones;


public class PruebaCajita {
    
    public static void main(String[] args) {
        
        int anch = 4;
        int alt = 5;
        int prof = 7;
        
        
        Cajita cajita1 = new Cajita();
        
        cajita1.alto = alt;
        cajita1.ancho = anch;
        cajita1.profundo = prof;
        
        int resultado = cajita1.calcularVolumen();
        
        System.out.println("resultado volumen constructor vacio = " + resultado);
        
        
        Cajita cajita2 = new Cajita(6,7,8);
        
        resultado = cajita2.calcularVolumen();
        
        System.out.println("resultado volumen constructor con argumentos = " + cajita2.calcularVolumen());
        
        
        
    }
    
}
