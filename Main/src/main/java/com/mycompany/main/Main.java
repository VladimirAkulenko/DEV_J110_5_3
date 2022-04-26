/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author USER
 */
public class Main {
    private final static double PART = 100;

    public static void main(String[] args) {
        //Вложенный класс
        double f1 = TwoDimensionalRectangleMethod.numericalCalculationIntegral(new XY(),1, 3, 1, 3, PART);
        System.out.println("f1 = "+ f1);

        //Анонимный класс
        double f2 = TwoDimensionalRectangleMethod.numericalCalculationIntegral(new Function() {
            @Override
            public double getFunc(double x, double y) {
                return (Math.pow(x, 2)+x)*(2*y+1);}
        },3,4, 7, 10, PART);
        System.out.println("f2 = " + f2);

        // Ссылка на статический метод

        double f3 = TwoDimensionalRectangleMethod.numericalCalculationIntegral(ExpMinusXY :: getFunc,0.01,2, 0.5, 4,PART);
        System.out.println("f3 = " + f3);

        //Ссылка на метод экземпляра
        X2PlusY3 powX2PlusY3 = new X2PlusY3();
        double f4 = TwoDimensionalRectangleMethod.numericalCalculationIntegral(powX2PlusY3::getFunc,1,3, 1, 2,PART);
        System.out.println("f4 = "+ f4);

        //Лямбда-выражение
        double f5 = TwoDimensionalRectangleMethod.numericalCalculationIntegral((x,y) -> x*y*Math.sin(x*y),0,1, 0, 1, PART);
        System.out.println("f5 = " + f5);

    }

    private static class XY implements Function{

        @Override
        public double getFunc(double x, double y) {
            return x*y;
        }
    }


}
