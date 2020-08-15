package Ejercicio3;

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