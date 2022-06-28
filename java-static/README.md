# Why static in Java? What does this keyword mean?

- The main purpose of using the `static` keyword in Java is to save memory.  
   When we create a variable in a class that will be accessed by other classes, we must first create an instance of the class and then assign a new value to each variable instance - even if the value of the new variables are supposed to be the same across all new classes/objects.

### So when we create a static variables, its value remains constant across all other classes.
