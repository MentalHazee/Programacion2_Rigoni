package Practico_4.GestionDeEmpleados;
import java.text.DecimalFormat;

public class Empleados {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    private static final DecimalFormat FORMATO = new DecimalFormat("#,###.00");

    public Empleados(String nombre, String puesto, double salario) {
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleados(String nombre, String puesto) {
        id = ++totalEmpleados;
        salario = 500000;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void actualizarSalario(int porcentaje){
        salario = salario + (salario * porcentaje/100);
        System.out.println("El incremento del "+porcentaje+ "% en el salario es de: "+FORMATO.format(salario));
    }
    public void actualizarSalario(double salarioFijo){
        salario = salarioFijo;
        System.out.println("El salario ahora es de: "+ FORMATO.format(salario));
    }

    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    @Override
    public String toString(){
      return "\nEmpleado ID: " + id +
              "\nNombre: " + nombre +
              "\nSalario $: " + FORMATO.format(salario);
    }

}
