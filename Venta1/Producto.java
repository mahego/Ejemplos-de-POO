public class Producto{
private String nombre;
private float precio;
private int cantidad;
private float peso;
private float total;
public Producto(){
precio=0.0f;
peso=0.0f;
total=0.0f;
nombre=" ";
}
public void setNombre(String nombre){
this.nombre=nombre;
}
public void venta(int cantidad, float precio){
this.cantidad=cantidad;
this.precio=precio;
total=cantidad*precio;
}
public void venta(float precio, float peso){
this.precio=precio;
this.peso=peso;
total=precio*peso;
}
public String getNombre(){
return nombre;}
public int getCantidad(){
return cantidad;}
public float getPrecio(){
return precio;}
public float getPeso(){
return peso;}
public float getTotal(){
return total;}
}