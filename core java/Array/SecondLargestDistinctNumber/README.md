# Find the Second-Largest Distinct Number in an Array

**Source Code:** [SecondLargestDistinctNumber.java](./SecondLargestDistinctNumber.java)

## Problem Statement

Given an integer array, find the **second-largest distinct number**.

The solution must handle duplicate values, negative numbers, and integer boundary values. If no second-largest distinct number exists, the method throws an `IllegalArgumentException`.

## Approach: Single-Pass Traversal

The algorithm finds the second-largest distinct number without sorting the array.

1. Initialize variables to track the largest and second-largest values.
2. Use boolean flags to track whether each value has been found.
3. Traverse the array once using an enhanced `for` loop.
4. If the current number is greater than the largest, update the second-largest value before updating the largest.
5. Otherwise, if the number is smaller than the largest and greater than the current second-largest, update the second-largest value.
6. If no second-largest distinct value exists, throw an `IllegalArgumentException`.
7. Return the second-largest distinct value.

Boolean flags prevent `Integer.MIN_VALUE` from being confused with an uninitialized value.

## Example

**Input**
```text
5
10 20 30 40 50
```

**Expected Output**
```text
The Second Largest number in Test case 2 is : 40
```

**Note:** The output above follows the current program's test-case numbering because this input is the second test array in `main()`. The method itself returns `40`.

## Output Screenshot

Add a screenshot of your actual program execution below. Save the image as `output.png` in this folder.

<img width="798" height="293" alt="image" src="https://github.com/user-attachments/assets/7ef62bbd-8039-4de5-96af-1cf47d1108b0" />


## Complexity Analysis

- **Time Complexity:** O(n) — the algorithm examines each array element once.
- **Auxiliary Space:** O(1) — the algorithm uses a fixed number of variables, excluding the input array.

## Edge Cases

| Input | Expected Result |
|---|---|
| `[-10, Integer.MIN_VALUE]` | `-10` |
| `[10, 20, 30, 40, 50]` | `40` |
| `[50, 40, 30, 20, 10]` | `40` |
| `[10, 50, 20, 40, 30]` | `40` |
| `[0, -1, 1, -2, 2]` | `1` |
| `[5, 5, 5]` | Throws `IllegalArgumentException` |
| `[5, 5, 3, 3]` | `3` |
| `[Integer.MAX_VALUE, 0]` | `0` |
| `[7]` | Throws `IllegalArgumentException` |
| `[]` | Throws `IllegalArgumentException` |
| `null` | Throws `IllegalArgumentException` |

## Concepts Practiced

- Array traversal using an enhanced `for` loop
- Finding distinct values
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
javac SecondLargestDistinctNumber.java
java SecondLargestDistinctNumber
```

The program executes the predefined test arrays and displays the result or an error message for each test case.

## Learning Outcome

This problem demonstrates how to find the second-largest distinct value in linear time without sorting the array. The same approach can be adapted to solve other array problems, including finding the second-smallest distinct number.

