package Ejercicio1;
import java.util.Scanner;

public class principalArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int canElementos;
        char resp = ' ';
        int metUsado;
        int num;


        System.out.println("Ingrese la cantidad de elementos que desea que tenga el arreglo: ");
        canElementos = entrada.nextInt();//Input.readInt
        arreglo arreglo1 = new arreglo(canElementos);
        arreglo1.llenarArreglo();

        do{
            System.out.println("Escoja un método a usar");
            System.out.println("1- Llenar el arreglo con una nueva cantidad de elementos.");
            System.out.println("2- Función para encontrar elemento específico");
            System.out.println("3- Función para conocer la cantidad de elementos en arreglo");
            System.out.println("4- Función para imprimir el contenido del arreglo");
            System.out.println("5- Salir");
            metUsado = entrada.nextInt();//Input.readInt

            switch (metUsado) {
                case 1:
                    System.out.println("Ingrese la nueva cantidad de valores para el arreglo: ");
                    canElementos = entrada.nextInt();//Input.readInt
                    arreglo1 = new arreglo(canElementos);
                    arreglo1.llenarArreglo();
                    arreglo1.imprimir();
                    break;
                case 2:
                    System.out.println("Ingrese el número que desea saber si se encuentra en el arreglo: ");
                    num = entrada.nextInt();//Input.readInt
                    System.out.println(arreglo1.encElemento(num));
                    arreglo1.imprimir();
                    break;
                case 3:
                    System.out.println("Ingrese el número que desea saber si se encuentra en el arreglo: ");
                    num = entrada.nextInt();//Input.readInt
                    System.out.println("La cantidad de veces que se encuentra este número en el arreglo equivale a: "+arreglo1.conocerElem(num));
                    arreglo1.imprimir();
                    break;
                case 4:
                    arreglo1.imprimir();
                    arreglo1.imprimir();
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
/*
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
public class principalArreglo {
    public static void main() {
        int canElementos;
        char resp = ' ';
        int metUsado;
        int num;


        System.out.println("Ingrese la cantidad de elementos que desea que tenga el arreglo: ");
        canElementos = Input.readInt();
        arreglo arreglo1 = new arreglo(canElementos);
        arreglo1.llenarArreglo();

        do{
            System.out.println("Escoja un método a usar");
            System.out.println("1- Llenar el arreglo con una nueva cantidad de elementos.");
            System.out.println("2- Función para encontrar elemento específico");
            System.out.println("3- Función para conocer la cantidad de elementos en arreglo");
            System.out.println("4- Función para imprimir el contenido del arreglo");
            System.out.println("5- Salir");
            metUsado = Input.readInt();

            switch (metUsado) {
                case 1:
                    System.out.println("Ingrese la nueva cantidad de valores para el arreglo: ");
                    canElementos = Input.readInt();
                    arreglo1 = new arreglo(canElementos);
                    arreglo1.llenarArreglo();
                    break;
                case 2:
                    System.out.println("Ingrese el número que desea saber si se encuentra en el arreglo: ");
                    num = Input.readInt();
                    System.out.println(arreglo1.encElemento(num));
                    break;
                case 3:
                    System.out.println("Ingrese el número que desea saber si se encuentra en el arreglo: ");
                    num = Input.readInt();
                    System.out.println("La cantidad de veces que se encuentra este número en el arreglo equivale a: "+arreglo1.conocerElem(num));
                    break;
                case 4:
                    arreglo1.imprimir();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("El número ingresado no coincide con ninguna de las opciones.");
                    break;
            }
        }while(resp == 'S' || resp == 's');
    }    
}
*/