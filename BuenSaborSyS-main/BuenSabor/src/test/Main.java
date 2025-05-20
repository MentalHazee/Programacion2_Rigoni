package test;

import entidades.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {

		// 1. Testing Articulo y ArticuloInsumo
		System.out.println("--- Articulo and ArticuloInsumo ---");
		Articulo articuloBase = new Articulo("Producto Generico", 25.50);
		System.out.println("Articulo: " + articuloBase);

		ArticuloInsumo insumo = new ArticuloInsumo("Ingredient A", 10.00, 5.00, 100, 500, true);
		System.out.println("ArticuloInsumo: " + insumo);

		// 2. Testing Empresa
		System.out.println("\n--- Empresa ---");
		Empresa empresa = new Empresa("Mi Empresa", "Mi Razon Social", 123456789);
		System.out.println("Empresa: " + empresa);

		// 3. Testing Promocion y TipoPromocionEnum
		System.out.println("\n--- Promocion ---");
		Promocion promocion = new Promocion("Summer Sale", LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 31),
				LocalTime.of(9, 0), LocalTime.of(17, 0), "20% off", 19.99, TipoPromocionEnum.promocion1);
		System.out.println("Promocion: " + promocion);

		// 4. Testing Sucursal y LocalTime
		System.out.println("\n--- Sucursal ---");
		Sucursal sucursal = new Sucursal("Sucursal Principal", LocalTime.of(8, 0), LocalTime.of(20, 0));
		System.out.println("Sucursal: " + sucursal);

		// 5. Testing Domicilio
		System.out.println("\n--- Domicilio ---");
		Domicilio domicilio = new Domicilio("Libertador 1500", 10, 12345);
		System.out.println("Domicilio: " + domicilio);

		// 6. Testing Cliente
		System.out.println("\n--- Cliente ---");
		Cliente cliente = new Cliente("Pepe", "Gomez", "124213123241", "pepegomez@gmail.com",
				LocalDate.of(1990, 5, 15));
		System.out.println("Cliente: " + cliente);

		// 7. Testing Pedido y Enums
		System.out.println("\n--- Pedido ---");
		Pedido pedido = new Pedido(LocalTime.of(12, 30), 55.75, 30.00, EstadoEnum.preparacion, TipoEnvioEnum.delivery,
				FormaPagoEnum.efectivo, LocalDate.now(), cliente);
		System.out.println("Pedido: " + pedido);

		// 8. Testing Factura
		System.out.println("\n--- Factura ---");
		Factura factura = new Factura(LocalDate.now(), 1234, 9876, "ref123", "card", FormaPagoEnum.efectivo, 100.50,
				pedido);
		System.out.println("Factura: " + factura);

		// 9. Testing ArticuloManufacturado y ArticuloManufacturadoDetalle
		System.out.println("\n--- ArticuloManufacturado y ArticuloManufacturadoDetalle ---");
		ArticuloManufacturado manufacturado = new ArticuloManufacturado("Pizza", 20.00, 30, "A la Piedra");
		ArticuloManufacturadoDetalle detalle = new ArticuloManufacturadoDetalle(2);
		manufacturado.addDetalle(detalle);

		System.out.println("ArticuloManufacturado: " + manufacturado);
		System.out.println("ArticuloManufacturadoDetalle: " + detalle);

		// 10. Testing del resto de las clases
		System.out.println("\n--- Resto de Clases ---");
		Imagen imagen = new Imagen("Producto Imagen");
		Categoria categoria = new Categoria("Comida");
		Localidad localidad = new Localidad("CABA");
		Provincia provincia = new Provincia("Buenos Aires");
		Pais pais = new Pais("Argentina");
		UnidadMedida unidadMedida = new UnidadMedida("kg");
		Usuario usuario = new Usuario("auth0123", "pepegomez");
		DetallePedido detallePedido = new DetallePedido(5, 20.0);

		System.out.println("Imagen: " + imagen);
		System.out.println("Categoria: " + categoria);
		System.out.println("Localidad: " + localidad);
		System.out.println("Provincia: " + provincia);
		System.out.println("Pais: " + pais);
		System.out.println("UnidadMedida: " + unidadMedida);
		System.out.println("Usuario: " + usuario);
		System.out.println("DetallePedido: " + detallePedido);
	}
}
