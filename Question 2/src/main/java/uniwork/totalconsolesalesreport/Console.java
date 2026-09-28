
package uniwork.totalconsolesalesreport;
import java.util.Scanner;


class Console {
    protected String ConsoleType;
    protected String Store;
    protected double Sales;
   public Console(String ConsoleType, String Store, double Sales) {
    ConsoleType = ConsoleType;
    Store = Store;
    Sales = Sales;
            
}
   public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select the System Type");
                System.out.println("1) PS5");
                System.out.println("2) Xbox");
                System.out.println("3) Switch");
        ConsoleType = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter the store");
        Store = sc.nextLine();
        sc.nextLine();
        System.out.print("enter the total sale of" + ConsoleType + "for" + Store);

}
}

