import java.io.*;
public class Recibo{
public static void main(String[]args)throws IOException{
int op,op2;
boolean bandera = true;

Instalacion obj1=new Instalacion();
Cliente obj2= new Cliente();
InputStreamReader ent=new InputStreamReader(System.in);
BufferedReader al=new BufferedReader(ent);
while(bandera){
System.out.println(" ");
System.out.println("1.-Capturar Datos ");
System.out.println("2.-Calcular Renta");
System.out.println("3.-Imprimir Recibo");
System.out.println("4.-Salir ");
System.out.println("Ingrese una opcion ");
op = Integer.parseInt(al.readLine( ));
if(op == 1){
System.out.println(" ");
System.out.println("Ingrese el Nombre:");
obj2.setNombre(al.readLine( ));
System.out.println("Ingrese la Clave de Usuario:");
obj1.setClave(al.readLine( ));
System.out.println("Ingrese el RFC del Cliente:");
obj2.setRFC(al.readLine( ));
System.out.println("Ingrese la Direccion:");
obj2.setDireccion(al.readLine( ));
System.out.println("Ingrese tipo de renta del usuario:");
System.out.println(" ");
System.out.println("Tipos:");
System.out.println(" \t\t 1.-Domestico");
System.out.println(" \t\t 2.-Negocio");
System.out.println(" \t\t 3.-Empresarial");
System.out.println("Ingrese una opcion ");
op2=Integer.parseInt(al.readLine( ));
while(op2==1 || op2==3 || op2==3){
obj1.setTipo(op2);
} System.out.println("Ingrese nuevamente la opcion ");
}
else if(op == 2){
System.out.println(" ");
System.out.println("Digite la cantidad de horas que utilizo el servicio");
obj1.setCantidadHoras(Float.parseFloat(al.readLine( )));
obj1.calculoRenta();
}
else if(op == 3){
System.out.println(" ");
System.out.println("Nombre            \t\t"+obj2.getNombre());
System.out.println("Clave                \t\t"+obj1.getClave());
System.out.println("Direccion            \t\t"+obj2.getDireccion());
System.out.println("RFC                \t\t"+obj2.getRFC());
System.out.println("Cantidad Horas   \t\t"+obj1.getCantidadHoras());
System.out.println("Precio por Hora  \t\t"+obj1.getPrecioHoraRenta());
System.out.println("Total               \t\t"+obj1.getTotalRenta());
}
else if(op == 4)
bandera=false;
else
System.out.println("Opcion no Disponible");

}
}
}