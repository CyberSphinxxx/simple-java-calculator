# simple-java-calculator
---------------------------------------------------
Calculator Program Description:

This Java program functions as a simple calculator, allowing users to perform basic arithmetic operations on two numbers.

---------------------------------------------------
User Input Prompt:

The Scanner class is employed to gather user input for two numerical operands and the desired arithmetic operator.

The prompts are designed to guide the user effectively through the input process.

---------------------------------------------------
Operand Input:

The readDouble method is called twice to read the two numerical operands.

Each method call prompts the user to input a numerical value, displaying a message indicating which operand to input.

The method returns the double value entered by the user.

---------------------------------------------------
Operator Input:

The readOperator method prompts the user to input the desired arithmetic operator (+, -, *, /).

The method ensures that only the first character of the input is considered as the operator, improving user interaction and input validation.

---------------------------------------------------
Calculation:

The calculate method performs the arithmetic operation based on the provided operator and operands.

A switch-case statement is employed to determine the operation to be performed.

Depending on the operator, the method performs addition, subtraction, multiplication, or division.

If the user provides an invalid operator, an error message is displayed, and the method returns Double.NaN (Not a Number) to indicate an invalid result.

---------------------------------------------------
Result Display:

After obtaining both operands and the operator, the program calculates the result using the calculate method.

The result is then displayed to the user in the format "operand1 operator operand2 = result".

---------------------------------------------------
Usage:

Execute the program in a Java environment.

Input the first number, followed by the second number, and then the desired arithmetic operator when prompted.

The program will calculate and display the result of the arithmetic operation.

If an invalid operator is provided, the program will inform the user and terminate the operation.



