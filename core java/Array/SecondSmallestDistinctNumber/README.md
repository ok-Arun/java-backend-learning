# Find the Second-Smallest Distinct Number in an Array

**Source Code:** [SecondSmallestDistinctNumber.java](./SecondSmallestDistinctNumber.java)

## Problem Statement

Given an integer array, find the **second-smallest distinct integer**.

The solution handles duplicate values, negative numbers, and integer boundary values. If a second-smallest distinct value does not exist, the method throws an `IllegalArgumentException`.

## Approach: Single-Pass Traversal

The algorithm finds the second-smallest distinct number without sorting the array.

1. Initialize variables to track the smallest and second-smallest values.
2. Use boolean flags to track whether each value has been found.
3. Traverse the array once using an enhanced `for` loop.
4. If the current number is smaller than the smallest value, update the second-smallest value before updating the smallest value.
5. Otherwise, if the number is greater than the smallest value and smaller than the current second-smallest value, update the second-smallest value.
6. If no second-smallest distinct value exists, throw an `IllegalArgumentException`.
7. Return the second-smallest distinct value.

Boolean flags prevent `Integer.MAX_VALUE` from being confused with an uninitialized value.

## Example

**Input**
```text
5
10 20 30 40 50
```

**Expected Output**
```text
The Second smallest number in Test case 2 is : 20
```

The output uses test-case number 2 because `[10, 20, 30, 40, 50]` is the second array in the current `main()` method.

## Output Screenshot

The screenshot below demonstrates the program's execution and output.

<img width="801" height="527" alt="image" src="https://github.com/user-attachments/assets/b528e20c-dc48-4351-953b-56ed6ada10bd" />


To display the image, save your actual program screenshot as `output.png` in the same folder as this README.

## Complexity Analysis

- **Time Complexity:** O(n) — each array element is examined once.
- **Auxiliary Space:** O(1) — the algorithm uses a fixed number of variables, excluding the input array.

## Edge Cases

| Input | Expected Result |
|---|---|
| `[-10, Integer.MIN_VALUE]` | `-10` |
| `[10, 20, 30, 40, 50]` | `20` |
| `[50, 40, 30, 20, 10]` | `20` |
| `[10, 50, 20, 40, 30]` | `20` |
| `[0, -1, 1, -2, 2]` | `-1` |
| `[5, 5, 5, 3, 3]` | `5` |
| `[5, 5, 5]` | Throws `IllegalArgumentException` |
| `[Integer.MAX_VALUE, 0]` | `Integer.MAX_VALUE` |
| `[7]` | Throws `IllegalArgumentException` |
| `[]` | Throws `IllegalArgumentException` |
| `null` | Throws `IllegalArgumentException` |

## Concepts Practiced

- Array traversal using an enhanced `for` loop
- Finding distinct minimum values
- Conditional statements
- Boolean flags
- Methods and return values
- Input validation
- Exception handling
- Integer boundary values
- Time and auxiliary space complexity
- Test-case design

## How to Run

**Prerequisite:** Install the Java Development Kit (JDK).

Open a terminal in the folder containing the Java file and run:

```bash
javac SecondSmallestDistinctNumber.java
java SecondSmallestDistinctNumber
```

The program runs the predefined test arrays and displays either the result or an error message for each test case.

## Learning Outcome

This problem demonstrates how to find the second-smallest distinct element in linear time without sorting the array. The same technique can be adapted to solve other array problems, including finding the largest and second-largest distinct values.
