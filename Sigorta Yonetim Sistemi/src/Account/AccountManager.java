package Account;

import Common.InvalidAuthenticationException;

import java.util.TreeSet;

public class AccountManager {

    private TreeSet<Account> accounts;

    public AccountManager() {
        this.accounts = new TreeSet<>();
    }

    public Account login(String email, String password) throws InvalidAuthenticationException {

        Account account = accounts.stream()
                .filter(acc -> isValidAuth(acc, email, password))
                .findAny()
                .orElseThrow(InvalidAuthenticationException::new);

        account.login(email, password);
        return account;
    }

    private boolean isValidAuth(Account acc, String email, String password){
        User user = acc.getUser();
        return user.getEmail().equals(email) && user.getPassword().equals(password);
    }

    public TreeSet<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(TreeSet<Account> accounts) {
        this.accounts = accounts;
    }
}
