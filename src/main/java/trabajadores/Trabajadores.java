package trabajadores;
//CLASE GUIA
public class Trabajadores {
    
    
    public String nombre;
    public String apellido;
    public int edad;
    public int telefono;
    public int dni;
    public int salario;

    public Trabajadores(String nombre, String apellido, int edad, int telefono, int dni, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.dni = dni;
        this.salario = salario;
    }

 
    public Trabajadores() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getDni() {
        return dni;
    }

    public int getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    
}
