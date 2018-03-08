package com.lintcode.www;

public class Sort {

    //冒泡排序
    public static void bubblingSort(int[] arg ){
        int tmep;
        for (int i = 0; i < arg.length-1; i++) {
            for (int j = 0; j < arg.length-1-i; j++) {
                if (arg[j+1]<arg[j]){
                    tmep=arg[j];
                    arg[j]=arg[j+1];
                    arg[j+1]=tmep;
                }
            }
        }
    }



    //选择排序
    public static void chooseSort(int [] arg){
        int temp;
        for (int i = 0; i <arg.length-1 ; i++) {
            for (int j = i+1; j < arg.length; j++) {
                if (arg[i]>arg[j]){
                    temp=arg[i];
                    arg[i]=arg[j];
                    arg[j]=temp;
                }
            }
        }
    }

    // 插入排序
    public static void insertSort(int [] arg){
        int j;
        int target;
        for (int i = 1; i <arg.length ; i++) {
            target=arg[i];
            j=i;
            while (j>0&& target<arg[j-1]){
                arg[j]=arg[j-1];
                j--;
            }
            arg[j]=target;
        }
    }


    /*
    快排
    begin 分界点下标
    end 数组的总长度
     */
    public static  void quickSort(int [] arg,int begin,int end){
        if (end<begin){
            return;
        }else {
            int middle = getMiddle(arg, begin, end);
            quickSort(arg,begin,middle-1);
            quickSort(arg,middle+1,end);
        }
    }

    /*
    先取中间下标
     */
    public static int getMiddle(int [] arg,int begin,int end){
        int temp=arg[begin];
        while (end>begin){
            while (begin<end&&temp<=arg[end]){//扫描后半部分
                end--;
            }
            arg[begin]=arg[end];
            while (begin<end&&arg[begin]<=temp){//扫描前半部分
                begin++;
            }
            arg[end]=arg[begin];
        }
        arg[end]=temp;
        return  end;
    }

    /*斐波那契数列 实现方式
    用了递归和循环来实现
    循环更快 递归比较慢
     */
    public static int  fibonacci(int n) {
        // 递归
        /*if(n==0){
            return 0;
        }
        if(n<=2){
            return n-1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }*/
        // 循环
        int a = 1, b = 1, c = 0;
        if (n==1){
            return 0;
        }
        for (int i = 0; i < n-2; i++) {
            a=c+b;
            c=b;
            b=a;
        }
        return a;
    }
}
