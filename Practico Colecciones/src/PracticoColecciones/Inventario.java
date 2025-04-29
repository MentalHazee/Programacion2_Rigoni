package PracticoColecciones;

import java.util.ArrayList;

public class Inventario {
	private ArrayList<Producto> productos = null;

	public Inventario() {
		super();
	}

	public Inventario(ArrayList<Producto> productos) {
		super();
		this.productos = productos;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void agregarProducto(Producto p) {
		if (this.productos == null) {
			this.productos = new ArrayList();
		}
		productos.add(p);
		System.out.println("Se agregó el producto \n" + p.toString() + "\n");
	}

	public void listarProductos() {
		for (Producto produs : productos) {
			System.out.println(produs.toString() + "\n");
		}
	}

	public void listarProductosPorCategoria() {
		for (Producto cate : productos) {
			System.out.println(cate.getCategoria());
		}
	}

	public void buscarProductoPorId(String id) {
		boolean x = true;

		if (this.productos == null) {
			System.out.println("El inventario está vacío");
			x = true;
		}

		if (this.productos != null) {
			for (Producto prod : productos) {
				if (prod.getId() == id) {
					System.out.println(prod.toString());
					x = false;
				}
			}
		}
		if (x == true && productos != null) {
			System.out.println("No existe un producto con ese ID");
		}
	}
	
	public void eliminarProducto(String id) {
		boolean x = true;

		if (this.productos == null) {
			System.out.println("El inventario está vacío");
			x = true;
		}

		if (this.productos != null) {
			for (Producto prod : productos) {
				if (prod.getId() == id) {
					productos.remove(id);
					System.out.println("Se ha eliminado el producto correctamente");
					x = false;
				}
			}
		}
		if (x == true && productos != null) {
			System.out.println("No existe un producto con ese ID");
		}
	}
	
	 public void actualizarStock(String id, int nuevaCantidad) {
	        for (Producto producto : productos) {
	            if (producto.getId().equals(id)) {
	                producto.setCantidad(nuevaCantidad);
	                System.out.println("Stock actualizado: " + producto);
	                return;
	            }
	        }
	        System.out.println("Producto con ID " + id + " no encontrado.");
	    }

	    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
	        ArrayList<Producto> productosFiltrados = new ArrayList<>(); 
	        for (Producto producto : productos) {
	            if (producto.getCategoria() == categoria) {
	                productosFiltrados.add(producto);
	            }
	        }
	        return productosFiltrados;
	    }

	    public void mostrarInventario() {
	        for (Producto producto : productos) {
	            System.out.println(producto);
	        }
	    }
	    
	    public int obtenerTotalStock() {
	        int totalStock = 0;
	        for (Producto producto : productos) {
	            totalStock += producto.getCantidad();
	        }
	        return totalStock;
	    }

	    public Producto obtenerProductoConMayorStock() {
	        if (productos.isEmpty()) {
	            return null; 
	        }
	        Producto productoMayorStock = productos.get(0);
	        for (Producto producto : productos) {
	            if (producto.getCantidad() > productoMayorStock.getCantidad()) {
	                productoMayorStock = producto;
	            }
	        }
	        return productoMayorStock;
	    }

	    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
	        ArrayList<Producto> productosFiltrados = new ArrayList<>();
	        for (Producto producto : productos) {
	            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
	                productosFiltrados.add(producto);
	            }
	        }
	        return productosFiltrados;
	    }

	    public void mostrarCategoriasDisponibles() {
	        System.out.println("Categorías disponibles:");
	        for (CategoriaProducto categoria : CategoriaProducto.values()) {
	            System.out.println("- " + categoria + ": Descripción de la categoría " + categoria);
	        }
	    }

}
