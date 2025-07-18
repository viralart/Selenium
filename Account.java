public class Account {
    private int accno;
    private String name;
    private double amount;

    void setAccNo(int accno){
        this.accno = accno;
    }
    int getAccNo(){
        return accno;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setAmount(double amount){
        this.amount = amount;
    }
    double getAmount(){
        return amount;
    }
}
