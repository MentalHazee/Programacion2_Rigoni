package Integrador;

public class main {

	public static void main(String[] args) {
		
		Empresa emp = new Empresa();

        emp.agregarEmpleado(new EmpleadoSalarioFijo("43526896", "Lucas", "Orton", 2022, 85000));
        emp.agregarEmpleado(new EmpleadoAComision("32569856", "Manu", "Crespola", 2020, 62588, 250, 700));
        emp.agregarEmpleado(new EmpleadoSalarioFijo("40005669", "German", "Acuatico", 2018, 152000));

        emp.mostrarSalarios();

        System.out.println(emp.empleadoConMasClientes().nombreCompleto());
	}

}
