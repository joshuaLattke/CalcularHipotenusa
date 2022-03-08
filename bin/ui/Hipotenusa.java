 package ui; 
 import  java.util.Scanner;
public class Hipotenusa {
	public static void main (String[] args){
	Scanner sc =new Scanner(System.in);
    int  CatetoA;
    int  CatetoB;
    double resultado;

	System.out.println("ingrese el cateto A");
	CatetoA = sc.nextInt();
    System.out.println("el numero ingresado es "+CatetoA);

	System.out.println("ingrese el cateto B");
    CatetoB= sc.nextInt();
    System.out.println("el numero ingresado es "+CatetoB);
    
    resultado= Math.sqrt(((CatetoA)*2)+((CatetoB)*2));
    System.out.println("la hipotenusa es " + resultado); 
    
	}
}