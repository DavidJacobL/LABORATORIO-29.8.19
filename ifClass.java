
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

    int n1 = 0, n2 = 0;

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

    public void setMayor(int x, int y) {
        this.n1 = x;
        this.n2 = y;
        if (n1 > n2) {
            System.out.println("El número " + x + "es mayor.");
        } else {
            System.out.println("El número " + y + "es mayor.");
        }

    }

    public void setMenor(int x, int y) {
        this.n1 = x;
        this.n2 = y;
        if (n1 < n2) {
            System.out.println("El número " + x + "es menor.");
        } else {
            System.out.println("El número " + y + "es menor.");
        }
    }

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

    public void setsqrt(int x) {
        this.n1 = x;
        int cuadrado = 0;
            
        
        
            System.out.println("La Raíz Cuadrada de: " +  x + "es: " + cuadrado);

        }

    
    
    
    
    

    public void setfnCuadratica(int x, int y) {
        this.n1 = x;
        this.n2 = y;

    }

    public void setResta(int x, int y) {
        this.n1 = x;
        this.n2 = y;

    }

    public void setMultiplicacion(int x, int y) {
        this.n1 = x;
        this.n2 = y;

    }

    public void setDivision(int x, int y) {
        this.n1 = x;
        this.n2 = y;

    }

    public void setAND(int x, int y) {
        this.n1 = x;
        this.n2 = y;

    }

    public void setOR(int x, int y) {
        this.n1 = x;
        this.n2 = y;

    }

    public void setNOT(int x, int y) {
        this.n1 = x;
        this.n2 = y;

    }

}
