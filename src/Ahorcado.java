import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase Scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estamos viendo un blucle o una estructura de control
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.println(letrasAdivinadas[i]);

        }

        // Estamos viendo un blucle o una estructura de control

        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                    // Esto se usa cuando tenemos una palabra char
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " Letras)");

            System.out.println("Por favor Introduce una letra");

            // Usamos la clase Scanner para edir una letra
            //char letra = scanner.next().charAt(0);


            // Usamos la clase Scanner para edir una letra es para que lea en mayuscula o minuscula
            char letra = Character.toLowerCase(scanner.next().charAt(0));


            boolean letraCorreta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {

                // Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorreta = true;
                }

            }

            if (!letraCorreta) {
                intentos++;
                System.out.println("¡ Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intetos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("¡ Felicidades, Has adivinado la palabra secreta: " + palabraSecreta);
            }

        }

        if(! palabraAdivinada){
            System.out.println("Que pena te has quedado sin intentos!: GAME OVER");
        }

        scanner.close();

    }
}