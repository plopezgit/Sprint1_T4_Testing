# Sprint1_T4_Testing

Level 1: 

**JUnit**

> ##### General solution notes:
> - It is structured a package distribution that contains the class, and another different pack that stores the test.
> - The package that contains the class to be tested is named as {PackageWIth ClassToBeTestedName}.Test.
> - The Class with the test use the {ClassToBeTestedName}_Test as name.
> - The Class resposible of testing uses @TestMethodOrder(OrderAnnotation.class) thats allows set an specific order test execution
> - The Class attributes of the test icludes: 
>> - an Object of the Class to be tested; 
>> - and variable that will be initializated with the expected values, based on test request and premises
> - the very first method public void setTestUp () uses @BeforeEach annotation that intances the object to be tested and init the expected variables/atributes values that will be used.
> - Every test method within the Class is annotated with the folowing: 
>> - @DisplayName("{GivenWhenThenTestDescription}") annotation. That support transparency and documentation.
>> - @Test annotation that sign the method as Test.
>> - @Order{num} annotation that set the numeric order of the test execution plan.
> - all the test method were void and uses the static methods :
>> - assertFalse(boolean)
>> - assertEquals({expectedvalue}, {currentValue})
> - the currentValued as reference to compare is obtained as part of the body of each test method, example:
>> - int monthListTestSize = monthListTest.addMonths().size();
> - @ParameterizedTest and @ValueSource(ints = {... , ...}) annotates public void checkGetDNILetter(int DNINumber) method to inject a set of values to the method parameter
> - @RepeatedTest(num) annotates public void printRandomObjectException () method to execute the test repeatedly an specific number of times.
> - uses assertThrows

- Exercise 1

Create a Java class that inserts the names of the months of the year into an ordered list.
Verify with jUnit that the list has 12 positions, that it is not null and that position 8 contains the name 'August'.

> - The Class attributes of the test icludes: 
>> - an Object of the Class to be tested; 
>> - and variable that will be initializated with the expected values, based on test request and premises
> - the very first method public void setTestUp () uses @BeforeEach annotation that intances the object to be tested and init the expected variables/atributes values that will be used.
> - Every test method within the Class is annotated with the folowing: 
>> - @DisplayName("{GivenWhenThenTestDescription}") annotation. That support transparency and documentation.
>> - @Test annotation that sign the method as Test.
>> - @Order{num} annotation that set the numeric order of the test execution plan.
> - all the test method were void and uses the static methods :
>> - assertFalse(boolean)
>> - assertEquals({expectedvalue}, {currentValue})
> - the currentValued as reference to compare is obtained as part of the body of each test method, example:
>> - int monthListTestSize = monthListTest.addMonths().size();

- Exercise 2

Create a class called CalculoDni that calculates the letter of the DNI by receiving the number as a parameter.
Create a jUnit class that verifies its correct operation, parameterizing it so that the test receives a wide spectrum of data and validates if the calculation is correct for 10 predefined ID numbers.

> - @ParameterizedTest and @ValueSource(ints = {... , ...}) annotates public void checkGetDNILetter(int DNINumber) method to inject a set of values to the method parameter

- Exercise 3

Create a class with a method that throws an ArrayIndexOutOfBoundsException.
Verify its correct operation with a jUnit test.

> - @RepeatedTest(num) annotates public void printRandomObjectException () method to execute the test repeatedly an specific number of times.
> - uses assertThrows with a lambda expression as parameter:
>> - assertThrows(ArrayIndexOutOfBoundsException.class, () -> outOfBoundTest.printRandomObject());


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

> - uses assertThat(num1).isEqualTo(num2); and assertThat(num1).isNotEqualTo(num2);

- Exercise 2

An assertion that proves that the reference to one object is the same as another, and another that indicates that it is different.

> - uses assertThat(pet).isEqualTo(pet2); and assertThat(pet).isNotEqualTo(pet2);

- Exercise 3

An assertion indicating that two arrays of integers are identical.

> - uses assertThat(array1).isEqualTo(array2);	

- Exercise 4

Create an arrayList containing several types of objects (create them too). Write an assertion to verify the order of the objects in the ArrayList as they have been inserted.

Now check that the above list contains the objects in any order.
Verify that, in the above list, one of the objects has been added only once. Leave one of the elements unadded, and check that the list does not contain the latter.

> - uses assertThat(objList).containsSequence(int1, string1).contains(int1).contains(string1).containsOnlyOnce(int1);
> - uses assertThat(objList).containsOnly(int1);

- Exercise 5

It creates a map and verifies that it contains one of the keys it adds.

> - uses assertThat(flagMap).containsKey(1);

- Exercise 6

Throws an ArrayIndexOutOfBoundsException in any class. Create an assertion that validates that the exception is thrown when appropriate.

> - uses assertThat(outOfBoundTest).returns("obj1", from(OutOfBound::returnRandomObject));

- Exercise 7

Create an empty Optional object. Write the correct assertion to verify that it is indeed empty. 

> - uses assertThat(opt1).isEmpty();