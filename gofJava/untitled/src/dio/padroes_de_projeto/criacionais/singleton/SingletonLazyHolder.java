package dio.padroes_de_projeto.criacionais.singleton;

public class SingletonLazyHolder {
    private static class InstanceHolder{
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){}

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.INSTANCE;
    }
}
