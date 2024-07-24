package classes;

/**
 * Arrays
 */
public class Arrays {
  public static void main() {
    System.out.println("Arrays in Java");
    // Dimensional array only one dimension
    showArray(createSimpleArray(3));
  }

  public static int[] createSimpleArray(int n) {
    int[] array = new int[n];

    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }

    return array;
  }

  public static void showArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("The current value fotr the array is: " + array[i]);
    }
  }
}
