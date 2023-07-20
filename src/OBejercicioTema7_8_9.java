import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class OBejercicioTema7_8_9 {

    // funcion que devuelve una cadena al reves
    public static String reverse(String texto){
        char[] array = texto.toCharArray();
        char[] newArray = new char[array.length];
        for (int i = 0 ; i < array.length ; i++){
            int j = array.length - (i+1);
            newArray[i] = array[j];
        }return new String(newArray);
    }

    public static int DividePorCero(int num){
        return num/0;
    }

    public static void main(String[] args) {
        System.out.println("Devolviendo la cadena 'hola mundo' al reves:");
        System.out.println(reverse("hola mundo"));

        System.out.println("\nRecorriendo Arrays");
        //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento
        // en ambas dimensiones.
        String[] unidimensional = {"Hola", "mundo", "como", "estan", "?"};
        int[][] bidimensional = new int[3][2];
        bidimensional[0][0] = 1;
        bidimensional[0][1] = 2;
        bidimensional[1][0] = 3;
        bidimensional[1][1] = 4;
        bidimensional[2][0] = 5;
        bidimensional[2][1] = 6;

        //Recorriendo Arrays
        System.out.println("Mi Array Unidimensional es: ");
        for(String asd : unidimensional){
            System.out.println(asd);
        }

        System.out.println("\nMi Array bidimensional es: ");
        for(int i=0; i < bidimensional.length; i++){
            for(int j=0; j < bidimensional[i].length; j++){
                System.out.println("En la posicion "+ i + ","+ j + " El valor es: " + bidimensional[i][j]);
            }
        }

        //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento
        // y muestra el resultado final.
        System.out.println("\nMi Vector sin el 2do y 3er elemento es: ");
        Vector<Integer> numPares = new Vector<>();
        numPares.add(2);
        numPares.add(4);
        numPares.add(6);
        numPares.add(8);
        numPares.add(10);
        numPares.remove(2);
        numPares.remove(1);
        System.out.println(numPares.toString());

        //4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos
        // para ser añadidos al mismo.
        //El problema seria el uso de memoria ya que si creamos un vector con la capacidad por defecto que es 10
        //y tenemos que llenarlo con 1000 datos cada vez que alcance su maximo se estaria creando un array con el doble
        // de la capacidad actual hasta llegar a los 1000

        //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente
        // el valor de cada elemento.
        ArrayList<String> arrayList = new ArrayList<>(4);
        arrayList.add("Hola");
        arrayList.add("mundo");
        arrayList.add("como");
        arrayList.add("estan");

        System.out.println("\nEste es mi ArrayList: ");
        for (String asd: arrayList){
            System.out.println(asd);
        }

        System.out.println("\nEste es mi LinkedList: ");
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        for (String asd: linkedList){
            System.out.println(asd);
        }

        //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        // con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> enteros = new ArrayList<>();
        for (int i=0; i<10 ; i++){
            if (i % 2 == 0 ) {
                enteros.add(i + 1);
            }
        }

        System.out.println("\nMi ArrayList de pares es: " + enteros);

        //7.Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
        // que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
        // mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        try{
            System.out.println("\nDemo de código");
            System.out.println(DividePorCero(15));
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }

    }

    //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
    public static void CopiarFichero (File fileIn, File fileOut) throws IOException {
        InputStream input = new FileInputStream(fileIn);

        OutputStream output = new FileOutputStream(fileOut);

        int dato = input.read();
        while (dato != -1){
            output.write(dato);
            dato = input.read();
        }

        input.close();
        output.close();

    }
}
