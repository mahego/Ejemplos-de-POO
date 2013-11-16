import java.io.*;
public class Venta{
public static void main(String args[ ])throws IOException{
int cantidad;
int op;
float precio; 
float peso;
int centinela=0;
boolean bandera = true;
Producto  obj = new Producto( );
InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);
while(bandera){
System.out.println(" ");
System.out.println("1.-Venta por cantidad ");
System.out.println("2.-Venta por peso ");
System.out.println("3.-Imprimir ");
System.out.println("4.-Salir ");
System.out.println("Registre una opcion ");
op = Integer.parseInt(al.readLine( ));
if(op == 1){
System.out.println(" ");
System.out.println("Registre el nombre del producto ");
obj.setNombre(al.readLine( ));
System.out.println("Escriba el precio del producto ");
precio = Float.parseFloat(al.readLine( ));
System.out.println("Escriba la cantidad de articulos ");
cantidad = Integer.parseInt(al.readLine( ));	
obj.venta(cantidad,precio);
centinela=op;}
else if(op == 2){
System.out.println(" ");
System.out.println("Escriba el nombre del producto ");
obj.setNombre(al.readLine( ));
System.out.println("Escriba el precio del producto ");
precio = Float.parseFloat(al.readLine( ));
System.out.println("Escriba el peso del producto");
peso = Float.parseFloat(al.readLine( ));
obj.venta(peso,precio);
centinela=op;}
else if(op == 3){
System.out.println(" ");
System.out.println("Producto \t\t "+obj.getNombre());
System.out.println("Precio   \t\t "+obj.getPrecio());
if (centinela==1)
System.out.println("Cantidad    \t\t"+obj.getCantidad());
else if (centinela==2)
System.out.println("Peso     \t\t"+obj.getPeso());
System.out.println("Total    \t\t $ "+obj.getTotal());
}
else if(op == 4)
bandera=false;
else
System.out.println("Opcion no Valida");

}
}
}