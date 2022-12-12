package lesson2;

//Java program for the above approach

import java.io.*;

class BinaryFactors {
//Function to find sum of prime
//divisors of the given number N
public static int SumOfPrimeDivisors(int n)
{

	int sum = 0;

	// Add the number 2 if it divides N
	if (n % 2 == 0) {
	sum = sum + 2;
	}

	while (n % 2 == 0) {
	n = n / 2;
	}

	// Traverse the loop from [3, sqrt(N)]
	for (int i = 3; i <= Math.sqrt(n); i = i + 2) {

	// If i divides N, add i and divide N
	if (n % i == 0) {
		sum = sum + i;
	}

	while (n % i == 0) {
		n = n / i;
	}
	}

	// This condition is to handle the case when N
	// is a prime number greater than 2
	if (n > 2) {
	sum = sum + n;
	}

	return sum;
}

//Driver code
public static void main (String[] args)
{

	// Given Input
	int n = 10;

	// Function Call
	System.out.println(SumOfPrimeDivisors(n));
}


