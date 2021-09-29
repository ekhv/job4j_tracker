package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            users.get(user).add(0, account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountFirst = findByRequisite(srcPassport, srcRequisite);
        Account accountSecond = findByRequisite(destPassport, destRequisite);
        accountSecond.setBalance(amount + accountSecond.getBalance());
        User userFirst = findByPassport(srcPassport);
        User userSecond = findByPassport(destPassport);
        if (userFirst != null && userSecond != null
                && users.get(userFirst).contains(accountFirst)
                && users.get(userSecond).contains(accountSecond)) {
            rsl = accountFirst.getBalance() >= amount;
        }
        return rsl;
    }
}