import java.util.ArrayList;

public class Pila<T> {
    
    private ArrayList<T> elementi;

    // Costruttore
    public Pila() {
        elementi = new ArrayList<>();
    }

    // Verifica se è vuota
    public boolean isEmpty() {
        return elementi.isEmpty();
    }

    // Inserisce un elemento in cima
    public void push(T dato) {
        elementi.add(dato);
    }

    // Rimuove e restituisce l'elemento in cima
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vuota!");
        }
        return elementi.remove(elementi.size() - 1);
    }

    // Restituisce l'elemento in cima senza rimuoverlo
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vuota!");
        }
        return elementi.get(elementi.size() - 1);
    }

    // Numero di elementi
    public int size() {
        return elementi.size();
    }

    // Rappresentazione testuale
    @Override
    public String toString() {
        return elementi.toString();
    }
}
//LEGGERE LE ISTRUZIONI NEL FILE README.md