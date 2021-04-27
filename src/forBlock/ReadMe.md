# Output:

Here if it is observed, since main method is the start of the program - **we expect main method to run first and print "This statement belongs to main method. Static block got executed already.!!!".**
But here, **static block got executed first and printed "This statement belongs to Static block. It will be called before main method.!!!"** and main method got executed post static block execution.

Same with variable _a_, it was declared as a static variable and expected to print _a_ when main method gest executed. Before main, static block got executed and variable _a_ is assigned with value _5_ and then it is printed from main method.

<img alt="staticForBlock" src="staticForBlock.PNG">
