import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
				System.out.println("1) Cambiar de restaurante");
			else
				System.out.println("1) Mirar los restaurantes cerca mia");
			
			System.out.println("2) Mirar los productos disponibles");
			System.out.println("3) Ver mi cesta");
			System.out.println("4) Quitar productos de la cesta");
			System.out.println("5) Cerrar la aplicacion");
			
		
			option = sc.nextInt();
			if (option == 2 && !c)
				System.out.println("Debes haber elegido un Restaurante antes...");
			else if (option<= 5 && option >= 1)
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
			System.out.println(cont.toString() + ") " + e.getNombre());
			System.out.println(e.getDireccion());
			System.out.println(e.getTelefono());
			System.out.println("=====================================================");
			cont ++;
		}
		System.out.println("-1 ) Salir");
			
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option > arr.size() || option < -1)
		{
			System.out.println("Ese indice no existe");
			return(null);
		}
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
			System.out.println(cont.toString() + ") " + p.getNombre() );
			System.out.println(p.getDescripcion());
			System.out.println("			" + p.getPrecio().toString() + "€");
			System.out.println("=====================================================");
			cont ++;
		}
		System.out.println("-1 ) Salir");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option > arr.size() || option < -1)
		{
			System.out.println("Ese indice no existe");
			return(null);
		}
		if (option == -1)
				return (null);
		return (arr.get(option - 1 ));
	}
	
	public static void MostrarPedido (Pedido p)
	{
		Integer total = 0 ;
		System.out.println("Cesta : ");
		System.out.println("=====================================================");
		for(Producto prod : p.getProductos())
		{
			System.out.println("(*) " + prod.getNombre() +"( " + prod.getEmpresa() + " )" +  " ............... " + prod.getPrecio().toString());
			total += prod.getPrecio();
		}
		System.out.println("=====================================================");
		System.out.println("TOTAL -> " + total.toString() + "€");
	}
	
	public static boolean Loggin()
	{
		String path = "C:\\Users\\dgala\\OneDrive\\Escritorio\\DROVLO\\Drovlo1.0\\pswd.txt";
		String pass = "";
		BufferedReader br;
		Scanner sc = new Scanner(System.in);
		FileReader fr;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			pass = br.readLine();
			if (pass.equals(sc.nextLine()))
				return true;
			return false;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	public static void DeleteProducto(ArrayList<Producto> arr)
	{
		Integer cont = 1; 
		System.out.println("Selecciona el producto que quieras eliminar: ");
		System.out.println("=====================================================");
		
		for (Producto p : arr)
		{
			System.out.println(cont.toString() + ") " + p.getNombre() );
			System.out.println(p.getDescripcion());
			System.out.println("			" + p.getPrecio().toString() + "€");
			System.out.println("=====================================================");
			cont ++;
		}
		System.out.println("-1 ) Salir");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option > arr.size() || option < -1)
		{
			System.out.println("Ese indice no existe");
			return;
		}
		if (option == -1)
				return ;
		arr.remove(option -1);
	}
}
