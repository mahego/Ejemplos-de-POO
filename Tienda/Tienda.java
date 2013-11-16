import java.io.*;
public class Tienda{
public static void main(String args[ ])throws IOException{
int cantidad;
int op;
float precio; 
int noMeses=0;
int centinela=0;
boolean bandera = true;

Venta  obj = new Venta( );

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);

while(bandera){
System.out.println(" ");
System.out.println("1.-Venta de contado ");
System.out.println("2.-Venta a credito ");
System.out.println("3.-Imprimir recibo de venta");
System.out.println("4.-Salir ");
System.out.println("Registre una opcion ");
op = Integer.parseInt(al.readLine( ));
if(op == 1){
System.out.println(" ");
System.out.println("Registre el nombre del producto ");
obj.setNombreProducto(al.readLine( ));
System.out.println("Escriba el precio del producto ");
obj.setPrecio(Float.parseFloat(al.readLine( )));
System.out.println("Escriba la cantidad del producto ");
obj.setCantidad(Integer.parseInt(al.readLine( )));
obj.vender();
centinela=op;}
else if(op == 2){
System.out.println(" ");
System.out.println("Escriba el nombre del producto ");
obj.setNombreProducto(al.readLine( ));
System.out.println("Escriba el precio del producto ");
obj.setPrecio(Float.parseFloat(al.readLine( )));
System.out.println("Escriba la cantidad del producto ");
obj.setCantidad(Integer.parseInt(al.readLine( )));
System.out.println("Escriba el numero de meses");
noMeses= Integer.parseInt(al.readLine( ));
obj.vender(noMeses);
centinela=op;}
else if(op == 3){
System.out.println(" ");
System.out.println("Producto\t\t "+obj.getNombreProducto());
System.out.println("Precio     \t\t "+obj.getPrecio());
System.out.println("Cantidad \t\t"+obj.getCantidad());
if (centinela==1)
System.out.println("Total  \t\t $ "+obj.getTotal());
else if (centinela==2){
System.out.println("Numero de Meses    \t\t"+noMeses);
System.out.println("Mensualidad    \t\t $ "+obj.getMensualidad());
System.out.println("Total    \t\t $ "+obj.getTotal());
}
}
else if(op == 4)
bandera=false;
else
System.out.println("Opcion no Valida");

}
}
}