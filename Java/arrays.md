# Arrays

An array is a container object that holds a fixed number of values of a single type. 
The length of an array is established when the array is created. After creation the length is fixed.

Each item of an array is called an element and each element is accessed by its numerical *index*. This numbering begins from 0. 

Example: 
```java 
class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "+ anArray[0]);
        System.out.println("Element at index 1: "+ anArray[1]);
        System.out.println("Element at index 2: "+ anArray[2]);
        System.out.println("Element at index 3: "+ anArray[3]);
        System.out.println("Element at index 4: "+ anArray[4]);
        System.out.println("Element at index 5: "+ anArray[5]);
        System.out.println("Element at index 6: "+ anArray[6]);
        System.out.println("Element at index 7: "+ anArray[7]);
        System.out.println("Element at index 8: "+ anArray[8]);
        System.out.println("Element at index 9: "+ anArray[9]);
    }
} 
```
## Creating, initializing, and Accessing an Array

- Using the `new` keyword:

 ```java 
 anArray = new int[10]
 ```

```java 
anArray[0] = 100; // initialzed the array with a value of 100 at its 0th position.
```

```java 
System.out.println(anArray[0]) // Accessing the array element using its index.
```

- Shortcut syntax to create an initialze the array: 
```java 
int[] anArray = {
    100, 200, 300
    400, 500, 600, 
    700, 800, 900, 
};
```
In this case the length of the array is determined by the number of values provided.

## Multidimensional Arrays

We can also declare an array within an array, this is called multidimensional array.

Example: 
```java 
class MultiArrayDemo {
    public static void main(String[] args){
        String[][] names = {
            {"Mr." , "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        
        System.out.println(names[0][0] + names[1][0]);
    }
}
```

