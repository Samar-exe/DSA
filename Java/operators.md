# Operators

- Special symbols that are used to perform operations on multiple operands.
- Opearators have different precedence, the higher the precedence of an operator is java will try to perform that operation first

### Assignment, Arithmetic and Unary Operators.

'=': Assigns the value on its right to the opearand on its left 
```java 
int cadence = 0;
int speed = 0;
int gear = 1;
```
Arithmetic operators are the same ones that we use in mathematics: 
- \+
- \-
- \*
- \/
- %

Unary opeartors are those that only require one operand to perform an opertation.

### Equality, Relational, and Conditional Operators 

- ==      equal to
- !=      not equal to
- \>       greater than
 - \>=      greater than or equal to
- \<       less than
- <=      less than or equal to

### Conditional operators

The && and || operators perform *conditional-AND* and *conditional-OR* operations on two boolean expressions.  
Example: 
```java 
class ConditionalDemo {
    public static void main(String[] args){
        int value1 = 1;
        int value2  = 2;
        if((value1 == 1) && (value2 ==2))
            System.out.println("value1 is 1 AND value2 is 2 ");
        if((value1 == 1) || (value2 ==2))
            System.out.println("value1 is 1 OR value2 is 2 ");
    }
}
```

Another conditional operator is ?:, which can be thought of as shorthand for an if-then-else statement (discussed in the Control Flow Statements section of this lesson). 
This operator is also known as the ternary operator because it uses three operands.
In the following example, this operator should be read as: "If someCondition is true, assign the value of value1 to result. 
Otherwise, assign the value of value2 to result."


