Here is a Java console application that implements a 2D matrix search algorithm with optimal time complexity. This algorithm assumes that the matrix is sorted both row-wise and column-wise.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter target element:");
        int target = scanner.nextInt();
        boolean found = searchMatrix(matrix, target);
        if (found) {
            System.out.println("Element found in the matrix");
        } else {
            System.out.println("Element not found in the matrix");
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int row = 0;
        int column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return false;
    }
}
```

This program first takes the number of rows and columns as input from the user. Then it takes the elements of the matrix as input. After that, it takes the target element as input. It then calls the `searchMatrix` method to search for the target element in the matrix. If the element is found, it prints "Element found in the matrix". Otherwise, it prints "Element not found in the matrix".