public class Provedor {
  private int id;
  private String nombre;
  private Producto[] productoProvedor;
  //variable que quiero solo usar en la clase
  private int numProductoProvedor = 0; 

  //constructores
  public Provedor(){}
  public Provedor(int id, String nombre, Producto[] productoProvedor){
    this.id = id;
    this.nombre = nombre;
    this.productoProvedor = productoProvedor;
  }

  //get y set
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Producto[] getProductoProvedor() {
    return productoProvedor;
  }

  public void setProductoProvedor(Producto[] productoProvedor) {
    this.productoProvedor = productoProvedor;
  }

  //metodos
  public int deuda(){
    return 0; 
  }


}
