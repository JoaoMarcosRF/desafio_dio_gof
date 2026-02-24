package dio.padroes_de_projeto.comportamentais.strategy;

public class ImplementationFailed implements StrategyInterface{
    @Override
    public void alg() {
        System.out.println("Algorithm wasn't work!");
    }
}
