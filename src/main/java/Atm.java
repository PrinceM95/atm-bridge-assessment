public class Atm {

    private int balance;
    private String pin;

    //constructor
    public Atm(int balance, String requiredPin) {
        this.balance = balance;
        this.pin = requiredPin;

    }
    //getter method
    public int getBalance() {
        return balance;
    }

    //behavioral methods
    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
    }

    public void withdraw(int amountToWithdraw) {
        if(amountToWithdraw <= balance) {
            balance -= amountToWithdraw;
        } else {
            System.out.println("Insufficient funds to make the withdraw, please try again");
        }
    }

        public boolean allowAccess(String enteredPin) {
        if(enteredPin.equals(pin)) {
            return true;
            } else {
                return false;
            }
        }
    }

