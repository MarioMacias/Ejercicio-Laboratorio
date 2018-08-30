
public class Alumno
{
    private String nombre;
    private int clave;

    public Alumno(String nombre, int clave)
    {
        this. nombre = nombre;
        this.clave = clave;
    }
    
    public int DameCLave()
    {
        return clave;
    }
    
    public String toString()
    {
        String aux = "ALumno: " + nombre + ", Clave: " + clave;
        return aux;
    }
}
