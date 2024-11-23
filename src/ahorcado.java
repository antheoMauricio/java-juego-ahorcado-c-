import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // clase scanner que permite al usuarioa escribir
        Scanner scanner = new Scanner(System.in);
        // declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        // uso de arreglos
        // char
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // bucle estructura de control usando for
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';

        }
        // estructura de control interactiva while
        while (!palabraAdivinada && intentos < intentosMax) {
            System.out.println("palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println("introduce una letra porfavor ");
            // usamos clase scanner para pedir una letra y un .charat para tomar el primer
            // dato
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("incorrecto,te quedan " + (intentosMax - intentos) + " intentos");

            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("felicidades, has adivinado la palabra secreta : " + palabraSecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("te has quedado sin intentos, game over c:");
        }
        scanner.close();
    }
}
