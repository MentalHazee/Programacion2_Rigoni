package TrabajoGrupal1.Relaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Escuela {

    private int numero;
    private String denominacion;
    private List<DivisionCurso> divisiones;
    private List<Alumno> mejoresAlumnos;
    private String nombre;

    public Escuela(int numero, String denominacion, String nombre) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.nombre = nombre;
        this.divisiones = new ArrayList<>();
    }
/*@Override
    public String toString() {
        String divisionesStr = (divisiones != null) ? divisiones.stream().map(Object::toString).collect(Collectors.joining(", ")) : "";
        String mejoresAlumnosStr = (MejoresAlumnos != null) ? MejoresAlumnos.stream().map(Object::toString).collect(Collectors.joining(", ")) : "";

        return "Escuela{" +
                "numero=" + numero +
                ", denominacion='" + denominacion + '\'' +
                ", divisiones=[" + divisionesStr + "]" +
                ", MejoresAlumnos=[" + mejoresAlumnosStr + "]" +
                ", nombre='" + nombre + '\'' +
                '}';
    }*/

    public String toString(Escuela escu) {
        StringBuilder sb = new StringBuilder("Escuela{");
        sb.append("numero=").append(escu.getNumero())
                .append(", denominacion='").append(escu.getDenominacion()).append('\'')
                .append(", nombre='").append(escu.getNombre()).append('\'')
                .append(", divisiones=[");

        if (!escu.getDivisiones().isEmpty()) {
            for (int i = 0; i < escu.getDivisiones().size(); i++) {
                sb.append(escu.getDivisiones().get(i));
                if (i < escu.getDivisiones().size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("], mejoresAlumnos=[");

        if (!escu.getMejoresAlumnos().isEmpty()) {
            for (int i = 0; i < escu.getMejoresAlumnos().size(); i++) {
                sb.append(escu.getMejoresAlumnos().get(i));
                if (i < escu.getMejoresAlumnos().size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]}");
        return sb.toString();
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<DivisionCurso> getDivisionCursos() {
        return divisiones;
    }

    public void setDivisionCursos(List<DivisionCurso> divisionCursos) {
        this.divisiones = divisionCursos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<DivisionCurso> getDivisiones() {
        return divisiones;
    }

    public void agregarDivisionCurso (DivisionCurso divi){
        this.divisiones.add(divi);
    }

    public List<Alumno> getMejoresAlumnos() {
        return mejoresAlumnos;
    }

    //A4

    public Alumno getMejorAlumnoEscuela(int anioNacimientoAlumno) {
        Alumno mejorAlumno = null;
        double mejorPromedio = 0;

        for (DivisionCurso division : divisiones) {
            for (Catedra catedra : division.getCatedras()) {
                for (Alumno alumno : catedra.getAlumnos()) {
                    // Chequeamos año de nacimiento
                    @SuppressWarnings("deprecation")
                    int anioNacimiento = alumno.getFechaNacimiento().getYear() + 1900;

                    if (anioNacimiento == anioNacimientoAlumno) {
                        List<Nota> notasValidas = new ArrayList<>();
                        boolean tieneRecuperatorios = false;

                        for (Nota nota : alumno.getNotas()) {
                            if (nota.isEsRecuperatorio()) {
                                tieneRecuperatorios = true;
                                break;
                            }
                            notasValidas.add(nota);
                        }

                        if (!tieneRecuperatorios && notasValidas.size() >= 5) {
                            double suma = 0;
                            for (Nota nota : notasValidas) {
                                suma += nota.getValor();
                            }
                            double promedio = suma / notasValidas.size();

                            if (promedio > mejorPromedio) {
                                mejorPromedio = promedio;
                                mejorAlumno = alumno;
                            }
                        }
                    }
                }
            }
        }

        return mejorAlumno;
    }

    //A6

    class AlumnoPromedio {
        private Alumno alumno;
        private double promedio;

        public AlumnoPromedio(Alumno alumno, double promedio) {
            this.alumno = alumno;
            this.promedio = promedio;
        }

        public Alumno getAlumno() {
            return alumno;
        }

        public double getPromedio() {
            return promedio;
        }
    }

    public List<Alumno> obtenerMejoresTresAlumnosEscuela() {
        List<Alumno> mejoresAlumnosDivision = new ArrayList<>();
        for (DivisionCurso division : divisiones) {
            Alumno mejorAlumno = division.mejorAlumnoDivisionCurso();
            if (mejorAlumno != null) {
                mejoresAlumnosDivision.add(mejorAlumno);
            }
        }

        List<AlumnoPromedio> alumnosConPromedio = new ArrayList<>();
        for (Alumno alumno : mejoresAlumnosDivision) {
            double sumaNotas = 0;
            int cantidadNotas = 0;
            for (DivisionCurso division : divisiones) {
                for (Nota nota : division.mejorAlumnoDivisionCurso().getNotas()) {
                    if (nota.getAlumno().equals(alumno)) {
                        sumaNotas += nota.getValor();
                        cantidadNotas++;
                    }
                }
            }
            double promedio = (cantidadNotas > 0) ? sumaNotas / cantidadNotas : 0.0;
            alumnosConPromedio.add(new AlumnoPromedio(alumno, promedio));
        }

        alumnosConPromedio.sort(Comparator.comparingDouble(AlumnoPromedio::getPromedio).reversed());

        List<Alumno> mejoresTres = new ArrayList<>();
        for (int i = 0; i < Math.min(3, alumnosConPromedio.size()); i++) {
            mejoresTres.add(alumnosConPromedio.get(i).getAlumno());
        }

        return mejoresTres;
    }

    public void imprimirDivisiones(){
        for (DivisionCurso iteradorDivisiones: divisiones){
            System.out.println(iteradorDivisiones.toString() + iteradorDivisiones.getCatedras().toString());
        }
    }

    /*@Override
    public String toString() {
        return "Escuela{" +
                "numero=" + numero +
                ", denominacion='" + denominacion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }*/
}




