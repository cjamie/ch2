package ch2;

/**
 *
 * @author huanj
 * CHAPTER 2: Operators and Statements
 * 
 * PURPOSE: This is a resource for returning Java users who wish to brush up on old topics
 * 
 * SUMMARY: 
 * 
 * (1)Java operators have precedence over one another
 *      
 * (2)Java operators require arguments to be compatible
 *    Java will attempt to compensate via promotion 
 * (3)data types could be converted to smaller or larger types via casting 
 * (4)two basic types of control structures: decision making and repetition
 *    4.1* decision making- if then, if then else, ternary, and switch
 *    4.2* repetition; for, for each(enhanced for loop), while, do while
 * (5)Flow Control
 *    5.1* Nested Loops
 *    5.2* Labels
 *    5.3* break statement
 *    5.4* continue statement
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
        Assignment operators =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=
*/
public class Chapter2 {
    static int dayOfWeek=2;
    static int loopCount1=0;
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
      //  System.out.println(example7("ex7String","ey7String"));
        example8();
        example9();
    }
    
    
    
    
    
    
    /*
    (1)
    pre-unary operator which takes prcedence over other existing operators
        (--y)=3
    multiplication takes precedence next
        (2*3)=6
    addition takes precedence next
        (5+6)=9
    assignment operator is last, and is evaluated from right to left 
    
    */
    public static void example1() {
        int y=4;
        double x = 3 + 2 * --y;
        System.out.println(x);
    }
    
    /*
    Numeric Promotion Rules
        1* If there are two values of different types, Java will attempt to promote one to the 'larger' value
        2* integral values are promoted to floating points
        3* data types smaller than int (char, short, byte) are promoted to int before
           arithmetic operations 
        4* After all promotion has occured, the operands have the same data type
    */

    //1* x is promoted to an int type before the + operation, and the resulting value is also long
    public static void example2() {
        int x=1;
        long y=33;
        System.out.println("example2 int*long becomes long");
    }
    //2* int y must be promoted to a double before using the multiplcation operator
    //3* short z must be promoted to an int before arithemetic operations
    public static void example3() {
        double x=1;
        int y=33;
        short z=22;

        System.out.println("example3 x*y is double");
        System.out.println("example3 z+y is int");
    }

    /*
    Casting Primitive
    Data type heirarchy: double->float->long->int->short->byte
    
    implicity casting: performed implicitly by the JVM, converts to 'larger' size
    explicit casting: performed by the programmer, converts to 'smaller' size
    
    CAUTION: possible lossy conversion if large to small
    */
    public static void example4(){
        int x = (int)1.0;
        short y = (short)1921222;
        double z = y;
        System.out.println("example4 x: explicit casting, double to int");
        System.out.println("example4 y: explciit casting, int to short");     
        System.out.println("example4 z: implicit casting: short to double");
    }
    /*
    Logical Operaters  AND(&) OR(|) XOR(^)
    Short-citcuit Operators && ||

    first potion of the OR expression is evaluated as true. JVM doesn't bother 
    the 2nd portion even though it is syntactically incorrect

    */
    public static void example5(){
        int y;
        boolean x = true || (y<4);
        System.out.println("Example x:" + x);
    }
    
    /*
    4.1* decision making  
    4.1.1 if then
        NOTE:parenthesis not required for single-line comments
    4.1.2 if then else 
    4.1.3 ternary (booleanExpression ? expression1 : expression2)
    */  
    public static void example6(){
        int hourOfDay=12;
        int dayOfWeek=20;
        //4.1.1
        if (hourOfDay<11){
            System.out.println("Good Morning");
        }
        //4.1.2
        if (hourOfDay<11){
        }else if(hourOfDay<15){
            System.out.println("Good Afternoon");
        }else{
            System.out.println("Good Evening");
        }
        //4.1.3
        int x=10;
        int y= (x>5)? (2*x):(3*x); 
        //boolean expression evaluates true, so executes the expression on left
        System.out.println("example6 y:" +y); //20
        //4.1.4

    }
    
    //4.1.4  switch statement
    /*      
        switch statements 
        SUPPORTS: int, byte, short, char, String, and enum 
        DOES NOT SUPPORT: boolean, float, double and long 

        case statement value MUST be a literal, enum constant, or final constant variable

        Approach: if you can't find the relevant case, select default case until break statement
    */
    public static int example7(String ex7, final String ey7){
        String middle="Adams";
        final String suffix = "JR";
        int id=0;
        
        switch(ex7){
            case "Test": //literal
                return 52;
            case middle: //DNC b/c NOT final
                id=30;
                break;
            case suffix: //final constant variable
                id=25;
                break;
            case ey7:   //it is final, but not constant because it is a method parameter
                id=8;
                break;
            case 5:     //DNC because not String type
                id=70;
                break;
            default: 
                id=99;
                break;
        }
        return id;
    }
    /*
    4.2 repetition
    4.2.1 while 
    4.2.2 do while
    4.2.3 for loop with single and multiple terms
    4.2.4 for each(enhanced for loop), 
    */
    public static void example8(){
        String[] names=new String[3];
        names[0]="lisa";
        names[1]="kevin";
        names[2]="anything";
        
        //4.2.1 while loop
        System.out.println("\nWhile Loop:");
        while(true){ //checks boolean expression; if it is true, continue executing 
            //body
            break;
        }
        
        //4.2.2 do while loop is guarenteed at least 1 execution
        System.out.println("\nDo while Loop:");
        do{
            System.out.print(loopCount1++);
            //body
        }while(loopCount1<10);
        
        //4.2.3 for loop, single term (fine-grain control)
        System.out.println("\nFor Loop:");
        
        for(int i=0;i<10;i++){ //initialization, boolean expression, update statement
            System.out.print(i);
        }
        
        //4.2.3 for loop with multiple terms
        int x = 0;
        System.out.println(" \nFor Loop with multiple terms:");
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++)
            System.out.print(y + " ");
        System.out.print(x);
        
        //4.2.4 for each (compile-time enhancement objects or array that implements java.lang.Iterable interface)
        System.out.println("\nFor each:");
        for (String values : names){ //keyword(datatype arbitrary_referenceID semicolon iterable_collection)
            System.out.print(values + " ");
        }        
    }
    /*
    5* Flow Control
    5.1* Nested Loops
    5.2* Optional labels
    5.3* break statement
    5.4* continue statement
    */
    public static void example9(){
        //5.1* Nested Loops (via enhanced for each loop)
        int[][] myArray = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};//3x4 array
        System.out.println("\nNested Loop:");
        for(int[] x:myArray){
            for(int y:x){
                System.out.print(y+"\t");
            }
            System.out.println();
        }
        
        //5.2* labels: optional pointer to the head of a statement
        //5.3* break statement transfer the flow of control out of the enclosing statement
        //CAUTION: may not label methods and not considered good practice
        System.out.println("\nLabels+Break statement:");
        OUTER_LOOP:for(int[] x1:myArray){
            INNER_LOOP:for(int y1:x1){
                System.out.print(y1+"\t");
                break INNER_LOOP;
            }
            System.out.println();
        }        
        
        //5.4* continue statement transfers the flow of control to the boolean expression 
        
        System.out.println("Continue statement:");
        OUTER_LOOP:for(int[] x1:myArray){
            INNER_LOOP:for(int y1:x1){
                System.out.print(y1+"\t");
                continue OUTER_LOOP;
                System.out.print(y1+"\t");//unreachable because of continue
                
            }
            System.out.println();
        }
    }
}
