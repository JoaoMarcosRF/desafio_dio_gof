package dio.padroes_de_projeto.comportamentais.strategy;

public class StrategyTest {
    public static void main(String[] args){
        StrategyInterface success = new ImplementationSuccess();
        StrategyInterface failed = new ImplementationFailed();

        Context context = new Context();

        context.setStrategy(success);
        context.alg();

        context.setStrategy(failed);
        context.alg();
    }


}
