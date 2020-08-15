package Ejercicio4;
import java.util.Scanner;

public class PrincipalMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        int n;
        char resp = ' ';
        int metUsado;


        
        Matriz matriz1 = new Matriz();
        matriz1.llenarMatriz();

        do{
            System.out.println("Escoja un método a usar");
            System.out.println("1- Método para cambiar todos los valores de la diagonal con un número entero");
            System.out.println("2- Método para sumar los valores de una fila especifica");
            System.out.println("3- Método para sumar los valores de una columna especifica");
            System.out.println("4- Método para sumar la diagonal inversa");
            System.out.println("5- Imprimir matríz");
            System.out.println("6- Salir");
            metUsado = entrada.nextInt();//Input.readInt();

            switch (metUsado) {
                case 1:
                    System.out.println("Digite el numero que desea colocar en la diagonal principal de la matriz.");
                    n = entrada.nextInt(); //Input.readInt();
                    matriz1.cambiarDiagon(n);
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = entrada.next().charAt(0);//Input.readChar();
                    break;
                case 2:
                    System.out.println("Digite el número de la fila que desea sumar: ");
                    n = entrada.nextInt(); //Input.readInt();
                    System.out.println("La suma total de los valores de esa fila es: "+matriz1.sumaFila(n));
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = entrada.next().charAt(0);//Input.readChar();
                    break;
                case 3:
                    System.out.println("Digite el número de la columna que desea sumar: ");
                    n = entrada.nextInt(); //Input.readInt();
                    System.out.println("La suma total de los valores de esa columna es: "+matriz1.sumaColum(n));
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = entrada.next().charAt(0);//Input.readChar();
                    break;
                case 4:
                    System.out.println("El total de la suma de la diagonal inversa es: "+matriz1.sumaInversa());
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = entrada.next().charAt(0);//Input.readChar();
                    break;
                case 5:
                    System.out.println(matriz1.imprimirMatriz());
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = entrada.next().charAt(0);//Input.readChar();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("El número ingresado no coincide con ninguna de las opciones.");
                    resp = 's';
                    break;
            }
        }while(resp == 'S' || resp == 's');
    }
}
/*
public class Matriz {
    int m[][];
    private final int CANTFIL = 6;
    private final int CANTCOL = 6;

    //Método constructor
    public Matriz(){
        m = new int[CANTFIL][CANTCOL];
    }
    //Llenar la matriz
    public void llenarMatriz(){
        for (int i = 0; i < CANTFIL; i++) {
            for (int j = 0; j < CANTCOL; j++) {
                if (i == j) {
                    m[i][j] = (int)(Math.random()*10);
                }else{
                    if(j<i){
                        m[i][j] = 1;
                    }else{
                        m[i][j] = (int)(Math.pow((i+j), 2));
                    }
                }
            }
        }
    }
    //Cambiar todos los valores de la diagonal con un número entero
    public void cambiarDiagon(int n){
        for (int i = 0; i < CANTFIL; i++) {
            for (int j = 0; j < CANTCOL; j++) {
                if (i == j) {
                    m[i][j] = n;
                }
            }
        }
    }
    //Sumar valores de una fila especifica
    public int sumaFila(int n){
        int tot = 0;
        for (int i = 0; i < CANTFIL; i++) {
            for (int j = 0; j < CANTCOL; j++) {
                if (i == n){
                    tot = tot + m[i][j];
                }
            }
        }
        return tot;
    }//Sumar valores de una columna especifica
    public int sumaColum(int n){
        int tot = 0;
        for (int i = 0; i < CANTFIL; i++) {
            for (int j = 0; j < CANTCOL; j++) {
                if (j == n){
                    tot = tot + m[i][j];
                }
            }
        }
        return tot;
    }
    //Sumar la diagonal inversa
    public int sumaInversa(){
        int tot=0;
        int i = 0;
        int j = CANTCOL-1;
        while(i <= CANTCOL-1 && j >= 0){
            tot=tot+m[i][j];
            i++;
            j--;
        }
        return tot;
    }
    //Imprimir matriz
    public String imprimirMatriz(){
        String text ="";
        for (int i = 0; i < CANTFIL; i++) {
            for (int j = 0; j < CANTCOL; j++) {
                if(j==0){
                    text = text + m[i][j];
                }else{
                    text = text + " - "+m[i][j];
                }
            }
            text = text + "\n";
        }
        return text;
    }
}
public class PrincipalMatriz {
    public static void main(String[] args) {
        int n;
        char resp = ' ';
        int metUsado;


        
        Matriz matriz1 = new Matriz();
        matriz1.llenarMatriz();

        do{
            System.out.println("Escoja un método a usar");
            System.out.println("1- Método para cambiar todos los valores de la diagonal con un número entero");
            System.out.println("2- Método para sumar los valores de una fila especifica");
            System.out.println("3- Método para sumar los valores de una columna especifica");
            System.out.println("4- Método para sumar la diagonal inversa");
            System.out.println("5- Imprimir matríz");
            System.out.println("6- Salir");
            metUsado = Input.readInt();

            switch (metUsado) {
                case 1:
                    System.out.println("Digite el numero que desea colocar en la diagonal principal de la matriz.");
                    n = Input.readInt();
                    matriz1.cambiarDiagon(n);
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = Input.readChar();
                    break;
                case 2:
                    System.out.println("Digite el número de la fila que desea sumar: ");
                    n = Input.readInt();
                    System.out.println("La suma total de los valores de esa fila es: "+matriz1.sumaFila(n));
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = Input.readChar();
                    break;
                case 3:
                    System.out.println("Digite el número de la columna que desea sumar: ");
                    n = Input.readInt();
                    System.out.println("La suma total de los valores de esa columna es: "+matriz1.sumaColum(n));
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = Input.readChar();
                    break;
                case 4:
                    System.out.println("El total de la suma de la diagonal inversa es: "+matriz1.sumaInversa());
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = Input.readChar();
                    break;
                case 5:
                    System.out.println(matriz1.imprimirMatriz());
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = Input.readChar();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("El número ingresado no coincide con ninguna de las opciones.");
                    resp = 's';
                    break;
            }
        }while(resp == 'S' || resp == 's');
    }
}

*/