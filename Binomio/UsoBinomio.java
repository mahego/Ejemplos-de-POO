import java.io.*;
public class UsoBinomio{
public static void main(String args[])throws IOException{
BinomioCuadrado obj=new BinomioCuadrado();

InputStreamReader ent=new InputStreamReader(System.in);
BufferedReader al=new BufferedReader(ent);

System.out.println("Inserte un valor para el primer binomio");
obj.a=Integer.parseInt(al.readLine());/*Accesando al atributo a a travez del objeto creado en la clase uso binomio*/

System.out.println("Inserte un valor para el segundo binomio");
obj.b=Integer.parseInt(al.readLine());

/*invocar el metodo de operaciones*/
obj.Calcular();

System.out.println("El resultado es: "+obj.bin);

}
}