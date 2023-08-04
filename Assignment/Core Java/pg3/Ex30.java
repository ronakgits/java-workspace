abstract class Bank {

    public abstract int getBalance();
}

class BankA extends Bank {

    private int balance = 100;

    @Override
    public int getBalance() {

        return balance;
    }
}

class BankB extends Bank {

    private int balance = 150;

    @Override
    public int getBalance() {

        return balance;
    }
}

class BankC extends Bank {

    private int balance = 200;

    @Override
    public int getBalance() {

        return balance;
    }
}

public class Ex30 {

    public static void main(String[] args) {
        
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Balance in Bank A: Rs." + bankA.getBalance());
        System.out.println("Balance in Bank B: Rs." + bankB.getBalance());
        System.out.println("Balance in Bank C: Rs." + bankC.getBalance());
    }
}