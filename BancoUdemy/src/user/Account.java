package user;

public class Account {
    private String user;
    private int number;
    private float balance;

    public Account(String user, int number, float balance) {
        this.user = user;
        this.balance = balance;
        this.number = number;
    }

    public Account(String user, int number) {
        this.user = user;
        this.number = number;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public float getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public String deposit(float value){
        balance += value;
        return "Você depositou R$: " + value;
    }
    public void withdraw(float value){
        if(value > 0){
            balance -= value;
        }else{
            System.out.println("Digite um valor válido.");
        }

    }
    public String data(){
        String data = "Conta " + this.getNumber() + ", Titular: " + this.getUser() + ", Saldo: " + this.getBalance();
        return data;
    }





}
