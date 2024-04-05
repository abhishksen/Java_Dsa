# Java_Dsa

![image](https://github.com/abhishksen/Java_Dsa/assets/100835323/66067704-afbe-4ec8-9e4a-6c5d4cde2e7f)

Complete java language and data structures & algorithms preparation playlist.

# Arrays

Array in Java is a list of similar type data in a contiguous manner. Array can be one dimensional or multidimensional.

`dataType[] varName = new dataType[size]; `

# Strings

Interning & new() in java

` String str = "Hello";`

`String gtr = "Hello";`

in this case no new string formation happen both str and gtr points to same memory space contains "Hello" to save memory called interning.

to avoid interning use `new` keyword to initialize strings

`String str = new String("Hello");`

`String gtr = new String("Hello");`

strings in java are immutable -> can't change characters of strings, to acheive interning strings are immutable for security reasons. Memory loss issue due to immutability of strings.

`(str1==str2)`

returns true if addresses are same. "==" checks the address of the object.

StringBuilder - stringbuilder works in character array internally

`//constructors of StringBuilder`

`class StringBuilder(); // default constructor`

`StringBuilder(String str); // constructor with string`

`StringBuilder(int capacity); // constructor with capacity `

# Linkedlist

Linkedlist is a non-linear, ordered data structure with random access of nodes in constant time.

# Stack

Stack is a **LIFO - Last In First Out** data structure.

# Queue

Queue is a **FIFO - First In First Out** data structure.

# Tree

Tree is a non-linear data structure.
