class Main{
  public static void main(String[] arg){
    System.out.println("Corriendo...");

    Tienda tienda1 = new Tienda();
    System.out.println(tienda1.agregarProducto());
    System.out.println(tienda1.agregarProducto());
    System.out.println(tienda1.agregarProducto());
    System.out.println(tienda1.agregarProducto());


    Provedor provedor = new Provedor();
  }
}
