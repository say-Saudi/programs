/*
1. PROBLEM

Problem: Sum of all elements in an array.
Platform: Self
Difficulty: Easy
Topic: Arrays

2. ANALYSIS

Problem Statement: Need a function that takes an array of integers as input and returns the sum of all its elements.
Example:
Input: [12, 5, 99, 3, 56, 88]
Output: 263
Explanation: 12 + 5 + 99 + 3 + 56 + 88 = 263
Edge cases: Empty array (sum = 0), single element array (sum = that element). Different data types (For this problem, I will assume all elements are integers).

3. APPROACH

Key idea: To iterate through the array using for each loop and keep a running total of the sum.
Pseudocode:
function sumArray(arr):
    sum = 0
    for each element in arr:
        sum = sum + element
    return sum

4. CODE

<see below for implementation>

5. TEST

{} -> 0
{5} -> 5
{0} -> 0
{-5, 10} -> 5
{0, 0, 0} -> 0
{-1, -2, -3} -> -6
{10, 20, 30} -> 60
{4, -2, 7, -3} -> 6
{0, 5, 0, 10} -> 15
{1, 2, 3, 4, 5} -> 15
{12, 5, 99, 3, 56, 88} -> 263


6. COMPLEXITY

Time Complexity: O(n), where n is the number of elements in the array, since I need to iterate through all elements once
Space Complexity: O(1), as only a single variable `sum` is used regardless of the array size.

7. NOTES

- Future upgrades: 
    - Handle different data types (e.g., floats, doubles).
    - Implement error handling for non-integer inputs.

*/
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {4, -2, 7, -3};
        System.out.println("Sum of array: " + sumArray(arr));
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        if (arr.length == 0) {
            return sum;
        }
        else if (arr.length == 1) {
            return arr[0];
        }
        else {
            for (int num:arr) {
            sum += num;
            }
            return sum;
        }        
    }
}