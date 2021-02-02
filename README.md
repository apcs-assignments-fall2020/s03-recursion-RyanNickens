# Recursion

For homework, you write a couple methods to practice working with recursion. You should practice using recursion for all of these problems!

The first method will be to write a method to add up all of the digits in an int. (Hint: remember that you can use %10 to extract the last digit and /10 to remove the last digit).

The method should have the following signature:

```shell script
public static int addDigits(int x) { }
```

<br />
<br />

Next, write a method to check if a given String is a palindrome. Remember that a palindrome is a word that is the same forwards and backwards. (You may want to consider an approach similar to the **nestParens** example from class).

This method should have the following signature:
```shell script
public static boolean isPalindrome(String str) { }
```

<br />
<br />

Finally, write a method to reverse a String **recursively**. Your method should have the following signature:
```shell script
public static String reverse(String str) { }
```

<br />

## Run your code with:
```shell script
make run
```

## Run your tests with:
```shell script
make test
```