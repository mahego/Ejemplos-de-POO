import java.io.*;
public class UsoSumando{
public static void main (String args[])throws IOException{
int d1,d2;
Sumando objS= new Sumando();

InputStreamReader ent=new InputStreamReader(System.in);
BufferedReader al= new BufferedReader(ent);

System.out.println("escriba un numero");
d1=Integer.parseInt(al.readLine());

System.out.println("escriba otro numero");
d2=Integer.parseInt(al.readLine());
objS.sumar(d1,d2);
System.out.println("el resultado de la suma es: "+objS.valor);
}
}