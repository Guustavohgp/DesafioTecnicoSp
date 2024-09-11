import java.util.Scanner;

public class Percentual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exemplo de vetor de faturamento diário
        double[] faturamentoDiario = {1500.0, 2100.5, 3100.3, 0.0, 4200.1, 2800.7, 0.0, 2500.6, 3200.8, 0.0, 
                                      3700.2, 0.0, 1800.4, 2200.9, 0.0, 3400.5, 1500.3, 3100.0, 2000.7, 0.0, 
                                      1200.8, 2900.2, 4500.1, 3900.6, 0.0, 3800.0, 0.0, 4200.3, 2100.9, 5000.2};
        
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;
        int diasComFaturamento = 0;
        
        // Calcula menor, maior faturamento e soma
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }
        
        // Calcula a média mensal
        double mediaMensal = somaFaturamento / diasComFaturamento;
        
        // Calcula o número de dias em que o faturamento foi superior à média mensal
        int diasAcimaDaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        
        // Exibe os resultados
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
        
        scanner.close();
    }
}