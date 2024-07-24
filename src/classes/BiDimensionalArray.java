package classes;

import java.util.Random;

/**
 * BiDimensionalArray
 */
public class BiDimensionalArray {
  public static void main() {
    System.out.println("Bi dimensional array is running...");

    showArray(createArray(30, 30));
  }

  public static int[][] createArray(int r, int c) {
    Random random = new Random();
    int[][] array = new int[r][c];

    for (int row = 0; row < array.length; row++) {
      for (int column = 0; column < array[row].length; column++) {
        array[row][column] = random.nextInt(10);
      }
    }

    return array;
  }

  public static void showArray(int[][] array) {
    for (int row = 0; row < array.length; row++) {
      for (int column = 0; column < array.length; column++) {
        System.out.print(array[row][column] + " ");
      }
      System.out.println();
    }
  }
}
