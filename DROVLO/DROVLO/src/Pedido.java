import java.util.ArrayList;

public class Pedido {
	public ArrayList<Producto> productos;
	private int ID;

	
	public Pedido(int ID)
	{
		this.ID = ID;
		productos = new ArrayList<Producto>();
	}
	
	public void AddProducto(Producto p)
	{
		this.productos.add(p);
	}
}
