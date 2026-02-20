/*
1. PROBLEM

Problem: Average of elements in an array
Platform: Self
Difficulty: Easy
Topic: Arrays

2. ANALYSIS

Problem Statement: Need a function that takes an array aas input and returns the average of its elements. 
Example:
Input: {4, -2, 7, -3}
Output: 1.5
Explanation: [4 + (-2) + 7 + (-3)] / 4 = 1.5.
Edge cases: Empty array, Single element array, Data type handling (bytes, shorts, int, long, float, double). For this case, I'll assume the input is an array of integers and the output is a double to handle cases where the average is not an integer.

3. APPROACH

A function will iterate over the array and calulate the average of the array elements, by dividing the their total sum by the total number of elements in the array. 
Key idea: For this case, since I already have a function to calculate the sum of the array elements. I'll just call that method and divide the result by the length of the array. 

4. CODE

<see below for implementation>

5. TEST

{} -> 0
{5} -> 5
{0} -> 0
{-5, 10} -> 2.5
{0, 0, 0} -> 0
{-1, -2, -3} -> -2
{10, 20, 30} -> 20
{4, -2, 7, -3} -> 1.5
{0, 5, 0, 10} -> 3.75
{1, 2, 3, 4, 5} -> 3
{12, 5, 99, 3, 56, 88} -> 43.83

6. COMPLEXITY

Time Complexity: O(n)
Space Complexity: O(1)

7. NOTES

- Future upgrades: 
    - Handle different data types (e.g., floats, doubles).
    - Implement error handling for non-integer inputs.
*/

public class ArrayAvg {
    public static double avgArray(int[] arr) {
        if (arr.length == 0) {
            return 0; // Avoids divison by 0.
        }
        else {
            return (double) ArraySum.sumArray(arr) / arr.length;
        }
    }
}
