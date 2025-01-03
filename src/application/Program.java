package application;

import java.util.Locale;
import java.util.Scanner;

import services.InterestService;
import services.UsaInterestService;

public class Program {

    public static void main(String[] args) {
        
        // Define o padrão de localização como US (para exibição de números com ponto decimal).
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Solicita ao usuário o valor principal (amount) para o cálculo.
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        
        // Solicita ao usuário o número de meses para o cálculo dos juros compostos.
        System.out.print("Months: ");
        int months = sc.nextInt();
        
        // Cria uma instância do serviço de juros dos EUA com taxa de 1.0% ao mês.
        InterestService is = new UsaInterestService(1.0);
        
        // Calcula o pagamento total após os juros compostos para o período especificado.
        double payment = is.payment(amount, months);
        
        // Exibe o valor do pagamento após o número de meses informado.
        System.out.print("Payment after " + months + " months: ");
        System.out.println(String.format("%.2f", payment));
        
        // Fecha o scanner para liberar os recursos.
        sc.close();
    }    
}
