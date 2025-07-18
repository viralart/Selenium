public class AccountMain {
    public static void main(String args[]){
        Account acc = new Account();
        acc.setAccNo(101);
        System.out.println(acc.getAccNo());
        acc.setName("John Doe");
        System.out.println(acc.getName());
        acc.setAmount(2500.75);
        System.out.println(acc.getAmount());
        acc.setAmount(acc.getAmount() + 500.25);
        System.out.println("Updated Amount: " + acc.getAmount());
        acc.setAmount(acc.getAmount() - 1000.00);
        System.out.println("Final Amount: " + acc.getAmount());
        

    }
}
