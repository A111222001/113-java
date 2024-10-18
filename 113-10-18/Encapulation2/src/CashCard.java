class CashCard {
    String number;
    int balance;
    int bonus;

    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    void store(int money){
        if (money > 0){
            this.balance += money;
        }
        else{
            
        }
    }
}