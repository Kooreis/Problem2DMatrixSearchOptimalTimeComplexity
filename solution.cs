Here is a simple console application in C# that implements a 2D matrix search algorithm with optimal time complexity. This algorithm assumes that the matrix is sorted both row-wise and column-wise.

```C#
using System;

class Program
{
    static void Main(string[] args)
    {
        int[,] matrix = {
            { 1, 4, 7, 11, 15 },
            { 2, 5, 8, 12, 19 },
            { 3, 6, 9, 16, 22 },
            { 10, 13, 14, 17, 24 },
            { 18, 21, 23, 26, 30 }
        };

        Console.WriteLine("Enter a number to search in the matrix:");
        int target = Convert.ToInt32(Console.ReadLine());

        bool found = SearchMatrix(matrix, target);
        if (found)
            Console.WriteLine("Number found in the matrix.");
        else
            Console.WriteLine("Number not found in the matrix.");
    }

    static bool SearchMatrix(int[,] matrix, int target)
    {
        int rows = matrix.GetLength(0);
        int cols = matrix.GetLength(1);

        int i = 0;
        int j = cols - 1;

        while (i < rows && j >= 0)
        {
            if (matrix[i, j] == target)
                return true;

            if (matrix[i, j] > target)
                j--;
            else
                i++;
        }

        return false;
    }
}
```

This program first initializes a 2D matrix. It then asks the user to input a number to search for in the matrix. The `SearchMatrix` function is called with the matrix and the target number as arguments. This function starts from the top right corner of the matrix and moves either down or left depending on whether the current element is less than or greater than the target. If the target is found, it returns true; otherwise, it returns false. The result is then printed to the console.