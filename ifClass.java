
/**
 *
 * @author DAVID JACOB LÓPEZ MORATAYA
 * 5090-17-12655
 *
 */
import java.util.Scanner;

public class ifClass {

    //CONSTRUCTOR DE NUESTRA CLASE
    public ifClass() {
    }

    int n1 = 0, n2 = 0, n3 = 0;

    //METODO setIgual
    public void setIgual(int x, int y) {
        this.n1 = x;
        this.n2 = y;

        if (n1 == n2) {//Esta línea devuelve una expresion booleana, True or False 
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números son diferentes");
        }

    }

    //METODO SET MAYOR
    public void setMayor(int x, int y) {
        this.n1 = x;
        this.n2 = y;
        if (n1 > n2) {
            System.out.println("El número " + x + "es mayor.");
        } else {
            System.out.println("El número " + y + "es mayor.");
        }

    }

    //METODO SET MENOR
    public void setMenor(int x, int y) {
        this.n1 = x;
        this.n2 = y;
        if (n1 < n2) {
            System.out.println("El número " + x + "es menor.");
        } else {
            System.out.println("El número " + y + "es menor.");
        }
    }

    //METODO SET MAXIMO
    public void setMaximo(int x, int y) {
        this.n1 = x;
        this.n2 = y;
        Scanner in = new Scanner(System.in);
        int num, max = 0, min = 0;

        for (int i = 1; i < 11; i++) {
            System.out.print(i + " Ingrese un numero: ");
            num = in.nextInt();
            if (min != 0 && max != 0) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } else {
                min = num;
                max = num;
            }
        }
        System.out.println("Numero Maximo: " + max);
        System.out.println("Numero Minimo: " + min);
    }

    //METODO SET MINIMO
    public void setMinimo(int x, int y) {
        this.n1 = x;
        this.n2 = y;
        Scanner in = new Scanner(System.in);
        int num, max = 0, min = 0;

        for (int i = 1; i < 11; i++) {
            System.out.print(i + " Ingrese un numero: ");
            num = in.nextInt();
            if (min != 0 && max != 0) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } else {
                min = num;
                max = num;
            }
        }
        System.out.println("Numero Minimo: " + min);
    }

    //RAIZ CUADRADA
    public void setsqrt(int x) {
        this.n1 = x;
        System.out.println("Ingrese el radicando: ");
        Scanner in = new Scanner(System.in);
        float cuadrado = (float) Math.sqrt(n1);

        System.out.println("La Raíz Cuadrada de: " + x + "es: " + cuadrado);

    }

    //FUNCIÓN CUADRÁTICA
    public void setfnCuadratica(int a, int b, int c) {
        this.n1 = a;
        this.n2 = b;
        this.n3 = c;

        System.out.println("\nFórmula Cuadrática");
        double x1, x2, potencia, raiz = 0;

        potencia = Math.pow(b, 2) - (4 * a * c);

        x1 = (-b - Math.sqrt(potencia) / 2 * a);
        x2 = (-b + Math.sqrt(potencia) / 2 * a);

        System.out.println("\nX1 = " + x1);
        System.out.println("\nX2 = " + x2);
//INTENTAR PEDIR DATOS EN EL MAIN, A TRAVES DE SCANNER

    }

//FUNCIÓN PARA LA RESTA
    public void setResta(int x, int y) {
        this.n1 = x;
        this.n2 = y;
        int resta = 0;
        // resta = n1 - n2;

        if (n1 < n2) {
            throw new ArithmeticException("Números incorrectos - El minuendo debe ser MAYOR que el sustraendo");
        } else {
            resta = n1 - n2;
            System.out.println(x + " - " + y + "= " + resta);
        }

    }

    //MULTIPLICACIÒN
    public void setMultiplicacion(int x, int y) {
        this.n1 = x;
        this.n2 = y;
        int multi = 0;
        multi = n1 * n2;
        System.out.println(x + " x " + y + "  es igual a: " + multi);
    }

    //METODO DE DIVISION
    public void setDivision(int x, int y) {
        this.n1 = x;
        this.n2 = y;
        float division = 0;
        // division = n1 / n2;

        if (n1 < n2) {
            throw new ArithmeticException("Números incorrectos - El dividendo debe ser MAYOR que el divisor");
        } else {
            division = n1 / n2;
            System.out.println(x + " / " + y + "= " + division);
        }

    }
    
    //METODO &&
    public void setAND(int x, int y) {
        this.n1 = x;
        this.n2 = y;

        if (x == 8 && y == 2) {

            System.out.println("TRUE");
        } else {
            System.out.println("FALSE. ADIOS MUNDO");
        }
    }

    //METODO ||
    public void setO(int x, int y) {
        this.n1 = x;
        this.n2 = y;
  if (x == 10 ||  y == 4) {

            System.out.println("TRUE");
        } else {
            System.out.println("FALSE.NO HAY CONINCIDENCIAS");
        }
    }
    
    
    public void setNOT(int x, int y) {
        this.n1 = x;
        this.n2 = y;
if ( x != y ){
    System.out.println("EL PRIMER NUMERO NO ES COMO EL SEGUNDO");
}
else{
    System.out.println("EL PRIMER NUMERO ES COMO EL SEGUNDO");}
    
    }

}
