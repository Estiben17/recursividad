import java.util.Scanner;

public class TorresDeHanoi {

    // Función recursiva para mover los discos
    public static void Hanoi(int n, String origen, String auxiliar, String destino) {
        // Caso base: si solo queda un disco, moverlo directamente al destino
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }

        // Mover los primeros n-1 discos del origen al auxiliar utilizando el destino como auxiliar
        Hanoi(n - 1, origen, destino, auxiliar);

        // Mover el disco restante del origen al destino
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        // Mover los n-1 discos del auxiliar al destino utilizando el origen como auxiliar
        Hanoi(n - 1, auxiliar, origen, destino);
    }

    // Función principal para iniciar el problema
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de discos al usuario
        System.out.print("Introduce el número de discos: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("El número de discos debe ser un entero positivo.");
        } else {
            System.out.println("\nMovimientos para resolver la Torre de Hanoi con " + n + " discos:\n");
            Hanoi(n, "origen", "auxiliar", "destino");
        }

        scanner.close();
    }
}
