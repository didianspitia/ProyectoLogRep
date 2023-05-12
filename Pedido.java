public class Pedido{
  private int id;
  private int idProducto;
  private int cantidad;
  private int numProductos;

  //constructores
  public Pedido(){}
  public Pedido(int id, int idProducto, int cantidad){
    this.id = id;
    this.idProducto = idProducto;
    this.cantidad = cantidad;
  }

  //get y set
   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //metodos
    public void agregarProducto(int idProducto, int cantidad){}

    public void facturar(Producto[] producto){}
}
