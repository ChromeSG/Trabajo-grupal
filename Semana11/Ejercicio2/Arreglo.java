package Ejercicio2;


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
        for (int i = 0; i < a.length/2; i++) {
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