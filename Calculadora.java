import java.util.*;


public class Calculadora {
    public static void main(String[] args){
        int opcion = 0;
        do{
            System.out.println("---MENU---");
            System.out.println("Ingresa la opcion que quieres:");
            System.out.println("1.Suma\n 2.Resta\n 3.Multiplicacion\n 4.Dividir\n 5.Salir");
            Scanner inicio =new Scanner(System.in);
            opcion= inicio.nextInt();
            //Creacion de calculadora
            //Calculadora calcu =new Calculadora();

            switch (opcion){
                case 1:
                    int a=0;
                    int b=0;
                    Scanner suma = new Scanner(System.in);
                    System.out.println("Ingrese un numero para sumar:");
                    a= suma.nextInt();
                    System.out.println("Ingrese otro numero para sumar:");
                    b= suma.nextInt();
                    int sumaRes = sumar(a,b);
                    System.out.println("Tu respuesta es:"+ sumaRes);
                break;
                case 2:
                    int a2=0;
                    int b2=0;
                    Scanner resta = new Scanner(System.in);
                    System.out.println("Ingrese un numero para restar:");
                    a2= resta.nextInt();
                    System.out.println("Ingrese otro numero para restar:");
                    b2= resta.nextInt();
                    int restaRes = restar(a2,b2);
                    System.out.println("Tu respuesta es:"+ restaRes);
                break;
                case 3:
                    int a3=0;
                    int b3=0;
                    Scanner multiplicacion = new Scanner(System.in);
                    System.out.println("Ingrese un numero para multiplicar:");
                    a3= multiplicacion.nextInt();
                    System.out.println("Ingrese otro numero para multiplicar:");
                    b3= multiplicacion.nextInt();
                    int multiRes = multiplicar(a3,b3);
                    System.out.println("Tu respuesta es:"+ multiRes);
                break;
                case 4:
                    double a4=0.0;
                    double b4=0.0;
                    Scanner division = new Scanner(System.in);
                    System.out.println("Ingrese un numero para dividir:");
                    a4= division.nextDouble();
                    System.out.println("Ingrese otro numero para dividir:");
                    b4= division.nextDouble();
                    double divisionRes = dividir(a4,b4);
                    System.out.println("Tu respuesta es:"+ divisionRes);
                    break;
                default:
                break;
            }
        }while(opcion !=5);
    }

    public static int sumar( int a, int b){
    return a+b;
    }
    
    public static int restar(int a, int b){
    return a-b;
    }
    public static double dividir(double a, double b){
    return a/b;
    }
    public static int multiplicar( int a, int b){
    return a*b;
    }
}

 
