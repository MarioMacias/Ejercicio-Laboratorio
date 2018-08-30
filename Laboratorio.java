import java.util.ArrayList;

public class Laboratorio
{
    private ArrayList<Alumno> alumnos;

    public Laboratorio()
    {
        alumnos =  new  ArrayList < Alumno > ();
    }

    public void inscribir(String LabNombre, int LabClave)
    {
        Alumno alumno =  new  Alumno(LabNombre, LabClave);
        alumnos.add(alumno);
        System.out.println("Se Agrego el alumno correctamente.");
    }

    public void DarBaja(int LabClave)
    {
        if (alumnos.size() > 0) {
            int i = 0;
            while (i < alumnos.size()) {
                Alumno alumno = alumnos.get(i);
                if (alumno.DameCLave() == LabClave) {
                    alumnos.remove(i);
                    System.out.println("Se dio de baja correctamente.");
                }
                else {
                    System.out.println("No se pudo dar de baja, verifique la clave del alumno.");
                }
                i = i + 1;
            }
        }
        else {
            System.out.println("No se a agregado ningun alumno.");
        }
    }

    public void ListaAlumnos()
    {
        if (alumnos.size() > 0) {
            int i = 0;
            while (i < alumnos.size()) {
                Alumno alumno = alumnos.get(i);
                System.out.println(i + ". " + alumno);
                i = i + 1;
            }
        }
        else
        {
            System.out.println("No hay ningun alumno");
        }
    }
}
