
public class Cliente {
	private int ID;
	private String nombre;
	private String DNI;
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

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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

	private String direccion;
	private String telefono;
	
	public Cliente (int ID, String nombre, String DNI, String direccion, String telefono)
	{
		this.ID = ID;
		this.nombre = nombre;
		this.DNI = DNI;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Cliente [ID=" + ID + ", nombre=" + nombre + ", DNI=" + DNI + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}
}
