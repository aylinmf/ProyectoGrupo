
package proyecto;


public class Cliente {
    private long Dni;
    private String Nombres;
    private String Apellidos;

    public Cliente(){
        
    }
    public Cliente(int Dni, String Nombres, String Apellidos) {
        this.Dni = Dni;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
}
