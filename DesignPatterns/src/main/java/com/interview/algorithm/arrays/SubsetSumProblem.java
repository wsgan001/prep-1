package com.interview.algorithm.arrays;

public class SubsetSumProblem {


	// Returns true if there is a subset of set[] with sun equal to given sum
	boolean isSubsetSum(int set[], int n, int sum)
	{
		// Base Cases
		if (sum == 0)
			return true;
		if (n == 0 && sum != 0)
			return false;

		// If last element is greater than sum, then ignore it
		if (set[n-1] > sum)
			return isSubsetSum(set, n-1, sum);

		/* else, check if sum can be obtained by any of the following
	      (a) including the last element
	      (b) excluding the last element   */
		return isSubsetSum(set, n-1, sum) || isSubsetSum(set, n-1, sum-set[n-1]);
	}
	public static void main(String[] args) {
		SubsetSumProblem prob = new SubsetSumProblem();
		
		int set[] = {3, 34, 4, 12, 5, 2};
		int sum = 9;


		if (prob.isSubsetSum(set, set.length, sum) == true)

			System.out.println("Found a subset with given sum");
		else
			System.out.println("No subset with given sum");
	}
}