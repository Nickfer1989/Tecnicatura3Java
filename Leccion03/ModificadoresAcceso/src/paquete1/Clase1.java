package paquete1;


public class Clase1 {
    public String atributoPublic = "valor atributo public";
    protected String atributoProtected = "valor atributo protected";
    
    public Clase1(){
        System.out.println("Contructor public");
    }
    
    protected Clase1(String atributoPublic){
        System.out.println("Constructor protected");
    }
    
    public void metodoPublico(){
        System.out.println("Método public");
    }
    
    protected void metodoProtected(){
        System.out.println("Método protected");
    }
}
