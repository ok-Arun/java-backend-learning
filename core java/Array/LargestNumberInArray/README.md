# Find the Largest Number in an Array

# [**Source Code:**](./LargestNumberInArray.java)

## Problem Statement

Given an integer array, find and return the largest element in the array.

The solution should handle negative numbers and validate the input array to prevent invalid operations.

## Approach: Single-Pass Traversal

1. Initialize a variable `largest` with the first element of the array.
2. Traverse the remaining elements starting from index `1`.
3. Compare each element with `largest`.
4. If the current element is greater, update `largest`.
5. Return `largest` after traversing the entire array.

The algorithm examines each element once without sorting the array.

## Example

**Input**
```text
5
10 25 7 40 15
```

**Expected Output**
```text
Largest Number in Array is: 40
```

## Output Screenshot

The following screenshot demonstrates the program's execution and output.

<img width="807" height="370" alt="image" src="https://github.com/user-attachments/assets/b6e7d927-68af-402a-a8a8-9c35de473396" />


## Complexity Analysis

- **Time Complexity:** O(n) — each array element is examined at most once.
- **Auxiliary Space:** O(1) for the `findLargest()` method, excluding the input array.

## Edge Cases

| Input | Expected Result |
|---|---|
| `[10, 25, 7, 40, 15]` | `40` |
| `[-10, -5, -20]` | `-5` |
| `[7]` | `7` |
| `[5, 5, 5]` | `5` |
| `[Integer.MIN_VALUE, 0]` | `0` |
| Empty array `[]` | Throws `IllegalArgumentException` |
| `null` array | Throws `IllegalArgumentException` |

## Concepts Practiced

- Arrays and array indexing
- `Scanner` and user input
- `for` loops and conditional statements
- Methods and return values
- Input validation
- Exception handling with `IllegalArgumentException`
- Time and auxiliary space complexity

## How to Run

**Prerequisite:** Install the Java Development Kit (JDK).

Open a terminal in the project folder and run:

```bash
javac LargestNumberInArray.java
java LargestNumberInArray
```

Enter the array size, followed by the array elements.

## Learning Outcome

This problem demonstrates how to find the largest element efficiently using a single-pass traversal. The same technique provides a foundation for finding the smallest, second-largest, and second-smallest distinct elements in an array.
