package assignmentsamantha;

import java.util.Scanner;

class Buyer {

    int head;
    int tail;
    String arr[];
    double money = 0;
    Scanner s = new Scanner(System.in);
    double totalMoney = 0;

    public double insertMoney() {
        System.out.println("Insert money : ");
        money = s.nextDouble();
        displayCatalogue();
        return money;
    }

    public void notEnoughMoney() {
        while (money < 1.00 && totalMoney < 1.00) {
            System.out.println("Amount is not sufficient");
            System.out.println("Do you want to proceed?[yes/no]");
            String answer = s.next();
            if (answer.equals("yes")) {
                double temp = money;
                insertMoney();

                totalMoney = temp + money;
                System.out.println("Total money: " + totalMoney);
                totalMoney();
            } else {
                System.out.println("Thank You!");
            }
            break;

        }
    }

    public void displayCatalogue() {
        if (money < 1.00 && totalMoney < 1.00) {
            notEnoughMoney();
        } else {
            if (money >= 1.00 && money < 1.50) {
                System.out.println("Select your drink:");
                System.out.println("[5] SkyJuice\t\tRM 1.00\n");
            }
            if (money >= 1.50 && money < 2.00) {
                System.out.println("Select your drink:");
                System.out.println("[1] 99plus\t\tRM 1.50\n"
                        + "[2] Popci\t\tRM 1.50\n"
                        + "[4] Pikapoo\t\tRM 1.50\n"
                        + "[5] SkyJuice\t\tRM 1.00\n"
                        + "[7] Spright\t\tRM 1.50\n");
            }
            if (money >= 2.00 && money < 2.50) {
                System.out.println("Select your drink:");
                System.out.println("[1] 99plus\t\tRM 1.50\n"
                        + "[2] Popci\t\tRM 1.50\n"
                        + "[3] Hell&Sky\t\tRM 2.00\n"
                        + "[4] Pikapoo\t\tRM 1.50\n"
                        + "[5] SkyJuice\t\tRM 1.00\n"
                        + "[7] Spright\t\tRM 1.50\n"
                        + "[8] LegalCaffeine\tRM 2.00");
            }
            if (money >= 2.50) {
                System.out.println("Select your drink:");
                System.out.println("[1] 99plus\t\tRM 1.50\n"
                        + "[2] Popci\t\tRM 1.50\n"
                        + "[3] Hell&Sky\t\tRM 2.00\n"
                        + "[4] Pikapoo\t\tRM 1.50\n"
                        + "[5] SkyJuice\t\tRM 1.00\n"
                        + "[6] MAILO\t\tRM 2.50\n"
                        + "[7] Spright\t\tRM 1.50\n"
                        + "[8] LegalCaffeine\tRM 2.00");
            }
        }
    }

    public void totalMoney() {
        if (totalMoney >= 1.00 && totalMoney < 1.50) {
            System.out.println("Select your drink:");
            System.out.println("[5] SkyJuice\t\tRM 1.00\n");
        }
        if (totalMoney >= 1.50 && totalMoney < 2.00) {
            System.out.println("Select your drink:");
            System.out.println("[1] 99plus\t\tRM 1.50\n"
                    + "[2] Popci\t\tRM 1.50\n"
                    + "[4] Pikapoo\t\tRM 1.50\n"
                    + "[5] SkyJuice\t\tRM 1.00\n"
                    + "[7] Spright\t\tRM 1.50\n");
        }
        if (totalMoney >= 2.00 && totalMoney < 2.50) {
            System.out.println("Select your drink:");
            System.out.println("[1] 99plus\t\tRM 1.50\n"
                    + "[2] Popci\t\tRM 1.50\n"
                    + "[3] Hell&Sky\t\tRM 2.00\n"
                    + "[4] Pikapoo\t\tRM 1.50\n"
                    + "[5] SkyJuice\t\tRM 1.00\n"
                    + "[7] Spright\t\tRM 1.50\n"
                    + "[8] LegalCaffeine\tRM 2.00");
        }
        if (totalMoney >= 2.50) {
            System.out.println("Select your drink:");
            System.out.println("[1] 99plus\t\tRM 1.50\n"
                    + "[2] Popci\t\tRM 1.50\n"
                    + "[3] Hell&Sky\t\tRM 2.00\n"
                    + "[4] Pikapoo\t\tRM 1.50\n"
                    + "[5] SkyJuice\t\tRM 1.00\n"
                    + "[6] MAILO\t\tRM 2.50\n"
                    + "[7] Spright\t\tRM 1.50\n"
                    + "[8] LegalCaffeine\tRM 2.00");
        }
    }

    public void confirmTransaction(Cart1 cart) {
        
       
        System.out.println("Would you like to confirm your transaction? [yes/no]");
        String answer = s.next();
        if (answer.equals("yes")) { 
            if(money < cart.getTotalAmount()){
                    System.out.println("Transaction error not enough money ");
                    System.out.println("Here is your money : RM" + money);
                             }else{
            System.out.println("Thank you! Have a nice day~");
            }
        } else {
            cancelTransaction(cart);
        }
    }

    //get the amount of money left after bought drinks
   public void balance(Cart1 cart){
        
        double balance = money - cart.getTotalAmount();
        
        System.out.println("Balance: " + balance);
    }

    public void cancelTransaction(Cart1 cart) {
        System.out.println("cancel your transaction?[yes/no]");
        String answer = s.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Which drink do you wish to discard?");
            int remove = s.nextInt();
            cart.removeNode(remove);

            System.out.println("==========================");
            System.out.println("");
            cart.display();
            System.out.println("");
            System.out.println("Thank you! Have a nice day~");
        } else {   //--> ni untuk tambah lagi air
            insertMoney();
            Counter c1 = new Counter();
            c1.returnNum();
//            cart.display();
        }
    }
}


