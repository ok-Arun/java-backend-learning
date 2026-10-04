# Find the Largest Number in an Array

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
Enter the length of Array : 5
10 25 7 40 15
```

**Output**
```text
Largest Number in Array is: 40
```

## Algorithm

```text
START
  |
  v
Validate the array
  |
  v
Initialize largest = array[0]
  |
  v
Traverse remaining elements
  |
  v
Is current element > largest?
  |
  +---- Yes ----> Update largest
  |                   |
  +---- No ------------+
                      |
                      v
              More elements?
                |         |
               Yes        No
                |         |
                v         v
             Continue   Return largest
```

## Complexity Analysis

- **Time Complexity: O(n)** — the algorithm traverses the array once, where `n` is the number of elements.
- **Auxiliary Space: O(1)** — the `findLargest()` method uses a fixed number of variables, excluding the input array.

## Edge Cases

| Input | Expected Result |
|---|---|
| `[10, 25, 7, 40, 15]` | `40` |
| `[-10, -5, -20]` | `-5` |
| `[7]` | `7` |
| `[5, 5, 5]` | `5` |
| `[Integer.MIN_VALUE, 0]` | `0` |
| `[]` | Throws `IllegalArgumentException` |
| `null` | Throws `IllegalArgumentException` |

## Concepts Practiced

- Java arrays and array indexing
- `Scanner` for user input
- `for` loops and conditional statements
- Methods and return values
- Input validation
- Exception handling with `IllegalArgumentException`
- Time and auxiliary space complexity

## How to Run

**Prerequisite:** Install the Java Development Kit (JDK).

Open a terminal in this folder and run:

```bash
javac LargestNumberInArray.java
java LargestNumberInArray
```

Enter the array size when prompted, followed by the array elements.

## Learning Outcome

This problem demonstrates how to find an extreme value efficiently using a single-pass traversal. The same pattern can be adapted to find the smallest, second-largest, or second-smallest distinct element in an array.
