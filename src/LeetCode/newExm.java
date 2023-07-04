package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class newExm {
        public static int LongestIncreasingSequence(int[] arr) {
            int n = arr.length;
            int[] lis = new int[n];

            for (int i = 0; i < n; i++) {
                lis[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (arr[i] > arr[j] && lis[j] + 1 > lis[i]) {
                        lis[i] = lis[j] + 1;
                    }
                }
            }

            int maxLength = 0;
            for (int i = 0; i < n; i++) {
                if (lis[i] > maxLength) {
                    maxLength = lis[i];
                }
            }

            return maxLength;
        }

        public static void main(String[] args) {
            // Test cases
            int[] arr1 = {9, 9, 4, 2};
            System.out.println(LongestIncreasingSequence(arr1)); // Output: 1

            int[] arr2 = {10, 22, 9, 33, 21, 50, 41, 60, 22, 68, 90};
            System.out.println(LongestIncreasingSequence(arr2)); // Output: 7
        }
    }


