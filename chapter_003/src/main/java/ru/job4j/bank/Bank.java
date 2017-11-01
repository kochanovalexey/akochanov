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
        for (User foundUser : map.keySet()) {
            if (foundUser.equals(user)) {
                map.remove(foundUser);
            }
        }
    }
    public void addAccountToUser(User user, Account account) {
        for (User foundUser : map.keySet()) {
            if (foundUser.equals(user)) {
                List<Account> userAccounts = map.get(foundUser);
                userAccounts.add(account);
            }
        }
    }
    public void deleteAccountFromUser(User user, Account account) {
        for (User foundUser : map.keySet()) {
            if (foundUser.equals(user)) {
                List<Account> userAccounts = map.get(foundUser);
                userAccounts.remove(account);
            }
        }
    }
    public List<Account> getUserAccounts(User user) {
        for (User foundUser : map.keySet()) {
            if (foundUser.equals(user)) {
                return map.get(foundUser);
            }
        }
        return null;
    }
    public boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {
        List<Account> srcListAccount = null;
        for (User foundUser : map.keySet()) {
            if (foundUser.equals(srcUser)) {
                srcListAccount = map.get(foundUser);
            }
        }
        if (srcListAccount == null) {
            return false;
        }

        double balance = 0;
        Account foundAccount = null;
        for (Account expectedAccount : srcListAccount) {
            if (expectedAccount.equals(srcAccount)) {
                balance = expectedAccount.getValue();
                foundAccount = expectedAccount;
            }
        }
        if (balance < amount) {
            return false;
        }
        List<Account> dstListAccount = null;
        for (User foundUser : map.keySet()) {
            if (foundUser.equals(dstUser)) {
                dstListAccount = map.get(foundUser);
            }
        }
        if (dstListAccount == null) {
            return false;
        }
        for (Account expectedAccount : dstListAccount) {
            if (expectedAccount.equals(dstAccount)) {
                foundAccount.setValue(foundAccount.getValue() - amount);
                expectedAccount.setValue(expectedAccount.getValue() + amount);
                return true;
            }
        }
        return false;
    }
    public boolean existUser(User user) {
        for (User foundUser : map.keySet()) {
            if (foundUser.equals(user)) {
                return true;
            }
        }
        return false;
    }
}
