import java.util.Scanner;

public class Esercizio {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci una parola (x per uscire): ");
            String parola = input.nextLine();

            if (parola.equalsIgnoreCase("x")) {
                System.out.println("Programma terminato.");
                break;
            }

            if (isPalindroma(parola)) {
                System.out.println("\"" + parola + "\" è palindroma!\n");
            } else {
                System.out.println("\"" + parola + "\" NON è palindroma.\n");
            }
        }

        input.close();
    }

    // Metodo per controllare se è palindroma usando la pila
    public static boolean isPalindroma(String parola) {

        Pila<Character> pila = new Pila<>();

        // Inserisco i caratteri nella pila
        for (int i = 0; i < parola.length(); i++) {
            pila.push(parola.charAt(i));
        }

        // Ricostruisco la parola al contrario
        String inversa = "";

        while (!pila.isEmpty()) {
            inversa += pila.pop();
        }

        // Confronto
        return parola.equals(inversa);
    }
}