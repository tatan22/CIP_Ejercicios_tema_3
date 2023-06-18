public class Main {
    public static void main(String[] args) {

        // Primera parte: función con tres parámetros
        int resultado = sumarNumeros(2, 3, 5);
        System.out.println("Primera Parte:");
        System.out.println("El resultado de la suma es: " + resultado);

        // Segunda parte: clase Coche
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Segunda Parte:");
        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puerta(s).");
    }

    // Función para sumar tres números
    public static int sumarNumeros(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

class Coche {
    private int numPuertas;

    public Coche() {
        numPuertas = 0;
    }

    public void incrementarPuertas() {
        numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}