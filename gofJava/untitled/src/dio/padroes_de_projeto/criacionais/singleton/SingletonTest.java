package dio.padroes_de_projeto.criacionais.singleton;

public class SingletonTest {
    public static void main(String[] args){
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonEager eager = SingletonEager.getInstance();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();

        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy + "\n");

        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager + "\n");

        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder + "\n");

    }

}
