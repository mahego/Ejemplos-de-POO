public class Instalacion{
private String clave;
private int tipo;
private float precioHoraRenta;
private float totalRenta;
private float cantidadHoras;
public Instalacion(){
clave=" ";
tipo=0;
totalRenta=0.0f;
cantidadHoras=0.0f;
}
public void setClave(String clave){
this.clave=clave;
}
public void setTipo(int tipo){
this.tipo=tipo;
}
public void setCantidadHoras(float cantidadHoras){
this.cantidadHoras=cantidadHoras;
}
public float getCantidadHoras(){
return cantidadHoras;
}
public float getTotalRenta(){
return totalRenta;
}
public float getPrecioHoraRenta(){
return precioHoraRenta;
}
public int getTipo(){
return tipo;
}
public String getClave(){
return clave;
}
public void calculoRenta(){
validaTipo();
totalRenta=cantidadHoras*precioHoraRenta;
}
private void validaTipo(){
if (tipo==1)
precioHoraRenta=20.0f;
else if (tipo==2)
precioHoraRenta=30.0f;
else if (tipo==3)
precioHoraRenta=50.0f;
else
precioHoraRenta=0.0f;
}
}