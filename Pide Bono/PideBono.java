import java.io.*;
public class PideBono{
public static void main (String args[])throws IOException{
int s,nD;
BonoEmpleado obj= new BonoEmpleado();

InputStreamReader ent=new InputStreamReader(System.in);
BufferedReader al= new BufferedReader(ent);

System.out.println("escriba el salario del empleado");
s=Integer.parseInt(al.readLine());

System.out.println("escriba el numero de dias trabajados");
nD=Integer.parseInt(al.readLine());

obj.calcular(s,nD);
System.out.println("el salario del empleado es: "+s);
System.out.println("el numero de dias trabajados: "+nD");
System.out.println("el sueldo del empleado es: "+obj.sueldo");
System.out.println("el bono otorgado es: "+obj.bono);
}
}