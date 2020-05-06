
public class Producto {
	public String nombre;
	public String descripcion;
	private int peso;
	public Integer precio;
	private int ID;
	
		public Producto(String nombre, int peso, int precio , String descripcion , int ID)
		{
			this.nombre = nombre;
			this.peso = peso;
			this.precio = precio;
			this.descripcion = descripcion;
			this.ID = ID;
		}
}
