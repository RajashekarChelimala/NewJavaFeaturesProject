# NewJavaFeaturesProject
**Functional Interface:**

-> It is also called as SAM(Single Abstract Method) interface

-> Interface can also declare the abstract methods from the java.lang.Object class, but still the interface can be called as a functional interface.

-> If you add another abstract method to the interface the compiler will throw error on your face directly.

-> We can extend an interface from another functional interface.

-> List of functional interfaces are given in java.util.functions

-> Filtering - Predicate functional interface

-> Action - Consumer functional interface


**Lambda Expression**

-> Functional programming. 

-> A function can be created without belonging to any class.


**Type Inference**

-> Inference is a Java Compilers ability to look each method invocation and corresponding declaration to determine the type argument(or arguments) that make the invocation applicable.

**Internal Iterators**


-> Controlled by JVM executed parallelly in the different cpu's.

-> Eg: forEach() (lambda) or (method reference)


**Stream**

A stream represents a sequence of objects from a source which supports aggregate operations.


Stream has certain characteristics:

1. Sequence of elements 
2. Source - takes arrays, collections, io sources as input source
3. Aggregate operaations - supports operations like map, filter, limit, reduce, find, match and so on..
4. Pipelining - most of the stream operation return a stream itself so that their results can be pipelined. These operations are called intermediate operations and their fucntion is to take input and process them and return output to the target. collect() method is a terminal operation which is normally present at the end of the pipelining operation to mark the end of the stream.
5. Automatic iteration - A stream operation do the iteration internally over the source elements provided in contrast to collections where explicit iteration is required.
   
