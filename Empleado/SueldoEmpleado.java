import java .io.*;
public class  SueldoEmpleado  {
int numeroDias;
float salario;
String nombre ;


public String leerNombre () throws IOException {
String Nombre ;
InputStreamReader ent =new InputStreamReader (System.in);
BufferedReader al = new BufferedReader (ent);
System.out.println("Nombre Empleado");
Nombre=(al.readLine());
return Nombre ;
}

public int leernumeroDias ()throws IOException {
int Dias ;
InputStreamReader ent =new InputStreamReader (System.in);
BufferedReader al=new BufferedReader (ent);
System.out.println("Dias Trabajados ");
Dias=Integer.parseInt(al.readLine());
return Dias ; 
}

public float leerSalario () throws IOException {
float Sueldo ;
InputStreamReader ent =new InputStreamReader (System.in);
BufferedReader al = new BufferedReader (ent);
System.out.println("Pago por Día ");
Sueldo=Float.parseFloat(al.readLine());
return Sueldo ;
 }

public void calcularSueldo()throws IOException{
float sueldo;
nombre= leerNombre ();
numeroDias= leernumeroDias();
salario=leerSalario();
sueldo=salario*numeroDias ;
imprimirDatos(numeroDias,salario,nombre,sueldo);
}


public void imprimirDatos (int noDias,float salario, String nombre , float sueldo ){
System.out.println ("Nombre de Empleado: " + nombre);
System.out.println("el numero de dias trabajados: "+numeroDias");
System.out.println("el sueldo del empleado es: "+sueldo");

}
}