import java.util.ArrayList;

public class Laboratorio
{
    private ArrayList<Alumno> alumnos;
    
    public Laboratorio()
    {
        alumnos = new ArrayList<Alumno>();
    }
    
    public void inscribir(String LabNombre, int LabClave)
    {
        Alumno alumno = new Alumno(LabNombre, LabClave);
        alumnos.add(alumno);
    }
    
    public void DarBaja(int LabClave)
    {
        for(int i = 0; i < alumnos.size(); i++)
        {
            Alumno alumno = alumnos.get(i);
        
        }
    
    }
}
