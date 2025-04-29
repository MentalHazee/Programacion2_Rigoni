package PracticoColecciones;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Producto note = new Producto("54641", "Notebook", 6854.00, 5, CategoriaProducto.ELECTRONICA);
		Producto jarr = new Producto("545611", "Jarrón de la dinastia Ming", 8763532.00, 5, CategoriaProducto.HOGAR);
		Producto indi = new Producto("54", "Sombrero de Indiana Jones", 6799.00, 5, CategoriaProducto.ROPA);
		Producto lib = new Producto("78452", "El Quijote de La Mancha", 1200.00, 15, CategoriaProducto.LIBROS);
		Producto frut = new Producto("95231", "Caja de manzanas orgánicas", 45000.00, 30, CategoriaProducto.ALIMENTOS);
		Inventario x = new Inventario();
		
		x.agregarProducto(note);
		x.agregarProducto(jarr);
		x.agregarProducto(indi);
		x.agregarProducto(lib);
		x.agregarProducto(frut);
		
		//x.listarProductos();
		//x.listarProductosPorCategoria();
		
		//x.buscarProductoPorId("54641");
		//x.eliminarProducto("54");
		
		//x.actualizarStock("54641", 10);
		//x.buscarProductoPorId("54641");
		
		//x.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
		
		//int totalStock = x.obtenerTotalStock();
		//System.out.println("Total de stock: " + totalStock);
		
		//Producto mayorStock = x.obtenerProductoConMayorStock();
		//System.out.println("Producto con mayor stock: \n" + mayorStock.toString());
		
		/*
		ArrayList<Producto> filtroPrecio = new ArrayList<>();
		filtroPrecio = x.filtrarProductosPorPrecio(1000.00, 6800.00);
		for(Producto p : filtroPrecio) {
			System.out.println(p.toString());
		}*/
		
		x.mostrarCategoriasDisponibles();
		
		
	}

}
