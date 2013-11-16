public class Operaciones{
private float dato1;
private float dato2;
private float valor;
private String tipo;
private int oper;
public Operaciones(){
dato1=0.0f;
dato2=0.0f;
valor=0.0f;
tipo=" ";
}
public void setDato1(float dato1){
this.dato1=dato1;
}
public void setDato2(float dato2){
this.dato2=dato2;
}
public void validaOperacion(int oper){
if(oper==1)
suma();
else if(oper==2)
resta();
else if(oper==3)
producto();
else if(oper==4)
division();

}
public float getDato1(){
return dato1;
}
public float getDato2(){
return dato2;
}
public float getValor(){
return valor;
}
public String getTipo(){
return tipo;
}
private void suma(){
valor=dato1+dato2;
tipo="suma";}
private void resta(){
valor=dato1-dato2;
tipo="resta";}
private void producto(){
valor=dato1*dato2;
tipo="multiplicacion";}
private void division(){
valor=dato1/dato2;
tipo="division";}
}