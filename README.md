# Java_Dsa

# Strings

Interning & new() in java
` String str = "Hello"; String gtr = "Hello";`
in this case no new string formation happen both str and gtr points to same memory space contains "Hello" to save memory called interning.

to avoid interning use `new` keyword to initialize strings
` String str = new String("Hello"); String gtr = new String("Hello");`

strings in java are immutable -> can't change characters of strings, to acheive interning strings are immutable for security reasons. Memory loss issue due to immutability of strings.

`(str1==str2)`
returns true if addresses are same. "==" checks the address of the object.

StringBuilder - stringbuilder works in character array internally  
`
//constructors of StringBuilder class

        StringBuilder(); // default constructor
        StringBuilder(String str); // constructor with string
        StringBuilder(int capacity); // constructor with capacity

`
