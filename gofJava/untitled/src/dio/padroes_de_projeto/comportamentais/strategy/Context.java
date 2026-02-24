package dio.padroes_de_projeto.comportamentais.strategy;

public class Context {
    private StrategyInterface strategy;

    public void setStrategy(StrategyInterface strategy) {
        this.strategy = strategy;
    }

    public void alg(){
        strategy.alg();
    }
}
