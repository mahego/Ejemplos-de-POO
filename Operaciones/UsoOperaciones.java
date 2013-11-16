import java.io.*;
public class UsoOperaciones{
public static void main (String args[]) throws IOException{
int opera;
boolean bandera=true;
InputStreamReader ent=new InputStreamReader(System.in);
BufferedReader al=new BufferedReader(ent);
Operaciones obj=new Operaciones();

while (bandera){
System.out.println("\n Menu de Operaciones");
System.out.println("1.-Suma");
System.out.println("2.-Resta");
System.out.println("3.-Multiplicacion");
System.out.println("4.-Division");
System.out.println("5.-Salir");
System.out.println("Registre una Opcion");
opera= Integer.parseInt(al.readLine());
if (opera<1||opera==5||opera>5){
System.out.println("Adios!");
break;
}
System.out.println("Escriba el primer dato");
obj.setDato1(Float.parseFloat(al.readLine()));

System.out.println("Escriba el segundo dato");
obj.setDato2(Float.parseFloat(al.readLine()));

if(opera==1||opera==2||opera==3||opera==4){
obj.validaOperacion(opera);
System.out.println("El resultado de la operacion: "+obj.getTipo());
System.out.println("con los datos: "+obj.getDato1()+" y "+obj.getDato2());
System.out.println("es: "+obj.getValor());
break;
}
else if (opera==5)
bandera=false;
else
System.out.println("la opcion "+opera+" es incorrecta");
}
}
}