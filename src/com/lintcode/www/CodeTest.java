package com.lintcode.www;

import org.junit.Test;

public class CodeTest {

    @Test
    public void trailingZerostest(){
        Solution solution=new Solution();
        long l = solution.trailingZeros2(36);
        System.out.println(l);
    }

    public void sortTest(){
        int [] arg={11,32,23,43,24,15,2,5,7};
        Sort sort=new Sort();
        sort.quickSort(arg,0,arg.length-1);
        for (int i:arg
                ) {
            System.out.print(i+" ");
        }
    }
}
