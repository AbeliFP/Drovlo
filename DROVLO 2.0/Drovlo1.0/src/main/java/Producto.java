
public class Producto {
	private String empresa;
	private String nombre;
	private String descripcion;
	private int peso;
	private Integer precio;
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	private int ID;
	
		public Producto(String nombre, int peso, int precio , String descripcion , int ID,String empresa)
		{
			this.nombre = nombre;
			this.peso = peso;
			this.precio = precio;
			this.descripcion = descripcion;
			this.ID = ID;
			this.empresa = empresa;
		}
		@Override
		public String toString() {
			return "Producto [ID=" + ID + ", nombre=" + nombre + ", peso=" + peso + ", descripcion=" + descripcion + ", precio="
					+ precio + "]";
		}
}
