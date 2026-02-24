package dio.padroes_de_projeto.suubsystem02;

import dio.padroes_de_projeto.subsystem01.Item;



public class TransactionLocalizer {
    private static final TransactionLocalizer INSTANCE = new TransactionLocalizer();

    private TransactionLocalizer(){}

    public static TransactionLocalizer getInstance(){
        return INSTANCE;
    }

    public Item sayItem(){
        return new Item("milk", "empty", 20);
    }

    public String sayMarket(){
        return "Market2";
    }

    public int sayCode(){
        return 1;
    }

    public String sayStatus(){
        return "ok";
    }

}
