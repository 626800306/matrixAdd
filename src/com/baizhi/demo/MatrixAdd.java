package com.baizhi.demo;

public class MatrixAdd {
    public static void main(String[] args) {
        //初始化arrA数组和arrB数组
        int[][] arrA = {{1,2,3},{2,3,4}};
        int[][] arrB = {{2,3,4},{3,4,5}};
        //初始化数组维数
        int x = 2;
        int y = 3;
        //初始化数组arrC
        int[][]arrC = new int[x][y];
        //调用方法
        matrixAdd(arrA,arrB,arrC,2,3);
        //遍历数组arrA,arrB,arrC
        System.out.println("遍历数组A元素:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arrA[i][j]+"\t");
            }
            //一行遍历完之后 换行
            System.out.println();
        }
        System.out.println("遍历数组B元素:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arrB[i][j]+"\t");
            }
            //一行遍历完之后 换行
            System.out.println();
        }
        System.out.println("遍历数组C元素:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arrC[i][j]+"\t");
            }
            //一行遍历完之后 换行
            System.out.println();
        }
    }

    //参数两个相加的矩阵arrA, arrB以及他们的纬度x,y  和相加后的矩阵
    public static void matrixAdd(int[][] arrA, int[][] arrB, int[][] arrC, int x, int y) {
        //设置行和列
        int row, col;
        //行列小于0输出  纬度不能小于0
        if (x <= 0 || y <= 0) {
            System.out.println("矩阵纬度不能小于等于0");
            return;
        }
        //两个数组进行遍历 相加得到第三个数组
        for (row = 0; row < x; row++) {
            for (col = 0; col < y; col++) {
                //相加后得到第三个数组
                arrC[row][col] = arrA[row][col]+arrB[row][col];
            }
        }

    }
}
