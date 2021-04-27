# Output:

Here if it is observed, since main method is the start of the program - we expect main method to run first and print "This statement belongs to main method. Static block got executed already.!!!".
But here, static block got executed first and printed "This statement belongs to Static block. It will be called before main method.!!!" and main method was executed post static block execution.

Same with variable 'a', it was declared as an Instance variable and expected to print 'a' when main method gest executed. Before main, static block got executed and variable 'a' is assigned with value '5' and then it is printed from main method.

<img width="396" alt="staticForBlock" src="staticForBlock.PNG">
