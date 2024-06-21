Here is a Python console application that implements a 2D matrix search algorithm with optimal time complexity. This algorithm assumes that the matrix is sorted both row-wise and column-wise.

```python
def search(matrix, target):
    if not matrix:
        return False

    row, col = 0, len(matrix[0]) - 1

    while row < len(matrix) and col >= 0:
        if matrix[row][col] == target:
            return True
        elif matrix[row][col] > target:
            col -= 1
        else:
            row += 1

    return False

def main():
    matrix = [
        [1, 4, 7, 11, 15],
        [2, 5, 8, 12, 19],
        [3, 6, 9, 16, 22],
        [10, 13, 14, 17, 24],
        [18, 21, 23, 26, 30]
    ]
    target = int(input("Enter the target number: "))
    result = search(matrix, target)
    if result:
        print("Target found in matrix.")
    else:
        print("Target not found in matrix.")

if __name__ == "__main__":
    main()
```

This Python console application first defines a function `search` that implements the 2D matrix search algorithm. It then defines a `main` function that creates a 2D matrix, prompts the user to enter a target number, and calls the `search` function to search for the target number in the matrix. If the target number is found in the matrix, it prints "Target found in matrix." Otherwise, it prints "Target not found in matrix." The `main` function is then called in the `if __name__ == "__main__":` block to start the application.