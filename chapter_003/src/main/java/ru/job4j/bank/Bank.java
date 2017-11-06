package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Bank {
    private List<User> userList = new ArrayList();
    private Map<User, List<Account>> map = new HashMap();
    public void addUser(User user) {
        map.put(user, new ArrayList<Account>());
    }
    public void deleteUser(User user) {
        map.remove(user);
    }
    public void addAccountToUser(User user, Account account) {
        List<Account> userAccounts  = map.get(user);
        userAccounts.add(account);
    }
    public void deleteAccountFromUser(User user, Account account) {
        List<Account> userAccounts = map.get(user);
        userAccounts.remove(account);
    }
    public List<Account> getUserAccounts(User user) {
        return map.get(user);
    }
    public boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {
        Account srcFoundAccount = getUserAccount(srcUser, srcAccount);
        if (srcFoundAccount == null && srcFoundAccount.getValue() < amount) {
            return false;
        }

        Account dstFoundAccount = getUserAccount(dstUser, dstAccount);
        if (dstAccount == null) {
            return false;
        }
        srcFoundAccount.setValue(srcFoundAccount.getValue() - amount);
        dstFoundAccount.setValue(dstFoundAccount.getValue() + amount);
        return true;
    }

    public boolean existUser(User user) {
        for (User foundUser : map.keySet()) {
            if (foundUser.equals(user)) {
                return true;
            }
        }
        return false;
    }

    public Account getUserAccount(User user, Account account) {
        List<Account> listAccount = map.get(user);
        for (Account expectedAccount : listAccount) {
            if (expectedAccount.equals(account)) {
                return expectedAccount;
            }
        }
        return null;
    }
}
