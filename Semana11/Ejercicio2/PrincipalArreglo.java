package Ejercicio2;
import java.util.Scanner;

public class PrincipalArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int canElementos;
        int n1;
        int n2;
        int x;
        int y; 
        char resp = ' ';
        int metUsado;
        
        System.out.println("Ingrese la cantidad de elementos(numero par) que desea que tengan los arreglos: ");
        canElementos = entrada.nextInt();//Input.readInt(); 
        Arreglo arreglo1 = new Arreglo(canElementos);
        arreglo1.llenarA();
        arreglo1.llenarB();

        do{
            System.out.println("Escoja un método a usar");
            System.out.println("1- Llenar los arreglos de nuevo.");
            System.out.println("2- Método para sumar dos valores de arreglo a y b.");
            System.out.println("3- Método para crear un tercer arreglo.");
            System.out.println("4- Método para retornar la mayor diferencia");
            System.out.println("5- Imprimir arreglos a y b por posición");
            System.out.println("6- Imprimir arreglos a y b.");
            System.out.println("7- Salir");
            metUsado = entrada.nextInt();//Input.readInt();

            switch (metUsado) {
                case 1:
                    System.out.println("Ingrese la nueva cantidad de valores para los arreglos: ");
                    canElementos = entrada.nextInt();//Input.readInt();
                    arreglo1 = new Arreglo(canElementos);
                    arreglo1.llenarA();
                    arreglo1.llenarB();
                    break;
                case 2:
                    System.out.println("Ingrese la posición de los valores que desea sumar:");
                    x=entrada.nextInt(); //Input.readInt();
                    y=entrada.nextInt(); //Input.readInt();
                    System.out.println("La suma de los arreglos es un total de: "+arreglo1.sumaArreglos(x, y));
                    break;
                case 3:
                    arreglo1.crearC();
                    System.out.println("Arreglo C:");
                    arreglo1.imprimirC();
                    break;
                case 4:
                    System.out.println("La mayor diferencia entra las respuestas corresponde a: "+arreglo1.mayDiferencia());
                    break;
                case 5:
                    System.out.println("Ingrese las posiciones que desea imprimir desde un punto a otro.");
                    n1 = entrada.nextInt();//Input.readInt();
                    n2 = entrada.nextInt();//Input.readInt();
                    arreglo1.imprimirArreglos(n1, n2);
                    break;
                case 6:
                    System.out.println("Arreglo a:");
                    arreglo1.imprimirA();
                    System.out.println("Arreglo b:");
                    arreglo1.imprimirB();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("El número ingresado no coincide con ninguna de las opciones.");                    
                    break;
            }
        }while(metUsado != 7);
    }
}

/*
public class Arreglo {
    int a[];
    int b[];

    //Método constructor
    public Arreglo(int canElementos){
            a = new int[canElementos];
            b = new int[canElementos];
    }
    //Método para llenar arreglo a
    public void llenarA(){
        for (int i = 0; i < this.a.length/2; i++) {
            a[i] = (int)(Math.random()*51);
        }
        for (int i = a.length/2; i < a.length; i++) {
            if(i%2==0){
                a[i]=i;
            }else{
                a[i]=i*5;
            }
        }
    }
    //Llenar arreglo b
    public void llenarB(){
        for (int i = 0; i < b.length; i++) {
            int aux = a[i];
            if(a[i] % 2 == 0){
                b[i] = aux*-1;
            }else{
                b[i] = aux;
            }
        }
    }
    //Metodo para sumar dos valores de arreglo a y b
    public int sumaArreglos(int x, int y){
        int tot;
        x = a[x];
        y = b[y];
        tot = x+y;
        return tot;
    }
    //Metodo para crear un tercer arreglo
    public int[] crearC(){
        int canElementos = a.length+b.length;
        int c[];
        int j = 0;
        c = new int [canElementos];
        for (int i = 0; i < c.length/2; i++) {
            c[i]=a[i];
        }
        for (int i = a.length; i < c.length; i++) {
            c[i]=b[j];  
            j++;
        }
        return c;
    }
    //Metodo para retornar la mayor diferencia
    public int mayDiferencia(){
        int resul = 0;
        int resul2 = 0;
        int resulfinal = 0;
        int aux;
        for (int i = 0; i < a.length-2; i++) {
            aux = a[i+1];
            resul = a[i]-aux;
            resul2 = aux-a[i+2];
            if (resul>=resul2) {
                resulfinal = resul;
            }else{
                resulfinal = resul2;
            }
        }
        return resulfinal;
    }
    //Imprimir arreglos a y b por posición
    public void imprimirArreglos(int n1, int n2){
        if (n2 > n1){
            int temp;
            for (int i = n2; i >= n1; i--) {
                System.out.print(a[i]+" | ");
            }
            System.out.println();
            for (int i = n2; i >= n1; i--) {
                System.out.print(b[i]+" | ");
            }
            System.out.println();
        }else{
            System.out.println("El primer numero debe ser menor que el segundo número.");
        }
    }

    //Imprimir arreglo a
    public void imprimirA(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" | ");
        }
        System.out.println();
    }
    //imprimir arreglo b
    public void imprimirB(){
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" | ");
        }
        System.out.println();
    }
    public void imprimirC(){
        int c[] = crearC();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" | ");
        }
        System.out.println();
    }

}
public class PrincipalArreglo {
    public static void main() {
        int canElementos;
        int n1;
        int n2;
        int x;
        int y; 
        char resp = ' ';
        int metUsado;
        
        System.out.println("Ingrese la cantidad de elementos que desea que tengan los arreglos: ");
        canElementos = Input.readInt();
        Arreglo arreglo1 = new Arreglo(canElementos);
        arreglo1.llenarA();
        arreglo1.llenarB();

        do{
            System.out.println("Escoja un método a usar");
            System.out.println("1- Llenar los arreglos de nuevo.");
            System.out.println("2- Método para sumar dos valores de arreglo a y b.");
            System.out.println("3- Método para crear un tercer arreglo.");
            System.out.println("4- Método para retornar la mayor diferencia");
            System.out.println("5- Imprimir arreglos a y b por posición");
            System.out.println("6- Imprimir arreglos a y b.");
            System.out.println("7- Salir");
            metUsado = Input.readInt();

            switch (metUsado) {
                case 1:
                    System.out.println("Ingrese la nueva cantidad de valores para los arreglos: ");
                    canElementos = Input.readInt();
                    arreglo1 = new Arreglo(canElementos);
                    arreglo1.llenarA();
                    arreglo1.llenarB();
                    break;
                case 2:
                    System.out.println("Ingrese la posición de los valores que desea sumar:");
                    x=Input.readInt();
                    y=Input.readInt();
                    System.out.println("La suma de los arreglos es un total de: "+arreglo1.sumaArreglos(x, y));
                    break;
                case 3:
                    arreglo1.crearC();
                    System.out.println("Arreglo C:");
                    arreglo1.imprimirC();
                    break;
                case 4:
                    System.out.println("La mayor diferencia entra las respuestas corresponde a: "+arreglo1.mayDiferencia());
                    break;
                case 5:
                    System.out.println("Ingrese las posiciones que desea imprimir desde un punto a otro.");
                    n1 = Input.readInt();
                    n2 = Input.readInt();
                    arreglo1.imprimirArreglos(n1, n2);
                    break;
                case 6:
                    System.out.println("Arreglo a:");
                    arreglo1.imprimirA();
                    System.out.println("Arreglo b:");
                    arreglo1.imprimirB();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("El número ingresado no coincide con ninguna de las opciones.");
                    break;
            }
        }while(resp == 'S' || resp == 's');
    }
}
*/