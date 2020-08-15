package Ejercicio3;
import java.util.Scanner;

public class PrincipalMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        matriz matriz1 = new matriz();

        int f1, f2, c1, c2;
        char resp = ' ';
        int metUsado;
        
        matriz1.llenarArreglo();

        do{
            System.out.println("Escoja un método a usar");
            System.out.println("1- Método para retornar la suma de los valores pares.");
            System.out.println("2- Método para retornar la cantidad de valores impares");
            System.out.println("3- Método para imprimir la matriz");
            System.out.println("4- Método para imprimir los valores que hay entre una fila y otra al igual las columnas");
            System.out.println("5- Salir");
            metUsado = entrada.nextInt();//Input.readInt();

            switch (metUsado) {
                case 1:
                    System.out.println("La suma de los valores pares es: "+matriz1.sumaPares());
                    
                    break;
                case 2:
                    System.out.println("La cantidad de valores impares es un total de: "+ matriz1.totImpares());
                    
                    break;
                case 3:
                    System.out.println(matriz1.imprimirMatriz());
                    
                    break;
                case 4:
                    System.out.println("Ingrese los dos parametros para las filas.");
                    f1 = entrada.nextInt(); //input.readInt();
                    f2 = entrada.nextInt(); //input.readInt();
                    System.out.println("Ingrese los dos parametros para las columnas.");
                    c1 = entrada.nextInt(); //input.readInt();
                    c2 = entrada.nextInt(); //input.readInt();
                    matriz1.imprimirColFil(f1, f2, c1, c2);
                    
                    break;
                case 5:
                    break;
                default:
                System.out.println("El número ingresado no coincide con ninguna de las opciones.");
                break;
            }
        }while(metUsado != 5);
    }
}
/*
public class matriz {
    int m[][];
    private final int CANTFIL = 5;
    private final int CANTCOL = 4;

    public matriz(){
        m = new int[CANTFIL][CANTCOL];
    }
    //llenar arreglo
    public void llenarArreglo(){
        for (int i = 0; i < CANTFIL; i++) {
            for (int j = 0; j < CANTCOL; j++) {
                m[i][j] = i+j;
            }
        }
    }
    //Metodo para retornar la suma de los valores pares.
    public int sumaPares(){
        int tot = 0;
        for (int i = 0; i < CANTFIL; i++) {
            for (int j = 0; j < CANTCOL; j++) {
                if (m[i][j]%2 == 0){
                    tot = tot + m[i][j];
                }
            }
        }
        return tot;
    }
    //Metodo para retornar la cantidad de valores impares
    public int totImpares(){
        int tot=0;
        for (int i = 0; i < CANTFIL; i++) {
            for (int j = 0; j < CANTCOL; j++) {
                if (m[i][j]%2 != 0){
                    tot++;
                }
            }
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
                    text = text + "-"+m[i][j];
                }
            }
            text = text + "\n";
        }
        return text;
    }
    //Imprimir columnas y filas
    
    public void imprimirColFil(int f1, int f2, int c1, int c2){
        System.out.println("Valores de las filas:");
        for (int i = f1; i <= f2; i++) {
            for (int j = 0; j < CANTCOL; j++) {
                System.out.print(m[i][j] + " | ");
            }
        }
        System.out.println("\nValores de las columnas:");
        for (int i = 0; i < CANTFIL; i++) {
            for (int j = c1; j <= c2; j++) {
                System.out.print(m[i][j] + " | ");
            }
        }
        System.out.println();
    }
    
}

public class PrincipalMatriz {
    public static void main() {
        matriz matriz1 = new matriz();

        int f1, f2, c1, c2;
        char resp = ' ';
        int metUsado;
        
        matriz1.llenarArreglo();

        do{
            System.out.println("Escoja un método a usar");
            System.out.println("1- Método para retornar la suma de los valores pares.");
            System.out.println("2- Método para retornar la cantidad de valores impares");
            System.out.println("3- Método para imprimir la matriz");
            System.out.println("4- Método para imprimir los valores que hay entre una fila y otra al igual las columnas");
            System.out.println("5- Salir");
            metUsado = Input.readInt();

            switch (metUsado) {
                case 1:
                    System.out.println("La suma de los valores pares es: "+matriz1.sumaPares());
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = Input.readChar();
                    break;
                case 2:
                    System.out.println("La cantidad de valores impares es un total de: "+ matriz1.totImpares());
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = Input.readChar();
                    break;
                case 3:
                    System.out.println(matriz1.imprimirMatriz());
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = Input.readChar();
                    break;
                case 4:
                    System.out.println("Ingrese los dos parametros para las filas.");
                    f1 = Input.readInt();
                    f2 = Input.readInt();
                    System.out.println("Ingrese los dos parametros para las columnas.");
                    c1 = Input.readInt();
                    c2 = Input.readInt();
                    matriz1.imprimirColFil(f1, f2, c1, c2);
                    System.out.println("¿Desea probar otro método con el mismo arreglo?(s/n)");
                    resp = Input.readChar();
                    break;
                case 5:
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