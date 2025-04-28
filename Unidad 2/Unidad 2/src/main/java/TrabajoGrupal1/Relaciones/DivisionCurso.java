package TrabajoGrupal1.Relaciones;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DivisionCurso {

    private int codigo;
    private int anio;
    private int division;
    private Escuela escuela;
    private List<Catedra> catedras;

    public DivisionCurso() {
    }

    public DivisionCurso(int codigo, int anio, int division, Escuela escuela) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
        this.escuela = escuela;
        this.catedras = new ArrayList<>();
    }

    /*@Override
    public String toString() {
        String catedrasStr = (catedras != null) ? catedras.stream().map(Object::toString).collect(Collectors.joining(", ")) : "";
        String escuelaStr = (escuela != null) ? escuela.toString() : "null";

        return "DivisionCurso{" +
                "codigo=" + codigo +
                ", anio=" + anio +
                ", division=" + division +
                ", escuela=" + escuelaStr +
                ", catedras=[" + catedrasStr + "]" +
                '}';
    }*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public void agregarCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public Alumno mejorAlumnoDivisionCurso(){

        /*Codifique en la clase DivisionCurso un método
        denominado “public Alumno mejorAlumnoDivisionCurso()” que
        retorne el alumno con mejor promedio de notas contemplando la
        totalidad de cátedras, y cuyo promedio sea el resultante de al menos 5
        examenes y que nunca haya recuperado.*/

        double mejor = 0, prom, suma = 0;
        int contador = 0;
        Alumno a = null;
        for (Catedra catedra : catedras){
            for (Nota notas : catedra.getNotas()) {
                suma += notas.getValor();
                contador++;
                prom = suma/contador;
                if (prom > mejor){
                    mejor = prom;
                    a = notas.getAlumno();
                }
            }
        }
        return a;
    }

    @Override
    public String toString() {
        return "DivisionCurso{" +
                "codigo=" + codigo +
                ", anio=" + anio +
                ", division=" + division +'}';
    }
}
