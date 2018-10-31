import org.json.JSONObject;

public class App {

    public static void main(String[] args) {

        Account account = new Account("Johnny", "Bravo", "123456");
        Account account2 = new Account("John", "Bravo", "789");
        Account account3 = new Account("John", "Vamos", "7891");
        Account account4 = new Account("Leroy", "Vamos", "7891");

        Service service = new Service();
        service.addAccount(account);
        //print maps
        System.out.println(service.getAccounts());
        
        service.addAccount(account2);
        service.addAccount(account3);
        service.addAccount(account4);
        
        //print specific accs by id
        System.out.println(service.retrieveAccount(account.getAccountNumber()));
        System.out.println(service.retrieveAccount(account2.getAccountNumber()));
        
        service.deleteAccount(account.getAccountNumber());
        System.out.println(service.getAccounts());
        
        System.out.println("");
        
        JSONObject json = new JSONObject();
        json.put(account2.getAccountNumber(), service.retrieveAccount(account2.getAccountNumber()));
        System.out.printf( "JSON of Map: %s", json.toString() );

    }
}
