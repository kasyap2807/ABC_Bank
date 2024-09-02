package java2308;

public class BankAccount {
    private int id;
    private  String user;
    private String Password;

    public BankAccount(int id, String user, String password) {
        this.id = id;
        this.user = user;
        Password = password;
    }

    public BankAccount() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
