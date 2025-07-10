import java.net.SocketOption;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operadores lógicos
        boolean a = true;
        boolean b = false;
        System.out.println( 1>5);
        boolean respuesta1 = 1 > 5; // false
        System.out.println( 1<5);
        boolean respuesta2 = 1 < 5; // true
        System.out.println( "la respuestas para"+ " " + "1>5" + " " + "es " + respuesta1 + " "+ "y" + " " + "1<5" + " " + "es " + respuesta2);


        // AND lógico
        boolean andResult = a && b; // false
        System.out.println("AND lógico: " + andResult);
        System.out.println("AND lógico: " + (a && b)); // false
        System.out.println("AND lógico: " + (a && true)); // true
        System.out.println("AND lógico: " + (false && b)); // false
        System.out.println("AND lógico: " + (false && true)); // false
        // CASO PRÁCTICO SENCILLO
        // Verificar si un número es positivo y par
        int numero = 4;
        boolean esPositivo = numero > 0; // true
        boolean esPar = numero % 2 == 0; // true
        boolean esPositivoYPar = esPositivo && esPar; // true
        System.out.println("El número " + numero + " es positivo y par: " + esPositivoYPar);

        // OR lógico
        boolean orResult = a || b; // true
        System.out.println("OR lógico: " + orResult);
        System.out.println("OR lógico: " + (a || b)); // true
        System.out.println("OR lógico: " + (a || false)); // true
        System.out.println("OR lógico: " + (false || b)); // false
        System.out.println("OR lógico: " + (false || true)); // true
        // CASO PRÁCTICO SENCILLO
        // Verificar si un número es positivo o impar
        int otroNumero = -3;
        boolean esPositivo2 = otroNumero > 0; // false
        boolean esImpar = otroNumero % 2 != 0; // true
        boolean esPositivoOImpar = esPositivo2 || esImpar; // true
        System.out.println("El número " + otroNumero + " es positivo o impar: " + esPositivoOImpar);

        // NOT lógico
        boolean notResult = !a; // false
        System.out.println("NOT lógico: " + notResult);
        System.out.println("NOT lógico: " + (!a)); // false
        System.out.println("NOT lógico: " + (!b)); // true
        // CASO PRÁCTICO SENCILLO
        // Verificar si un número no es negativo
        int numeroNegativo = -5;
        boolean esNoNegativo = !(numeroNegativo < 0); // false
        System.out.println("El número " + numeroNegativo + " no es negativo: " + esNoNegativo);

        // XOR lógico (exclusivo)
        boolean xorResult = a ^ b; // true
        System.out.println("XOR lógico: " + xorResult);
        System.out.println("XOR lógico: " + (a ^ b)); // true
        System.out.println("XOR lógico: " + (a ^ true)); // false
        System.out.println("XOR lógico: " + (false ^ b)); // false
        System.out.println("XOR lógico: " + (false ^ true)); // true
        // CASO PRÁCTICO SENCILLO
        // Verificar si un número es positivo o negativo, pero no ambos
        int numeroXor = 0;
        boolean esPositivoXor = numeroXor > 0; // false
        boolean esNegativoXor = numeroXor < 0; // false
        boolean esPositivoONegativo = esPositivoXor ^ esNegativoXor; // false
        System.out.println("El número " + numeroXor + " es positivo o negativo, pero no ambos: " + esPositivoONegativo);
    }
}
