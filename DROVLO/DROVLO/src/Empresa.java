import java.util.ArrayList;

public class Empresa {
	public int ID;
	public String nombre;
	public String direccion;
	public String telefono;
	public ArrayList<Producto> productos;
	
	public Empresa(int ID, String nombre, String direccion, String telefono, ArrayList<Producto> productos)
	{
		this.ID = ID;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.productos = productos;
	}
	
}
