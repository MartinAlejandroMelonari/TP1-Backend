package com.example.TP1;

import com.example.TP1.entidades.*;
import com.example.TP1.repositorios.ClienteRep;
import com.example.TP1.repositorios.PedidoRep;
import com.example.TP1.repositorios.ProductoRep;
import com.example.TP1.repositorios.RubrosRep;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Tp1Application {
	@Autowired
	ClienteRep clienteRep;
	@Autowired
	RubrosRep rubrosRep;


	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
	}

	@Bean
	CommandLineRunner init(){
		return args -> {
			System.out.println("*-------Funcionando-------*");

			//CLIENTES
			Cliente cliente1 = Cliente.builder()
					.nombre("Martin")
					.apellido("Melonari")
					.telefono(123456)
					.email("mamelonari@gmail.com")
					.build();
			Cliente cliente2 = Cliente.builder()
					.nombre("Carlos")
					.apellido("Hernandez")
					.telefono(342166)
					.email("carlosh@gmail.com")
					.build();

			//DOMICILIOS
			Domicilio domicilio1 = Domicilio.builder()
					.calle("Yapeyu")
					.numero(681)
					.localidad("Gutierrez")
					.build();
			Domicilio domicilio2 = Domicilio.builder()
					.calle("San Martin")
					.numero(223)
					.localidad("Mendoza")
					.build();
			Domicilio domicilio3 = Domicilio.builder()
					.calle("Maza")
					.numero(211)
					.localidad("Maipu")
					.build();

			//PEDIDOS
			Pedido pedido1 = Pedido.builder()
					.estado("Iniciado")
					.fecha(LocalDate.of(2021,9,13))
					.tipoEnvio("Delivery")
					.total(2200)
					.build();
			Pedido pedido2 = Pedido.builder()
					.estado("Iniciado")
					.fecha(LocalDate.of(2021,9,13))
					.tipoEnvio("Delivery")
					.total(2400)
					.build();

			//FACTURAS
			Factura factura1 = Factura.builder()
					.fecha(LocalDate.of(2021,9,13))
					.descuento(20)
					.formaPago("Efectivo")
					.total(3000)
					.build();
			Factura factura2 = Factura.builder()
					.fecha(LocalDate.of(2021,9,13))
					.descuento(15)
					.formaPago("Efectivo")
					.total(3400)
					.build();

			//DetallesPedido
			DetallePedido detalle1 = DetallePedido.builder()
					.cantidad(2)
					.subtotal(2500)
					.build();
			DetallePedido detalle2 = DetallePedido.builder()
					.cantidad(1)
					.subtotal(2000)
					.build();

			//PRODUCTOS
			Producto producto1 = Producto.builder()
					.tipo("Insumo")
					.tiempoEstimadoCocina(1)
					.denominacion("Denominacion")
					.precioVenta(1000)
					.precioCompra(1200)
					.stockActual(67)
					.stockMinimo(10)
					.unidadMedida("Unidad medida")
					.receta("Receta")
					.build();
			Producto producto2 = Producto.builder()
					.tipo("Manufacturado")
					.tiempoEstimadoCocina(2)
					.denominacion("Denominacion")
					.precioVenta(2000)
					.precioCompra(2500)
					.stockActual(6)
					.stockMinimo(5)
					.unidadMedida("Unidad medida")
					.receta("Receta")
					.build();

			//RUBROS
			Rubro rubro1 = Rubro.builder()
					.denominacion("Denominacion")
					.build();

			cliente1.setDomicilios(List.of(domicilio1,domicilio2));
			cliente1.setPedidos(List.of(pedido1));

			cliente2.setDomicilios(List.of(domicilio3));
			cliente2.setPedidos((List.of(pedido2)));

			pedido1.setFactura(factura1);
			pedido1.setDetallePedidoList(List.of(detalle1,detalle2));

            pedido2.setDetallePedidoList(List.of(detalle2));

			detalle1.setProducto(producto1);
			detalle2.setProducto((producto2));

			rubro1.setProductos(List.of(producto1));
			rubro1.setProductos((List.of(producto2)));

			clienteRep.save(cliente1);
			clienteRep.save(cliente2);
			rubrosRep.save(rubro1);


		};
	}
}
