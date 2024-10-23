public class Array {
  public static void main(String[] args) {
    String[][] arr = new String[2][2];
    arr[0][0] = "Mr. ";
    arr[0][1] = "Ms. ";
    arr[1][0] = "Smith";
    arr[1][1] = "Jones";

    String[] copyFrom = {
        "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
        "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
        "Marocchino", "Ristretto" };

    String[] copyTo = new String[7];
    System.arraycopy(copyFrom, 2, copyTo, 0, 7);
    for (String coffee : copyTo) {
      System.out.println(coffee);
    }

  }
}
