import java.io.*;
public class Venta{
public static void main (String args[])throws IOException{
int cantidad;
float precio;
String nombre;
InputStreamReader ent=new InputStreamReader(System.in);
BufferedReader al= new BufferedReader(ent);

System.out.println("Escriba el nombre del producto");
nombre=(al.readLine());

System.out.println("Escriba la cantidad de producto");
cantidad=Integer.parseInt(al.readLine());

System.out.println("Escriba el precio del producto");
precio=Float.parseFloat(al.readLine());

Producto objP=new Producto(cantidad,precio);
objP.nombre=nombre;
objP.calcularVenta();
objP.imprimir();

}
}