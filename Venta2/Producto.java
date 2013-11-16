public class Producto{
int cantidad;
float total,precio;
String nombre; 
public Producto(int cantidad, float precio){
this.precio=precio;
this.cantidad=cantidad;
}
public void calcularVenta(){
total=cantidad*precio;
}

public void imprimir(){
System.out.println("Producto: "+nombre);
System.out.println("El total de la venta es: "+total);
}
}