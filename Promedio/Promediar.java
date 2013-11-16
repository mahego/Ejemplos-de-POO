import java.io.*;
public class Promediar{
private int noUnidades;
private float suma;
private float calificacion;
private float promedio;
private String nombreAlumno;
int i=1;
public Promediar(){
noUnidades=0;
suma=0.0f;
calificacion=0.0f;
promedio=0.0f;
nombreAlumno=" ";
}
public void setNombreAlumno(String nombreAlumno){
this.nombreAlumno=nombreAlumno;
}
public void setNoUnidades(int noUnidades){
this.noUnidades=noUnidades;
}
public void setCalificacion(float calificacion){
this.calificacion=calificacion;
}
public float getPromedio(){
return promedio;
}

public String getNombreAlumno(){
return nombreAlumno;
}
public void calcular()throws IOException{
while(i<=noUnidades){
suma=suma+leerNota();
promedio=suma/noUnidades;
i++;   }
}
private float leerNota()throws IOException{
InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);
System.out.println("Escriba la calificacion de la unidad "+i);
calificacion=Float.parseFloat(al.readLine( ));
return calificacion;
}
}