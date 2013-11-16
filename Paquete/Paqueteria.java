import java.io.*;
public class Paqueteria{
public static void main (String args[]) throws IOException{
int page;
boolean bandera=true;
InputStreamReader ent=new InputStreamReader(System.in);
BufferedReader al=new BufferedReader(ent);
Paquete obj=new Paquete();

while (bandera){
System.out.println("\n"+"Seleccione una opcion");
System.out.println("1.-Registrar");
System.out.println("2.-Cobro");
System.out.println("3.-Recibo");
System.out.println("4.-Salir");
System.out.println("Registre una Opcion");
page= Integer.parseInt(al.readLine());
if (page<1||page>4){
System.out.println("La opcion Que usted a ingresado "+page+" No es admitida");
break;
}

if(page==1){
obj.registrar();
System.out.println("\n"+"\n"+"Escriba el nombre del remitente");
obj.setNombreRemitente(al.readLine());
System.out.println("\n"+"\n"+"Escriba el nombre del destinatario");
obj.setNombreDestinatario(al.readLine());}

if(page==2){
System.out.println("\n"+"\n"+"Escriba el peso del paquete en gramos");
obj.setPesoPaquete(Float.parseFloat(al.readLine()));
obj.cobro();
}
else if(page==3){
obj.recibo();
System.out.println("\n"+"\n"+"Nombre del Remitente: "+obj.getNombreRemitente());
System.out.println("Nombre del Destinatario: "+obj.getNombreDestinatario());
System.out.println("El peso total es de: "+obj.getPesoPaquete()+" Gramos");
System.out.println("El precio a pagar es de:  $"+obj.getTotalEnvio()+" Pesos");
break;
}
if (page==4)
bandera=false;
}
}
}