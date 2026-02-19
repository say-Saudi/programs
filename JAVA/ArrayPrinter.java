/*
1. PROBLEM --------------------------------------------------------------------

Problem: Print all elements of an array
Platform: Self
Difficulty: Easy
Topic: Arrays

2. ANALYSIS --------------------------------------------------------------------

Problem Statement: Need a function that takes an array as input and print all its elements in a single line.
Example:
Input: [12, 5, 99, 3, 56, 88]
Output: 12 5 99 3 56 88
Explanation: All elements of the array are printed in order.
Edge cases: Empty array, single element array.

3. APPROACH --------------------------------------------------------------------

For now, I will pre-define an array and call a function which will loop through the array and prinyteach value.
I will use for-each loop to iterate through the array. 

4. CODE --------------------------------------------------------------------

<see below for implementation>

5. TEST --------------------------------------------------------------------

{} -> (prints nothing)
{5} -> 5
{1, 2, 3, 4, 5} -> 1 2 3 4 5
{10, 20, 30} -> 10 20 30
{-1, -2, -3} -> -1 -2 -3
{-5, 10} -> -5 10
{4, -2, 7, -3} -> 4 -2 7 -3
{0} -> 0
{0, 0, 0} -> 0 0 0
{0, 5, 0, 10} -> 0 5 0 10
{1000, 2000, 3000} -> 1000 2000 3000
{Integer.MAX_VALUE, 0} -> 2147483647 0
{5, 4, 3, 2, 1} -> 5 4 3 2 1
{1, -1, 1, -1, 1} -> 1 -1 1 -1 1

6. COMPLEXITY --------------------------------------------------------------------

Time Complexity: O(n), where n is the number of elements in the array
Space Complexity: O(n), where n is the number of elements in the array

7. NOTES --------------------------------------------------------------------

- Future upgrades: 
    - Generalise array printing to handle multi-dimensional arrays.
    - Function should handle arrays of different data types, automatically.
*/
public class ArrayPrinter {
    public static void main(String[] args) {
        int[] arr = {12, 5, 99, 3, 56, 88};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println(); // Print a newline at the end
    }
}