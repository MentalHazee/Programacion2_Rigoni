package TrabajoGrupal1.Relaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catedra {

    private int codigo;
    private String denominacion;
    private DivisionCurso divisionCurso;
    private List<Alumno> alumnos;
    private List<Nota> notas;

    public Catedra() {
    }

    public Catedra(int codigo, String denominacion, DivisionCurso divisionCurso) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.divisionCurso = divisionCurso;
        this.alumnos = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    /*@Override
    public String toString() {
        String divisionCursoStr = (divisionCurso != null) ? divisionCurso.toString() : "null";
        String alumnosStr = (alumnos != null) ? alumnos.stream().map(Object::toString).collect(Collectors.joining(", ")) : "";
        String notasStr = (notas != null) ? notas.stream().map(Object::toString).collect(Collectors.joining(", ")) : "null";

        return "Catedra{" +
                "codigo=" + codigo +
                ", denominacion='" + denominacion + '\'' +
                ", divisionCurso=" + divisionCursoStr +
                ", alumnos=[" + alumnosStr + "]" +
                ", notas=[" + notasStr + "]" +
                '}';
    }*/

    public void agregarNota(Nota nota) {
        this.notas.add(nota);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public DivisionCurso getDivisionCurso() {
        return divisionCurso;
    }

    public void setDivisionCurso(DivisionCurso divisionCurso) {
        this.divisionCurso = divisionCurso;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public Alumno mejorAlumnoCatedra() {
        double promedio, mayor = 0;
        Alumno a = null;
        for (Alumno alumno : alumnos) {
            promedio = alumno.promedioNotas(alumno.getCatedra().getCodigo());
            if (promedio > mayor){
                mayor = promedio;
                a = alumno;
            }
        }
        return a;
    }

    @Override
    public String toString() {
        return "Catedra{" +
                "codigo=" + codigo +
                ", denominacion='" + denominacion + '\'' +'}';
    }
}


