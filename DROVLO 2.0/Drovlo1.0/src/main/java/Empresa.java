import java.util.ArrayList;

public class Empresa {
	private int ID;
	private String nombre;
	private String direccion;
	private String telefono;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	private ArrayList<Producto> productos;
	
	public Empresa(int ID, String nombre, String direccion, String telefono, ArrayList<Producto> productos)
	{
		this.ID = ID;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.productos = productos;
	}
	@Override
	public String toString() {
		return "Empresa [ID=" + ID + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}
	
}
