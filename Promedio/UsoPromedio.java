import java.io.*;
public class UsoPromedio{
public static void main(String args[ ])throws IOException{
int cantidad;
int op;
float precio; 
int centinela=0;
boolean bandera = true;

Promediar obj = new Promediar( );

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);

while(bandera){
System.out.println(" ");
System.out.println("1.-Calcular promedio");
System.out.println("2.-Imprimir Promedio");
System.out.println("Registre una opcion ");
op = Integer.parseInt(al.readLine( ));
if(op == 1){
System.out.println(" ");
System.out.println("Registre el nombre del alumno ");
obj.setNombreAlumno((al.readLine( )));
System.out.println("Escriba el numero de unidades a evaluar");
obj.setNoUnidades(Integer.parseInt(al.readLine( )));
obj.calcular();
centinela=op;}
else if(op == 2){
obj.calcular();
System.out.println(" ");
System.out.println("Nombre del alumno: "+obj.getNombreAlumno());
System.out.println("Promedio: "+obj.getPromedio());
}
else if(op == 3)
bandera=false;
else
System.out.println("Opcion no Valida");

}
}
}