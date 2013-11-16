public class Cliente{
private String nombre;
private String direccion;
private String RFC;
public Cliente(){
nombre=" ";
direccion=" ";
RFC=" ";
}
public void setNombre(String nombre){
this.nombre=nombre;
}
public void setDireccion(String direccion){
this.direccion=direccion;
}
public void setRFC(String RFC){
this.RFC=RFC;
}
public String getNombre(){
return nombre;
}
public String getDireccion(){
return direccion;
}
public String getRFC(){
return RFC;
}
}