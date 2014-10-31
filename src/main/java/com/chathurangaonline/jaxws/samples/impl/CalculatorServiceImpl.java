package com.chathurangaonline.jaxws.samples.impl;

import com.chathurangaonline.jaxws.samples.CalculatorService;
import javax.jws.WebService;


@WebService
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
