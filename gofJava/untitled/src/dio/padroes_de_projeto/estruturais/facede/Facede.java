package dio.padroes_de_projeto.estruturais.facede;

import dio.padroes_de_projeto.subsystem01.Item;
import dio.padroes_de_projeto.subsystem01.TransactionService;
import dio.padroes_de_projeto.suubsystem02.TransactionLocalizer;

public class Facede {
    public void transactionMigration(int code){
        Item item = TransactionLocalizer.getInstance().sayItem();
        String market = TransactionLocalizer.getInstance().sayMarket();
        String status = TransactionLocalizer.getInstance().sayStatus();

        TransactionService.getInstance().makeTransaction(code, item, market, status);
    }
}
