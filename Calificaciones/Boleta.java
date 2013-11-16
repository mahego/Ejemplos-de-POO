import java.io.*;
public class Boleta{
public static void main(String[]args)throws IOException{
int op;
boolean bandera = true;

Calificaciones obj1=new Calificaciones();
Alumno obj2= new Alumno();

InputStreamReader ent=new InputStreamReader(System.in);
BufferedReader al=new BufferedReader(ent);
while(bandera){
System.out.println(" ");
System.out.println("1.-Registrar ");
System.out.println("2.-Calcular ");
System.out.println("3.-Imprimir ");
System.out.println("4.-Salir ");
System.out.println("Ingrese una opcion ");
op = Integer.parseInt(al.readLine( ));
if(op == 1){
System.out.println(" ");
System.out.println("Ingrese el Nombre del Alumno:");
obj2.setNombre(al.readLine( ));
System.out.println("Ingrese el Numero de Control del Alumno:");
obj2.setNoControl(al.readLine( ));
System.out.println("Carrera que esta cursando:");
obj2.setCarrera(al.readLine( ));
System.out.println("Ingrese la Materia que se va a evaluar:");
obj1.setMateria(al.readLine( ));
}
else if(op == 2){
System.out.println(" ");
System.out.println("Escriba el numero de unidades a evaluar ");
obj1.setNoUnidades(Integer.parseInt(al.readLine( )));
obj1.calculoPromedio();
}
else if(op == 3){
System.out.println(" ");
System.out.println("Nombre            \t\t"+obj2.getNombre());
System.out.println("Numero de control    \t\t"+obj2.getNoControl());
System.out.println("Carrera                \t\t"+obj2.getCarrera());
System.out.println("Materia                \t\t"+obj1.getMateria());
System.out.println("Numero de Unidades  \t\t"+obj1.getNoUnidades());
System.out.println("Promedio              \t\t"+obj1.getPromedio());
}
else if(op == 4)
bandera=false;
else
System.out.println("Opcion no Disponible");

}
}
}