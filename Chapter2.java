package ch2;

/**
 *
 * @author huanj
 * CHAPTER 1: Operators and Statements
 * 
 * PURPOSE: This is a resource for returning Java users who wish to brush up on old topics
 * 
 * SUMMARY: 
 * 
 * (1)Java operators have precedence over one another
 *      
 * (2)Java operators require arguments to be similar and will try to compensate in some cases
 * (3)two basic types of control structures: decision making and repetition
 *    decision making- if then, if then else, and switch
 *    repetition; for, for each(enhanced for loop), while, do while
 * (4)be able to write and understand nested loops 
 * 
 */


/*
    (1) 
    Operators available in Java are unary, binary, or ternary
    Operator precedence: 
        post-unary operators (expression++, expression--)
        pre-unary operators (++expression, --expression)
        other unary operators (+,-,!)
        Multiplication/Division/Modulus *, /, %
        Addition/Subtraction +, -
        Shift operators <<, >>, >>>
        Relational operators <, >, <=, >=, instanceof
        Equal to/not equal to ==, !=
        Logical operators &, ^, |
        Short-circuit logical operators &&, ||
Ternary operators boolean expression ? expression1 : expression2
*/
public class Chapter2 {

    public static void main(String[] args) {
        example1();
    }
    
    
    
    public static void example1() {
        int y=4;
        double x = 3 + 2 * --y;
        System.out.println(x);
    }

}
