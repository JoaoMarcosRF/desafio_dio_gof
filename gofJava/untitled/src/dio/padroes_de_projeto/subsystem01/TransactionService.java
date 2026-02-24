package dio.padroes_de_projeto.subsystem01;

import java.util.ArrayList;

public class TransactionService {
    private static final TransactionService INSTANCE = new TransactionService();

    private TransactionService(){}

    public static TransactionService getInstance() {
        return INSTANCE;
    }

    public void makeTransaction(int code, Item item, String market, String status){
        System.out.println("Transaction complete successfully!");
    }
}
