import java.io.*;
public class Empresa{
public static void main(String args[ ])throws IOException{
int cantidad;
int op;
float precio; 
boolean bandera = true;
int noDias;

Obrero obj = new Obrero( );

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);

while(bandera){
System.out.println(" ");
System.out.println("1.-Capturar Datos");
System.out.println("2.-Calcular Sueldo");
System.out.println("3.-Imprimir Datos");
System.out.println("Registre una opcion ");
op = Integer.parseInt(al.readLine( ));
if(op == 1){
System.out.println("Registre el nombre del Obrero ");
obj.setNombre((al.readLine( )));
System.out.println("Escriba el salario asignado por pieza");
obj.setSalario(Float.parseFloat(al.readLine( )));
}
else if(op == 2){
System.out.println("Escriba el numero de dias que trabajo");
noDias=(Integer.parseInt(al.readLine( )));
obj.calcularSueldo(noDias);
System.out.println("Operacion realizada con exito");
}
else if(op == 3){
System.out.println(" ");
System.out.println("Nombre del Obrero: "+obj.getNombre());
System.out.println("Su sueldo es: "+obj.getSueldo());
}
else if(op == 4)
bandera=false;
else
System.out.println("Opcion no Valida");

}
}
}