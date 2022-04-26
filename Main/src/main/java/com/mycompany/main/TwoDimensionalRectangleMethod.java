/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author USER
 */

//Вычисление интеграла заданной двумерной функции методом прямоугольников
public class TwoDimensionalRectangleMethod {
    public static double numericalCalculationIntegral (Function func, double xA, double xB, double yA, double yB, double part){

            double result =0;
            double square = ((xB-xA)*(yB-yA))/Math.pow(part,2);
            double hX = (xB - xA)/(2*part);
            double hY = (yB - yA)/(2*part);
            double valueX = xA;
            double valueY = yA;
            for (int j=0; j<part; j++){
                for (int i=0; i<part; i++){
                    result += func.getFunc((valueX+hX),(valueY+hY))*square;
                    valueX += 2*hX;
                }
                valueX = xA;
                valueY +=2*hY;
            }
            return result;
    }
}
