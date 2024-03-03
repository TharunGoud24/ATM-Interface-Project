 package atm;
 public class User
  {
    public String userId;
    int PIN;
    double accountBalance;

    public User(String userId,int PIN,double accountBalance)
    {
        this.userId=userId;
        this.PIN=PIN;
        this.accountBalance=accountBalance;
    }

    public String getUserId() {
      return userId;
    }

    public int getPIN() {
      return PIN;
    }

    public void setAccountBalance(double accountBalance) {
      this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
      return accountBalance;
    }
  }