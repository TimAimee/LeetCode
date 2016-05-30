package com.timaimee.zero;

/**
 * @author timaimee
 * @date 2016-05-29 23:51
 * @des Reverse Integer
 */
public class LeetCode07 {
	public static void main(String[] args) {
		System.out.println(reverse(3456));
	}

	public static int reverse(int x) {
	        long r = 0;
	        while(x != 0){
	            r = r*10 + x%10;
	            x /= 10;
	        }
	        if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
	            return (int)r;
	        else
	            return 0;
	    }
}
