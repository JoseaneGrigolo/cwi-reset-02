public class PropostaFinanciamento {

    private Beneficiario beneficiario;
    private Imovel imovel;
    private int prazoMeses;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovel, int prazoMeses) {
        this.beneficiario = beneficiario;
        this.imovel = imovel;
        this.prazoMeses = prazoMeses;
    }

    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */

    public void validarProposta() {
        if(imovel.getEndereco().getEstado().equals(UnidadeFederativa.SP) && (beneficiario.getSalario() * prazoMeses < imovel.getValor()*0.65)) {
            imprimirPropostaNegada();
        } else if (imovel.getEndereco().getEstado().equals(UnidadeFederativa.RJ) && (beneficiario.getSalario() * prazoMeses < imovel.getValor()*0.60)) {
            imprimirPropostaNegada();
        } else if (beneficiario.getSalario() * prazoMeses < imovel.getValor()*0.5) {
            imprimirPropostaNegada();
        } else {
            imprimirPropostaAprovada();
        }

    }

    private void imprimirPropostaAprovada () {
        System.out.println("Beneficiário: " + beneficiario.getNome() );
        System.out.println("Imóvel: " + imovel.getEndereco().getEstado());
        System.out.println("Prazo: " + prazoMeses);
        System.out.println("Parabéns! Sua proposta foi aceita com sucesso!");
    }

    private void imprimirPropostaNegada () {
        System.out.println("Beneficiário: " + beneficiario.getNome());
        System.out.println("Imóvel: " + imovel.getEndereco().getEstado());
        System.out.println("Prazo: " + prazoMeses);
        System.out.println("Fica dificil sem a mascada :( Fala com os Illuminatis e volta aqui depois!");
    }

}