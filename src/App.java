
public class App {

    public static void main(String[] args) {

        Account account = new Account("Johnny", "Bravo", "123456");

        Service service = new Service();
        service.addAccount(account);
        System.out.println(service.getAccounts());
        service.deleteAccount(account.getAccountNumber());
        System.out.println(service.getAccounts());
    }
}
