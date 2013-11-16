import java.io.*;
public class Empresa{
public static void main(String args[])throws IOException{
int noPiezas;
InputStreamReader ent=new InputStreamReader(System.in);
BufferedReader al= new BufferedReader(ent);

System.out.println("Escriba numero de piezas creadas");
noPiezas=Integer.parseInt(al.readLine());

Obrero objC=new Obrero(noPiezas);
objC.calculaSueldo();

}
}