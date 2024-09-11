import java.util.Scanner;

public class Percentual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // Valores de faturamento por estado
         double sp = 67836.43;
         double rj = 36678.66;
         double mg = 29229.88;
         double es = 27165.48;
         double outros = 19849.53;
         
         // Cálculo do faturamento total
         double faturamentoTotal = sp + rj + mg + es + outros;
         
         // Cálculo dos percentuais de representação
         double percentualSP = (sp / faturamentoTotal) * 100;
         double percentualRJ = (rj / faturamentoTotal) * 100;
         double percentualMG = (mg / faturamentoTotal) * 100;
         double percentualES = (es / faturamentoTotal) * 100;
         double percentualOutros = (outros / faturamentoTotal) * 100;
         
         // Exibe os resultados
         System.out.printf("Percentual de representação por estado:\n");
         System.out.printf("SP: %.2f%%\n", percentualSP);
         System.out.printf("RJ: %.2f%%\n", percentualRJ);
         System.out.printf("MG: %.2f%%\n", percentualMG);
         System.out.printf("ES: %.2f%%\n", percentualES);
         System.out.printf("Outros: %.2f%%\n", percentualOutros);
     }
 }
        
