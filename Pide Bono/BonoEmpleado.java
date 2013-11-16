public class BonoEmpleado{
float salario,noDias,bono,sueldo;
public BonoEmpleado(){
salario=0;
noDias=0;
sueldo=0;
bono=200;
}
public void calcular(float salario,float noDias){
sueldo=salario*noDias+bono;
}
}