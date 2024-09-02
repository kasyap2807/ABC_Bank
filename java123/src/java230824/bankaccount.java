package java230824;

public class bankaccount {
    private int AccountNumber;
    private String username;
    private String Password;
    private double phoneNumber;
    private String mailId;
    private double currentbalnce;

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public double getCurrentbalnce() {
        return currentbalnce;
    }

    public void setCurrentbalnce(double currentbalnce) {
        this.currentbalnce = currentbalnce;
    }

    public bankaccount() {
    }
}
