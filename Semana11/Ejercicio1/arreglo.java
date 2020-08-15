package Ejercicio1;

public class arreglo {
    private int m[];

    public arreglo(int canElementos){
        m = new int[canElementos];
    }
    //Llenar arreglo
    public void llenarArreglo(){
        for (int i = 0; i < m.length; i++) {
            m[i] = (int)(Math.random()*100);
        }
    }
    //Función para encontrar elemento específico
    public boolean encElemento(int num){
        boolean elemento = false;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == num){
                elemento = true;
            }else{
                elemento = false;
            }
        }
        return elemento;
    }
    //Función para conocer la cantidad de elementos en arreglo
    public int conocerElem(int num){
        int tot = 0;
        for (int i = 0; i < m.length; i++) {
            if(m[i] == num){
                tot = tot + 1;
            }
        }
        return tot;
    }
    //Función para imprimir el contenido del arreglo
    public void imprimir(){
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]+" - ");
        }
        System.out.println();
    }
}