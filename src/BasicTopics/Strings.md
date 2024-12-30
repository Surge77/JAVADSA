In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string. 

char[] ch={'j','a','v','a','t','p','o','i','n','t'};
String s=new String(ch); 

is same as:

String s="javatpoint";  

Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.
------------------------------------------------------------------------------------------------------------------------------------------------------

What is String in Java?

Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.

How to create a string object?
There are two ways to create String object:

- By string literal:

For ex: String str1 = "Hello, World!";

- By new keyword:

For ex: String str2 = new String("Hello, World!");
------------------------------------------------------------------------------------------------------------------------------------------------------

- String Immutability:

Strings in Java are immutable, meaning once a String object is created, its value cannot be changed. Any operation that seems to modify a string will actually create a new string object
------------------------------------------------------------------------------------------------------------------------------------------------------

- StringBuilder and StringBuffer:

For situations where you need to modify strings frequently, using StringBuilder or StringBuffer is more efficient than using String because these classes are mutable.

StringBuilder: More efficient, not thread-safe.
StringBuffer: Thread-safe (synchronized), but slightly less efficient due to synchronization overhead.
