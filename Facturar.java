public class Facturar{
  private int id;
  private String fecha;
  private int numProductos;
  private Producto[] producto;

  //constructores
  public Facturar(){}
  public Facturar(int id, String fecha, int numProductos, Producto[] producto){
    this.id = id;
    this.fecha = fecha;
    this.numProductos = numProductos;
    this.producto = producto;
  }

  //get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    //metodos
    public void confirmarVenta(Producto[] producto){}

    public String tiket(String fecha, Producto[] producto, int numProductos){
      return "muestra la factura";
    }
    
}
