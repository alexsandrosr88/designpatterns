package singleton;

public class Teste {
    public static void main(String[] args){

        //Teste relacionados ao Design Pattern Singleton:
        SingletonLazy lazy = SingletonLazy.getInstance();

        System.out.println("\n"+lazy);

        lazy = SingletonLazy.getInstance();

        System.out.println(lazy);

        ///////////////////////////////////////

        SingletonEager eager = SingletonEager.getInstance();

        System.out.println("\n"+eager);

        eager = SingletonEager.getInstance();

        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();

        System.out.println("\n"+lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstance();

        System.out.println(lazyHolder);
    }
}
