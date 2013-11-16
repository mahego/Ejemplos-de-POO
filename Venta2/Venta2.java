public class Venta{
private String nombreProducto;
private float precio;
private float mensualidad;
private float total;
private float interes;
private int cantidad;
private int noMeses;

public Venta(){
precio=0.0f;
mensualidad=0.0f;
total=0.0f;
interes=0.0f;
cantidad=0;
noMeses=0;
String nombreProducto=" ";
}
public void setNombreProducto(String nombreProducto){
this.nombreProducto=nombreProducto;}
public void setPrecio(float precio){
this.precio=precio;}
public void setCantidad(int cantidad){
this.cantidad=cantidad;
}
public void vender(){
total=cantidad*precio;
}
public void vender(int noMeses){
this.noMeses=noMeses;
mensualidad=precio/noMeses;
validainteres();
total=(cantidad*precio)+interes;
}
private void validainteres(){
if (noMeses<10)
interes=total*0.15f;
else if (noMeses>=10)
interes=total*0.25f;
}
public String getNombreProducto(){
return nombreProducto;}
public int getCantidad(){
return cantidad;}
public float getPrecio(){
return precio;}
public float getInteres(){
return interes;}
public float getTotal(){
return total;}
public float getMensualidad(){
return mensualidad;}
}