import java.io.*;
public class Obrero{
private String nombre;
private int noPiezas;
private float sumaPiezas;
private float salario;
private float sueldo;
int i;

public Obrero (){
nombre="  ";
noPiezas=0;
salario=0.0f;
sumaPiezas=0;
sueldo=0.0f;
}
public void setNombre(String nombre){
this.nombre=nombre;
}
public void setSalario(float salario){
this.salario=salario;
}
public String getNombre(){
return nombre;
}
public float getSueldo(){
return sueldo;
}
public void calcularSueldo(int noDias)throws IOException{
i=1;
while(i<=noDias){
sumaPiezas();
i++;   }
sueldo=sumaPiezas*salario;
}
private float sumaPiezas()throws IOException{
InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);
System.out.println("Escriba el numero de piezas que hizo el dia "+i);
noPiezas=Integer.parseInt(al.readLine( ));
sumaPiezas=sumaPiezas+noPiezas;
return sumaPiezas;
}
}