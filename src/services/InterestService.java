package services;

import java.security.InvalidParameterException;

// Interface que define um serviço de cálculo de juros.
public interface InterestService {

    // Método abstrato para obter a taxa de juros. Deve ser implementado pelas classes concretas.
    double getInterestRate();

    /**
     * Método default para calcular o pagamento de um valor com juros compostos.
     * 
     * @param amount Valor principal sobre o qual os juros serão calculados.
     * @param months Número de meses para o cálculo dos juros.
     * @return Valor total após aplicar os juros compostos.
     * @throws InvalidParameterException Se o número de meses for menor que 1.
     */
    default double payment(double amount, int months) {
        // Verifica se o número de meses é válido.
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        // Calcula o valor total usando a fórmula de juros compostos.
        return amount * Math.pow((1 + getInterestRate() / 100), months); 
    }
}
