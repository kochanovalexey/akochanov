package ru.job4j.bank;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class BankTest {
    @Test
    public void whenAddNewUser() {
        Bank bank = new Bank();
        bank.addUser(new User("Alex", "Qwerty12"));
        boolean result = bank.existUser(new User("Alex", "Qwerty12"));
        boolean expected = true;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDeleteUser() {
        Bank bank = new Bank();
        bank.addUser(new User("Alex", "Qwerty12"));
        bank.deleteUser(new User("Alex", "Qwerty12"));
        boolean result = bank.existUser(new User("Alex", "Qwerty12"));
        boolean expected = false;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAddAccountToUser() {
        Bank bank = new Bank();
        User user = new User("Alex", "Qwerty12");
        bank.addUser(user);
        Account account = new Account(45000, 731273871);
        bank.addAccountToUser(user, account);
        List<Account> accountList = bank.getUserAccounts(user);
        Account expected = account;
        for (Account result : accountList) {
            if (result.equals(new Account(0, 731273871))) {
                assertThat(result, is(expected));
            }
        }
    }
    @Test
    public void whenDeleteUserAccount() {
        Bank bank = new Bank();
        User user = new User("Alex", "Qwerty12");
        bank.addUser(user);
        Account account = new Account(45000, 731273871);
        bank.addAccountToUser(user, account);
        bank.deleteAccountFromUser(user, account);
        List<Account> accountList = bank.getUserAccounts(user);
        Account result = null;
        Account expected = null;
        for (Account found : accountList) {
            if (found.equals(new Account(0, 731273871))) {
                result = found;
            }
        }
        assertThat(result, is(expected));
    }
    @Test
    public void whenTransferMoney() {
        Bank bank = new Bank();
        User user1 = new User("Alex", "Qwerty12");
        bank.addUser(user1);
        Account account1 = new Account(45000, 731273871);
        bank.addAccountToUser(user1, account1);
        User user2 = new User("Toly", "123456");
        bank.addUser(user2);
        Account account2 = new Account(12000, 478787899);
        bank.addAccountToUser(user2, account2);
        bank.transferMoney(user1, account1, user2, account2, 14000);
        double[] expected = {31000.00, 26000.00};
        double[] result = new double[2];
        List<Account> listAccount = bank.getUserAccounts(user1);
        for (Account foundAccount : listAccount) {
            if (foundAccount.equals(account1)) {
                result[0] = foundAccount.getValue();
            }
        }
        listAccount = bank.getUserAccounts(user2);
        for (Account foundAccount : listAccount) {
            if (foundAccount.equals(account2)) {
                result[1] = foundAccount.getValue();
            }
        }
        assertThat(result, is(expected));
    }
}
