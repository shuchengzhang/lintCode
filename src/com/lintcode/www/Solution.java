package com.lintcode.www;

public class Solution {
    public long count;
    /*
    求阶乘尾数有几个零
     思路：
     10的最小质因数是5和2 因为2的倍速必然在5的前面所以只要找5倍数的个数就可以了
     特殊的有25 5*5 以此类推
     */
    public  long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long temp = (long) (n/5);
        count+=temp;
        if (temp>=5){
            trailingZeros(temp);
        }
        return count;
    }
}
