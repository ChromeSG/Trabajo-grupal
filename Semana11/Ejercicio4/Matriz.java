package Ejercicio4;

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