public class Obrero{
int noPiezas;
float precioPieza,sueldo;
public Obrero(int noPiezas){
this.noPiezas=noPiezas;

}
public void validaPiezas(){
if (noPiezas < 50)
  precioPieza=25.80f;
else
  precioPieza=31.70f;
}
public void calculaSueldo(){
validaPiezas();
sueldo=noPiezas*precioPieza;
mostrar();
}
public void mostrar(){
System.out.println("el sueldo del obrero es: "+sueldo);
System.out.println("Piezas Creadas: "+noPiezas);
System.out.println("Precio Por Piezas: "+precioPieza);
}
}