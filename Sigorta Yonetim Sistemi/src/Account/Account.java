package Account;

import Common.InvalidAuthenticationException;
import Insurance.Insurance;

import java.util.List;
import java.util.Objects;

public abstract class Account implements Comparable<Account>{

    private User user;
    private List<Insurance> insuranceList;
    private AuthenticationStatus authenticationStatus;

    public Account(User user) {
        this.user = user;
    }

    public Account(User user, List<Insurance> insuranceList) {
        this.user = user;
        this.insuranceList = insuranceList;
    }

    public abstract void addInsurancePolicy();

    public final void showUserInfo() {
        System.out.println(user.toString());
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if(email.equals(this.user.getEmail()) && password.equals(this.user.getPassword())) {
            this.authenticationStatus = AuthenticationStatus.SUCCESS;
        }
        else
            throw new InvalidAuthenticationException("Invalid email or password!");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(List<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    @Override
    public int compareTo(Account o) {
        return this.hashCode() - o.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(user, account.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }
}
