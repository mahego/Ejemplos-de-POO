import java.io.*;
public class Calificaciones{
private String materia;
private float promedio;
private int noUnidades;
private float suma;
private float calificacion;
int i=1;
public Calificaciones(){
materia=" ";
promedio=0.0f;
noUnidades=0;
suma=0.0f;
}
public void setMateria(String materia){
this.materia=materia;
}
public void setNoUnidades(int noUnidades){
this.noUnidades=noUnidades;
}
public String getMateria(){
return materia;
}
public float getPromedio(){
return promedio;
}
public float getTotalRenta(){
return promedio;
}
public int getNoUnidades(){
return noUnidades;
}
public void calculoPromedio()throws IOException{
while (i<=noUnidades){
suma=suma+leerCalificacion();
++i;
}
promedio=suma/noUnidades;
}
public float leerCalificacion()throws IOException{
InputStreamReader ent=new InputStreamReader(System.in);
BufferedReader al=new BufferedReader(ent);

System.out.println("Escriba la calificacion de la unidad "+i);
calificacion=Integer.parseInt(al.readLine( ));
return calificacion;
}
}