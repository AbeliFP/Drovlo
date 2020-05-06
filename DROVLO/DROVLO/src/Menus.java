import java.util.ArrayList;
import java.util.Scanner;

public class Menus {
	public static int MenuPrincipal (boolean c)
	{
		Scanner sc = new Scanner(System.in);
		int option = 0;
		
		while  (true)
		{
			System.out.println("			BIENVENIDO A DROVLO				");
			System.out.println("============================================");
			System.out.println(" Seleccciona la acción que deseas realizar : ");
			if (c)
			{
				System.out.println("1) Cambiar de restaurante");
			}
			else
			{
				System.out.println("1) Mirar los restaurantes cerca mia");
			}
			System.out.println("2) Mirar los productos disponibles");
			System.out.println("3) Ver mi cesta");
			System.out.println("4) Cerrar la aplicacion");
			
		
			option = sc.nextInt();
			if (option == 2 && !c)
				System.out.println("Debes haber elegido un Restaurante antes...");
			else if (option<= 4 && option >= 1)
				break;
			else 
				System.out.println("Introduce una opción valida");
				
		}
		
		return (option);
	}
	
	public static Empresa MostrarEmpresas (ArrayList<Empresa> arr)
	{
		Integer cont = 1;
		System.out.println(" Empresas para seleccionar cerca tuya:");
		System.out.println("=====================================================");
		for (Empresa e : arr)
		{
			System.out.println(cont.toString() + ") " + e.nombre);
			System.out.println(e.direccion);
			System.out.println(e.telefono);
			System.out.println("=====================================================");
			cont ++;
		}
		System.out.println("-1 ) Salir");
			
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option == -1)
				return (null);
		return (arr.get(option - 1 ));
	}
	
	public static Producto MostrarProductos(ArrayList<Producto> arr)
	{
		Integer cont = 1; 
		System.out.println("Productos para seleccionar : ");
		System.out.println("=====================================================");
		
		for (Producto p : arr)
		{
			System.out.println(cont.toString() + ") " + p.nombre );
			System.out.println(p.descripcion);
			System.out.println("			" + p.precio.toString() + "€");
			System.out.println("=====================================================");
			cont ++;
		}
		System.out.println("-1 ) Salir");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option == -1)
				return (null);
		return (arr.get(option - 1 ));
	}
	
	public static void MostrarPedido (Pedido p)
	{
		Integer total = 0 ;
		System.out.println("Cesta : ");
		System.out.println("=====================================================");
		for(Producto prod : p.productos)
		{
			System.out.println("(*) " + prod.nombre + " ............... " + prod.precio.toString());
			total += prod.precio;
		}
		System.out.println("=====================================================");
		System.out.println("TOTAL -> " + total.toString() + "€");
	}
}
