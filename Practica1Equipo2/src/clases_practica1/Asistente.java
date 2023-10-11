package clases_practica1;

public class Asistente 
{
    private int identificador;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;//Quizás se pueda usar un objeto de tipo "LocalDate", en vez de un String
    private boolean requiereAtencionEspecial;

    public Asistente()
    {
        this.identificador = 0;
        this.nombre = "";
        this.apellidos = "";
        this.fechaNacimiento = "";
        this.requiereAtencionEspecial = false;
    }

    public Asistente(int identificador, String nombre, String apellidos, String fechaNacimiento, boolean requiereAtencionEspecial)
    {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.requiereAtencionEspecial = requiereAtencionEspecial;
    }

    public int getIdentificador()
    {
        return identificador;
    }

    public void setIdentificador(int identificador)
    {
        this.identificador = identificador;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean requiereAtencionEspecial()
    {
        return requiereAtencionEspecial;
    }

    public void requiereAtencionEspecial(boolean requiereAtencionEspecial)
    {
        this.requiereAtencionEspecial = requiereAtencionEspecial;
    }

    public String toString() 
    {
        return "Asistente [identificador=" + identificador + ", nombre=" + nombre + ", apellidos=" + apellidos
                + ", fechaNacimiento=" + fechaNacimiento + ", requiereAtencionEspecial=" + requiereAtencionEspecial
                + "]";
    }
}