package by.epam.aggregetion04.main;

import by.epam.aggregetion04.entity.Account;
import by.epam.aggregetion04.logic.AccountManagement;
import by.epam.aggregetion04.logic.Amount;
import by.epam.aggregetion04.logic.Sorting;
import by.epam.aggregetion04.view.SearchAccount;

/*
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Main{
    public static void main(String[] args){
        Account account = new Account();
        SearchAccount account1 = new SearchAccount();
        Amount amount = new Amount();
        Sorting sort = new Sorting();
        AccountManagement management = new AccountManagement();
        Account[] accounts = new Account[account.NUMBER_OF_ACCOUNTS];
        accounts[0] = new Account("12331", 1200);
        accounts[1] = new Account("34234", 3000);
        accounts[2] = new Account("14323", -1345);
        accounts[3] = new Account("22345", 589);
        accounts[4] = new Account("34532", 3896);

        account1.findAccount(accounts);
        amount.getAllAmount(accounts);
        amount.getNegativeAmount(accounts);
        amount.getPositiveAmount(accounts);
        System.out.println("_____________________________");
        sort.sortAccounts(accounts);
        System.out.println("_____________________________");
        management.blockAccount(accounts);
    }
}
/*
Enter the account number
123
Account number: 12331 | amount: 1200.0 $
Amount: 7340.0 $
Negative amount: -1345.0 $
Positive amount: 8685.0 $
_____________________________
Sorting bank accounts
Account number: 12331 | amount: 1200.0 $
Account number: 14323 | amount: -1345.0 $
Account number: 22345 | amount: 589.0 $
Account number: 34234 | amount: 3000.0 $
Account number: 34532 | amount: 3896.0 $
_____________________________
This account(s) is blocked.
Account number: 14323.
For unblocking account(s) you need add not less 10 $.

 */