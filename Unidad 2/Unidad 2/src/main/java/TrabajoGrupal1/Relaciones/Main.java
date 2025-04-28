package TrabajoGrupal1.Relaciones;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Declaración de objetos

        Escuela utn = new Escuela(115, "Universidad", "UTN FRM");

        DivisionCurso dcurso = new DivisionCurso(25, 24, 2, utn);

        Catedra matematicaTurnoNoche = new Catedra(1322, "Mat", dcurso);
        Catedra fisicaMadrugada = new Catedra(1254, "Fis", dcurso);

        Alumno lucas = new Alumno(3, "Lucas", "Orton", new Date(2000,15,05), fisicaMadrugada);

        Nota notaLucas1 = new Nota(1254, 10, new Date(2025, 4, 22), false, fisicaMadrugada, lucas);
        Nota notaLucas2 = new Nota(1254, 9, new Date(2025, 4, 22), false, matematicaTurnoNoche, lucas);
        Nota notaLucas3 = new Nota(1254, 7, new Date(2025, 4, 22), false, fisicaMadrugada, lucas);
        Nota notaLucas4 = new Nota(1254, 7, new Date(2025, 4, 22), false, fisicaMadrugada, lucas);
        Nota notaLucas5 = new Nota(1254, 5, new Date(2025, 4, 22), false, fisicaMadrugada, lucas);

        //métodos

        utn.agregarDivisionCurso(dcurso);

        dcurso.agregarCatedra(matematicaTurnoNoche);
        dcurso.agregarCatedra(fisicaMadrugada);

        fisicaMadrugada.agregarAlumno(lucas);

        fisicaMadrugada.agregarNota(notaLucas1);
        fisicaMadrugada.agregarNota(notaLucas2);
        fisicaMadrugada.agregarNota(notaLucas3);
        fisicaMadrugada.agregarNota(notaLucas4);
        fisicaMadrugada.agregarNota(notaLucas5);

        System.out.println("La mejor nota de "+ lucas.getNombre()+" es "+lucas.mejorNota(fisicaMadrugada.getCodigo()));

        System.out.println("El promedio de "+lucas.getNombre()+" es "+lucas.promedioNotas(fisicaMadrugada.getCodigo()));

        Alumno a = fisicaMadrugada.mejorAlumnoCatedra();
        System.out.println("El mejor alumno del a catedra es: "+a.getNombre() + " " + a.getApellido());

        Alumno b = dcurso.mejorAlumnoDivisionCurso();
        System.out.println("El mejor alumno de la división es: "+b.getNombre() + " " + b.getApellido());

        System.out.println("El mejor alumno de la escuela es: "+utn.getMejorAlumnoEscuela(2000));

        System.out.println(utn.obtenerMejoresTresAlumnosEscuela());

        System.out.println("El nombre del alumno es "+lucas.getNombre()+ " y su nota es un "+notaLucas1.getValor());

        utn.imprimirDivisiones();

        Alumno c = new Alumno(25, "German", "Marino", );
        Alumno c = utn.getMejoresAlumnos();
        utn.toString(utn);

    }
}
