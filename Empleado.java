public class Empleado {
  private int id;
  private String nombre;
  private String cargo;

  //constructores
  public Empleado(){}
  public Empleado(int id, String nombre, String cargo){
    this.id = id;
    this.nombre = nombre;
    this.cargo = cargo;
  }

  //set y get
  public int getId(){
    return id;
  }

  public void setId(int id){
    this.id = id;
  }
  
  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getCargo(){
    return cargo;
  }

  public void setCargo(String cargo){
    this.cargo = cargo;
  }
  
}
