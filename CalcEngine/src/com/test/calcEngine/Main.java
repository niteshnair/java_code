package com.test.calcEngine;

public class Main {

    public static void main(String[] args)
    {
        /*double[] leftVals = {100.0d,25.0d,225.0d,11.0d};
        double[] rightVals = {50.0d,92.0d,17.0d,3.0d};
        char[] opCodes = {'a','s','d','m'};
        double[] results = new double[opCodes.length];*/

        /*double val1 = 100.0d;
        double val2 = 50.0d;
        double result;
        char opCode = 'd';

        if(opCode == 'a')
            result = val1 + val2;
        else if(opCode == 's')
                result = val1 + val2;
        else if(opCode == 'd')
            result = val2 != 0.0d ? val1/val2 : 0.0d;
            if(val2 != 0.0d)
                result = val1/val2;
            else
                result = 0.0d;
        else if (opCode == 'm')
            result = val1 * val2;
        else {
            System.out.println("Error Invalid Op Code");
            result = 0.0d;
        }*/
        /*for(int i=0;i<opCodes.length;i++)
        {

        }
        for(double theResults:results)
        {
            System.out.println(theResults);
        }*/
        //System.out.println(result);

        //int kVal = 5;
        //int factorial = 1;

        //while(kVal > 1)
        //   factorial *= kVal--;

        //System.out.println("Factorial of the number " + kVal + " is:" + factorial);

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.0d,50.0d,'d');
        equations[1] = new MathEquation(25.0d,92.0d,'a');
        equations[2] = new MathEquation(225.0d,17.0d,'s');
        equations[3] = new MathEquation(11.0d,3.0d,'m');

        for(MathEquation equation : equations)
        {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overload");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationoverload = new MathEquation('d');

        equationoverload.execute(leftDouble,rightDouble);
        System.out.print("result = ");
        System.out.println(equationoverload.getResult());

        equationoverload.execute(leftInt,rightInt);
        System.out.print("result = ");
        System.out.println(equationoverload.getResult());

        equationoverload.execute((double) leftInt,(double) rightInt);
        System.out.print("result = ");
        System.out.println(equationoverload.getResult());


    }
//    public static MathEquation create(double leftVal,double rightVal,char opCode)
//    {
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }
}
