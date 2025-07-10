import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    import java.util.ArrayList;
import java.util.Scanner;

    public class TiposDeDatosEjemplo {
        public static void main(String[] args) {

            // ==== TIPOS PRIMITIVOS ====

            // int -> números enteros
            int edad = 25; // estructura: int nombreVariable = valor;

            // double -> números decimales grandes (64 bits)
            double peso = 70.5; // estructura: double nombreVariable = valor;

            // float -> números decimales pequeños (32 bits), se añade 'f'
            float nota = 14.7f; // estructura: float nombreVariable = valor_f;

            // long -> enteros muy grandes, se añade 'L'
            long grande = 1234567890123L; // estructura: long nombreVariable = valorL;

            // short -> enteros pequeños (16 bits)
            short s = 30000; // estructura: short nombreVariable = valor;

            // byte -> enteros muy pequeños (8 bits)
            byte b = 120; // estructura: byte nombreVariable = valor;

            // char -> un solo carácter, entre comillas simples
            char letra = 'A'; // estructura: char nombreVariable = 'caracter';

            // boolean -> valores lógicos (true o false)
            boolean activo = true; // estructura: boolean nombreVariable = true/false;


            // ==== TIPOS DE REFERENCIA (OBJETOS) ====

            // String -> cadenas de texto (clase)
            String nombre = "Ana"; // estructura: String nombreVariable = "texto";

            // Array -> arreglo de un tipo específico, se usan corchetes []
            int[] numeros = {1, 2, 3}; // estructura: tipo[] nombreVariable = {valores};

            // ArrayList -> lista dinámica (clase de java.util), necesita import
            ArrayList<String> lista = new ArrayList<>(); // estructura: ArrayList<Tipo> nombre = new ArrayList<>();
            lista.add("Hola");

            // Scanner -> para leer datos del usuario, necesita import
            Scanner sc = new Scanner(System.in); // estructura: Scanner nombre = new Scanner(System.in);

            // ==== MOSTRAR RESULTADOS ====
            System.out.println("Edad: " + edad);
            System.out.println("Peso: " + peso);
            System.out.println("Nota: " + nota);
            System.out.println("Grande: " + grande);
            System.out.println("Short: " + s);
            System.out.println("Byte: " + b);
            System.out.println("Letra: " + letra);
            System.out.println("Activo: " + activo);
            System.out.println("Nombre: " + nombre);
            System.out.println("Array: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
            System.out.println("ArrayList: " + lista.get(0));
        }
    }

}