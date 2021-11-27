package Operaciones;


public class Cajita {
    
    //Atributos de la clase
    int ancho;
    int alto;
    int profundo;
    
    // Constructores
    
    public Cajita(){
        System.out.println("Ejecuta Constructor Vacio");
    }
    
    public Cajita(int ancho, int alto, int profundo){
        System.out.println("Ejecuta Constructor constructor con argumentos");
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    
    
    // Metodos
    
    public int calcularVolumen(){
        return this.ancho * this.alto * this.profundo;
    }
    
}
