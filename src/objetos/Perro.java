package objetos;

public class Perro {
    
    private String nombre;

    public Perro() {
        this.nombre = nombre;
    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void gouf(){
        System.out.println("gouf");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perro{");
        sb.append("nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
}
