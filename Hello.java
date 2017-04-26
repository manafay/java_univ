class Hello {

public static void printChar(String val, int n) {
  for (int i = 0; i < n; ++i) {
    System.out.print(val);
  }
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

  public static void main(String[] args) {
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
}

}
