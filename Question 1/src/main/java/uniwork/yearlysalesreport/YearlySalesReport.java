
package uniwork.yearlysalesreport;



public class YearlySalesReport {

    public static void main(String[] args) {
        int[] Location = {1 , 2, 3};
        double[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200},
        };
        System.out.println("\n---------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("---------------------------------------------");
        System.out.println("            PS5   XBOX  Switch");


            for (int i = 0; i < Location.length; i++) {
            System.out.printf("%-8d--> ", Location[i]);


            for (int j = 0; j < sales[i].length; j++) {
            System.out.printf("%-6.0f", sales[i][j]);
            }
            System.out.println();
            }
            System.out.println("\n---------------------------------------------");
    System.out.println("CONSOLE SALE TOTALS FOR EACH CITY");
    System.out.println("---------------------------------------------");
    for (int i = 0; i < Location.length; i++) {
        double total = 0;
        for (int j = 0; j < sales[i].length; j++) {
            total += sales[i][j];
        }
           System.out.printf("%-8d--> %1f\n", Location[i], total);
        }
    }
}
    


        

