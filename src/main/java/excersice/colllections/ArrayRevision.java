package excersice.colllections;

public class ArrayRevision {
    public static void main(String[] args) {

        SavingAccount savingAccount1 = new SavingAccount(1, 15000, "nimal");
        SavingAccount savingAccount2 = new SavingAccount(2, 5000, "kamal");
        SavingAccount savingAccount3 = new SavingAccount(3, 1000, "namal");
        SavingAccount savingAccount4 = new SavingAccount(4, 10000, "bimal");

        SavingAccount[] savingAccounts = new SavingAccount[4];
        savingAccounts[0] = savingAccount1;
        savingAccounts[1] = savingAccount2;
        savingAccounts[2] = savingAccount3;
        savingAccounts[3] = savingAccount4;
        fixedDepositEmail(savingAccounts);
    }

    static void fixedDepositEmail(SavingAccount[] savingAccounts) {
        System.out.println("using for loop");
        for (int i = 0; i < savingAccounts.length; i++) {
            if (savingAccounts[i].getBalance() >= 10000) {
                String name = savingAccounts[i].getAccountHolderName();
                System.out.println("Dear " + name + ", You should start a fixed deposit account");
            }
        }

        /*
        foreach කියන  for loop එකෙනුත් මේ වැඩේ කර ගන්න පුළුවන් එක use කරන්නන object එක්ක වැඩ කරද්දී
         */
        System.out.println("using for each loop");
        for (SavingAccount savingAccount: savingAccounts) {
            if (savingAccount.getBalance()>=10000){
                String name = savingAccount.getAccountHolderName();
                System.out.println("Dear " + name + ", You should start a fixed deposit account");
            }
        }

    }
}

class SavingAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public SavingAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    /*
    getters, setters ඔක්කොම දැම්මේ නෑ class එක දිග වෙන නිසා. ඔයාල ඒවා දාල ලස්සනට class එක  හදා ගන්න.
account number එක read only කරන විදිය, ඒක static එක දල auto generate කරන විදිය කලින් කියල දීල තියෙන්නේ මතක් කරගන්න
     */

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
