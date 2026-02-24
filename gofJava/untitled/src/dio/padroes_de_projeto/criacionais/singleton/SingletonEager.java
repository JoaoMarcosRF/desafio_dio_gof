package dio.padroes_de_projeto.criacionais.singleton;

public class SingletonEager {
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return INSTANCE;
    }


}
