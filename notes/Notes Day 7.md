# Variables

##### Day 7 - 24 Sept, 2020

## Static Variable

Variables declared inside class but outside of the body of the method using static keyword are known as static variables. It has one copy per class.  
Static and Instance variables, if not initialized, will be set to their default values.

```java
class Box{
    int w; //Instance Var
    static int h; // Static Var
    public static void main(String[] args){
        int d; // Local Var
        System.out.println(d);  // ERROR: not initialized
        System.out.println(h);
        System.out.println(new Box().w);
    }
}
```

---

`new` is used to allocate memory dynamically.

| Variable | Location |
| :------: | :------: |
|  Local   |  Stack   |
| Instance |   Heap   |
| Dynamic  |   Heap   |

---

**Static variables get updated, and the update is visible in all objects of the class**

_Static variables can be accessed directly or by object name. But accessing using object name is discouraged._

| Variable |   Access Via    |
| :------: | :-------------: |
|  Local   |    Directly     |
| Instance |     Object      |
|  Static  | Object/Directly |

```java

public class VarCheck {
    int a, b;
    static int c;

    VarCheck(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        VarCheck v1 = new VarCheck(1, 2, 3);
        VarCheck v2 = new VarCheck(4, 5, 6);
        System.out.println(v1.a + " " + v1.b + " " + v1.c);
        // even c instead of v1.c will work as c is static
        System.out.println(v2.a + " " + v2.b + " " + v2.c);
        // even c instead of v2.c will work as c is static
    }
}

```

Output:

```bash
java VarCheck
1 2 6
4 5 6
```

---

## Static and Instance Methods

```java
public class DirCheck {
    int a, b; // Instance variables
    static int c; // Static variable

    void show() { // Instance method
        System.out.println(a + " " + b + " " + c);
        // Instance variable accessed diectly within instance method
        showS(); // instance methods can access static methods and static variables
    }

    static void showS() { // Static/Class Method
        // System.out.println(a + " " + b); // Illegal!
        System.out.println("showS called");
        // Cannot access instance variable directly from static method
    }

    public static void main(String[] args) {
        DirCheck d = new DirCheck();
        System.out.println(d.a + " " + d.b); // Accessing object variables
        System.out.println(d.c + "=" + c); // Both will have same value as c is static var.
        showS(); // calling Static/Class method directly
        d.show(); // calling Instance method via Object Ref.
    }
}
```

**Static method** and **static variable** can be _called directly_.  
**Instance methods** can access **instance variables** and **instance methods** _directly_.  
**Static/Class methods** _cannot_ access **instance variables** and **instance methods** _directly_, that is, they _must be accessed_ via **object reference**.

#### Why static methods can't acess instance variables and instance methods directly?

#### Why main method is static?

---

## Lab Work:

1. Write a program to demonstrate call by value in java [Code](../codes/CallByValue.java)
2. Write a program to demonstrate call by reference in java [Code](../codes/CallByReference.java)
3. Write a program to create a clone of an object using copy constructor [Code](../codes/CopyConstructor.java)
4. Create a Student class of n students having name and roll number and subjects. [Code](../codes/ClassRoom.java)
