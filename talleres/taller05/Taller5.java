/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author clase
 */
public class Taller5 {

    //ArrayMax
    public static int arrayMax(int[] array, int n) {
        int i, max, temp;
        max = array[n];
        if (n != 0) {
            temp = arrayMax(array, n - 1);
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    //groupSum
    public static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        return groupSum(start + 1, nums, target - nums[start])
                || groupSum(start + 1, nums, target);
    }

    //fibonacci
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
 public static int[] generarArregloDeTamanoN(int n) {
        int max = 5000;
        int[] a = new int[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = generator.nextInt(max);
        }
        return a;
    }
  
    
    public static void main(String[] args){
      int[] a = generarArregloDeTamanoN(32);
     long startTime = System.currentTimeMillis();
        //arrayMax(a,a.length-1);
        groupSum(0,a,a.length-1);
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println(estimatedTime);
    }
}
