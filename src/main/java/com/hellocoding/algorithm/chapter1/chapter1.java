package com.hellocoding.algorithm.chapter1;

import com.sun.tools.javac.util.List;

/**
 * @author kim, eun soo - devegoist
 * @date 17/01/2019
 * Chapter 1. Binary Search
 */
public class chapter1 {

    public static void main(String[] args) throws Exception {
        final List list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int target = 2;

        System.out.println(binarySearchByList(list, target) + "번쨰에 위치한다.");
        System.out.println(binarySearchByArray(array, target) + "번쨰에 위치한다.");
    }

    private static int binarySearchByArray(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            int guess = array[mid];

            if (guess == target) {
                return  mid;
            } else if (guess < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0;
    }

    private static int binarySearchByList(List list, int target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            int guess = (int) list.get(mid);

            if (guess == target) {
                return mid;
            } else if (guess < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0;
    }
}
