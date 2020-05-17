import java.util.ArrayList;

public class Pedido {
	private ArrayList<Producto> productos;
	private int ID;

	
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

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
