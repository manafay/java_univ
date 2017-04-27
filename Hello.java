import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.io.Exception;
class Hello {

public static void printChar(String val, int n) {
  for (int i = 0; i < n; ++i) {
    System.out.print(val);
  }
}

public static boolean isValidOption(int x) {
  return x >= 1 && x <= 5;
}

public static void displayUsageMenu() {
  System.out.println("ENTER USAGE DETAILS MENU");
  System.out.println("Please select an option from the menu:");
  System.out.println("1. Phone Call");
  System.out.println("2. SMS");
  System.out.println("3. Data Usage");
  System.out.println("4. Return to main menu");
}

public static void displayMainMenu() {
  System.out.println("MAIN MENU");
  System.out.println("Please select an option from the menu:");
  System.out.println("1. Enter Usage Details");
  System.out.println("2. Display Cost Under Plan A");
  System.out.println("3. Display Cost Under Plan B");
  System.out.println("4. Clear Usage Details");
  System.out.println("5. Exit System");
}

  public static void main(String args[]) throws Exception {
    printChar("*", 80);
    System.out.println();
    printChar(" ", 15);
    System.out.println("FEDERATION UNIVERSITY PHONE BILL COMPARISON SYSTEM");
    System.out.println();
    System.out.println("Developed by Mohammed Rizwan, student Id ******** for ITECH1000 Semester 1 2017");
    System.out.println();
    printChar("*", 80);
    System.out.println();
      displayMainMenu();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// String s = br.readLine();
    int i;
    while ((i = Integer.parseInt(br.readLine())) != 5)
    {
      if(!isValidOption(i)) {
          System.out.println("Value must be between 1 and 5. Please try again:");
      } else {
        switch(i) {
         case 1:
         displayUsageMenu();
         int x;
         while ((x = Integer.parseInt(br.readLine())) != 4)
         {

         }
         displayMainMenu();
            break;
        default: break;
        }
      }


    }


}

}
