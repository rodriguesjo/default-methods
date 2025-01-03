package services;

// Classe que implementa a interface InterestService, representando um serviço de cálculo de juros baseado na taxa dos EUA.
public class UsaInterestService implements InterestService {

    // Taxa de juros utilizada, armazenada como um valor decimal (exemplo: 0.03 para 3%).
    private Double interestRate;

    // Construtor que inicializa a taxa de juros com o valor fornecido.
    public UsaInterestService(Double interestRate) {		
        this.interestRate = interestRate;
    }

    // Método getter para obter a taxa de juros configurada.
    public Double getInterestService() {
        return interestRate;
    }

    // Método setter para atualizar a taxa de juros.
    public void setInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }
		
    // Implementação do método da interface InterestService para retornar a taxa de juros.
    @Override
    public double getInterestRate() {		
        return interestRate;
    }
}
