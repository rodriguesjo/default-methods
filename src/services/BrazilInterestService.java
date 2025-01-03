package services;

/* Classe que implementa a interface InterestService, representando um serviço de cálculo de juros 
 * com base na taxa de juros do Brasil.
 **/
public class BrazilInterestService implements InterestService {

    // Taxa de juros aplicada, representada como um número decimal (ex: 0.02 para 2%).
    private Double interestRate;

    // Construtor que recebe a taxa de juros como parâmetro e a inicializa.
    public BrazilInterestService(Double interestRate) {		
        this.interestRate = interestRate;
    }

    // Getter para obter a taxa de juros.
    public Double getInterestService() {
        return interestRate;
    }

    // Setter para atualizar a taxa de juros.
    public void setInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }	

    // Implementação do método definido na interface InterestService para retornar a taxa de juros.
    @Override
    public double getInterestRate() {		
        return interestRate;
    }
}
