import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de string
        System.out.println("Digite uma string para inverter:");
        String input = scanner.nextLine();
        
        // Vetor de caracteres para armazenar a string invertida
        char[] caracteres = input.toCharArray();
        int tamanho = caracteres.length;
        
        // Inverte a string manualmente
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }
        
        // Converte o vetor de volta para uma string
        String invertida = new String(caracteres);
        
        // Exibe a string invertida
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }
}

