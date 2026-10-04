# Find the Largest Number in an Array

**Source Code:** [LargestNumberInArray.java](./LargestNumberInArray.java)

## Problem Statement

Given an integer array, find and return the largest element in the array.

The solution should handle negative numbers and validate the input array to prevent invalid operations.

## Approach: Single-Pass Traversal

1. Check whether the array is `null` or empty. If so, throw an `IllegalArgumentException`.
2. Initialize a variable `largest` with the first element of the array.
3. Traverse the remaining elements starting from index `1`.
4. If the current element is greater than `largest`, update `largest`.
5. Return `largest` after the traversal is complete.

This approach examines each element once without sorting the array.

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

## Algorithm

1. Initialize `largest` with the first array element.
2. Compare each remaining element with `largest`.
3. Update `largest` whenever a greater element is found.
4. Return `largest` after traversing the array.

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
- Exception handling
- Time and auxiliary space complexity

## How to Run

Open a terminal in this folder and execute:

```bash
javac LargestNumberInArray.java
java LargestNumberInArray
```

Enter the array size, followed by the array elements.

## Learning Outcome

Learn how to find the largest element efficiently using a single-pass traversal. This technique also provides a foundation for solving other array problems, such as finding the smallest and second-largest distinct elements.
