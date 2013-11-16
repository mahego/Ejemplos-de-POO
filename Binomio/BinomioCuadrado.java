import java.io.*;
public class BinomioCuadrado{/*clase para calcular el valor de un binomio al cuadrado*/
int a,b,bin;

public BinomioCuadrado(){
a=0;
b=0;
bin=0;
}
public void Calcular(){
bin=a*a+2*a*b+b*b;
}
}