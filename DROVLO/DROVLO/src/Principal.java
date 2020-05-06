import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Producto> p1 = new ArrayList<Producto>();
		p1.add(new Producto("Whopper" , 300, 8 , "Carne  ,Cebolla y tomate ", 012457));
		p1.add(new Producto("SteakHouse" , 250, 6 , "Carne, Cebolla , tomate y Bacon ", 0124357));
		p1.add(new Producto("CheeseBurguer" , 250, 4 , "Carne ", 012));
		
		ArrayList<Producto> p2 = new ArrayList<Producto>();
		p2.add(new Producto("Whopper" , 300, 8 , "Carne  ,Cebolla y tomate ", 012457));
		p2.add(new Producto("SteakHouse" , 250, 6 , "Carne, Cebolla , tomate y Bacon ", 0124357));
		p2.add(new Producto("CheeseBurguer" , 250, 4 , "Carne ", 012));
		
		ArrayList<Producto> p3 = new ArrayList<Producto>();
		p3.add(new Producto("Margarita" , 300, 8 , "", 012457));
		p3.add(new Producto("Carbonara" , 250, 14, "Champiñones ", 0124357));
		p3.add(new Producto("Barbacoa" , 250, 14 , "Carne , Pepperoni ", 012));
		
		ArrayList<Producto> p4 = new ArrayList<Producto>();
		p4.add(new Producto("Margarita" , 300, 8 , "", 012457));
		p4.add(new Producto("Carbonara" , 250, 14, "Champiñones ", 0124357));
		p4.add(new Producto("Barbacoa" , 250, 14 , "Carne , Pepperoni ", 012));
		
		ArrayList<Producto> p5 = new ArrayList<Producto>();
		p5.add(new Producto("Margarita" , 300, 8 , "", 012457));
		p5.add(new Producto("Carbonara" , 250, 14, "Champiñones ", 0124357));
		p5.add(new Producto("Barbacoa" , 250, 14 , "Carne , Pepperoni ", 012));
		
		ArrayList<Producto> p6 = new ArrayList<Producto>();
		p6.add(new Producto("Margarita" , 300, 8 , "", 012457));
		p6.add(new Producto("Carbonara" , 250, 14, "Champiñones ", 0124357));
		p6.add(new Producto("Barbacoa" , 250, 14 , "Carne , Pepperoni ", 012));
		
		ArrayList<Empresa> empresas = new ArrayList<Empresa>();
		empresas.add(new Empresa(0, "MCDONALDS" , "C/ PEPITO" , "917896532" , p1));
		empresas.add(new Empresa(0, "BURGUER KING" , "C/ Juanito" , "917896532", p2));
		empresas.add(new Empresa(0, "100 Montaditos" , "C/ Fulanito" , "917846532" , p3));
		empresas.add(new Empresa(0, "Telepizza" , "C/ Menganito" , "917676532", p4));
		empresas.add(new Empresa(0, "Dominos" , "C/ Pepe" , "9171236532", p5));
		empresas.add(new Empresa(0, "Pizza Hat" , "C/ Juan" , "9178996532",p6));
		
		Pedido p = new Pedido(1254);
		Empresa selected = null;
		Producto currentproducto = null;
		int option = 0;
		while (option != 4)
		{
			if (selected == null)
				option = Menus.MenuPrincipal(false);
			else
				option = Menus.MenuPrincipal(true);
			
			switch (option)
			{
			case 1: 
				selected = Menus.MostrarEmpresas(empresas);
				break;
			case 2:
				currentproducto = Menus.MostrarProductos(selected.productos);
				if (currentproducto != null)
					p.AddProducto(currentproducto);
				break;
			case 3:
				Menus.MostrarPedido(p);
				break;
			case 4:
				if (p.productos.isEmpty())
					System.out.println("Vuelve pronto");
				else
					System.out.println("Tu Pedido llegara en 40 minutos");
				break;
				
			}
		}
	}

}
