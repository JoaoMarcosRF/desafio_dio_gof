package dio.padroes_de_projeto.comportamentais.strategy;

public class ImplementationSuccess implements StrategyInterface{

    @Override
    public void alg() {
        System.out.println("Algorithm was working!");
    }
}
