public class Alumno{
private String nombre;
private String noControl;
private String carrera;
public Alumno(){
nombre=" ";
noControl=" ";
carrera=" ";
}
public void setNombre(String nombre){
this.nombre=nombre;
}
public void setNoControl(String noControl){
this.noControl=noControl;
}
public void setCarrera(String carrera){
this.carrera=carrera;
}
public String getNombre(){
return nombre;
}
public String getNoControl(){
return noControl;
}
public String getCarrera(){
return carrera;
}
}