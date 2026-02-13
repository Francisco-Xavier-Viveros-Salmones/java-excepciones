import java.util.Scanner;

public class VerificadorPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Verificador de Números Pares ---");
        System.out.print("Ingrese un número entero: ");
        
        try {
            int num = sc.nextInt();
            verificarSiEsPar(num);
            System.out.println("¡Éxito! El número " + num + " es par.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida.");
        } finally {
            sc.close();
        }
    }
 
    public static void verificarSiEsPar(int numero) {
        if (numero % 2 != 0) {
            throw new IllegalArgumentException("El número " + numero + " es impar.");
        }
    }
}