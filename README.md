# Sprint1_T4_Testing

Level 1: JUnit
- Exercise 1
Create a Java class that inserts the names of the months of the year into an ordered list.
Verify with jUnit that the list has 12 positions, that it is not null and that position 8 contains the name 'August'.
- Exercise 2
Create a class called CalculoDni that calculates the letter of the DNI by receiving the number as a parameter.
Create a jUnit class that verifies its correct operation, parameterizing it so that the test receives a wide spectrum of data and validates if the calculation is correct for 10 predefined ID numbers.
- Exercise 3
Create a class with a method that throws an ArrayIndexOutOfBoundsException.
Verify its correct operation with a jUnit test.

Level 2: Hamcrest
- Exercise 1
Defines a custom Matcher for Hamcrest that provides the length Matcher for a String.

We want to use the ->FeatureMatcher class.

With FeatureMatcher we can adjust an existing Matcher, decide which field of the Test Object to match, and provide a nice error message. The FeatureMatcher constructor has the following arguments in this order:

The matcher we want to wrap up.
A description of the feature we're testing.
A description of the possible mismatch.
The only method we need to override is featureValueOf(currentT), which returns the value that will be passed to the match() / matchesSafely() method. Use your custom comparator in a test to check if the string "Mordor" has a length of 8.

Adjust the test if necessary.

Level 3: AssertJ

Create Java classes and/or tests that test them to demonstrate the following:

- Exercise 1
An assertion that proves that the value of two integer objects is equal, and another that shows that they are not.

- Exercise 2
An assertion that proves that the reference to one object is the same as another, and another that indicates that it is different.

- Exercise 3
An assertion indicating that two arrays of integers are identical.

- Exercise 4
Create an arrayList containing several types of objects (create them too). Write an assertion to verify the order of the objects in the ArrayList as they have been inserted.

Now check that the above list contains the objects in any order.
Verify that, in the above list, one of the objects has been added only once. Leave one of the elements unadded, and check that the list does not contain the latter.
- Exercise 5
It creates a map and verifies that it contains one of the keys it adds.

- Exercise 6
Throws an ArrayIndexOutOfBoundsException in any class. Create an assertion that validates that the exception is thrown when appropriate.

- Exercise 7
Create an empty Optional object. Write the correct assertion to verify that it is indeed empty. 