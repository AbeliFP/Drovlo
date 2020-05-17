import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Pruebas {
		static Menus men;
		
		@BeforeClass
		public static void beforeClass()
		{
			System.out.println("Antes de la clase");
			men = new Menus();
		}
		@Before
		public void before()
		{
			System.out.println("Metodo Before");
		}
		
		//Este metodo devuelve la empresa seleccionada
		@Test
		public void testMostrarEmpresa()
		{
			ArrayList<Producto> p1 = new ArrayList<Producto>();
			p1.add(new Producto("Whopper" , 300, 8 , "Carne  ,Cebolla y tomate ", 012457, "MCDONALDS"));
			p1.add(new Producto("SteakHouse" , 250, 6 , "Carne, Cebolla , tomate y Bacon ", 0124357, "MCDONALDS"));
			p1.add(new Producto("CheeseBurguer" , 250, 4 , "Carne ", 012, "MCDONALDS"));
			
			ArrayList<Empresa> empresas = new ArrayList<Empresa>();
			
			Empresa emp = new Empresa(0, "MCDONALDS" , "C/ PEPITO" , "917896532" , p1);
			empresas.add(emp);
			
			assertEquals(emp ,men.MostrarEmpresas(empresas));
		}
		@Test
		public void testMostrarProductos()
		{
			ArrayList<Producto> p1 = new ArrayList<Producto>();
			p1.add(new Producto("Whopper" , 300, 8 , "Carne  ,Cebolla y tomate ", 012457, "MCDONALDS"));
			p1.add(new Producto("SteakHouse" , 250, 6 , "Carne, Cebolla , tomate y Bacon ", 0124357, "MCDONALDS"));
			p1.add(new Producto("CheeseBurguer" , 250, 4 , "Carne ", 012, "MCDONALDS"));
			
			Producto esperado  = new Producto("Whopper" , 300, 8 , "Carne  ,Cebolla y tomate ", 012457, "MCDONALDS");
			
			assertEquals(esperado, men.MostrarProductos(p1));
		}
		

}
