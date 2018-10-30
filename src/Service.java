
import java.util.HashMap;
import java.util.Map;

public class Service {
    private Map<String, Account> accounts;

    Service() {
        this.accounts = new HashMap<>();
    }

    Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    Account addAccount(Account account) {
        return accounts.put(account.getAccountNumber(), account);
    }

    Account deleteAccount(String accountNumber) {
        return accounts.remove(accountNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service service = (Service) o;

        return accounts != null ? accounts.equals(service.accounts) : service.accounts == null;
    }

    @Override
    public int hashCode() {
        return accounts != null ? accounts.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Service{" +
                "accounts=" + accounts +
                '}';
    }
}
