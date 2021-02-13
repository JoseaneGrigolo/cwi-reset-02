package exemploAula02;

public enum Cargo {

    ENGENHEIRO_SOLUCOES("Engenheiro de Soluções", 0.1);

    private String descricao;
    private double bonus;

    Cargo(String descricao, double bonus){
        this.bonus = bonus;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getBonus() {
        return bonus;
    }
}
