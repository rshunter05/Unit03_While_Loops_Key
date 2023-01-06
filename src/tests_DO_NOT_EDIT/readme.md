# Test Cases

This is a breakdown of how I used JUnit 5 to set up the test system.  The idea is for each problem to be tested with a veriety of possible inputs including special cases that would cause Exceptions if not properly handled.

Note: The classes containing tests **are not commented**.  This way prying eyes have to decipher what's going on.  GitHub Classroom has yet to provide a way for me to keep test cases hidden or completely locked.  So there are a few ways to hardcode answers if I'm not careful.

If a test case is not passed, the following will be sent to the console:
- The problem number
- Which test case was failed
- The input tested
- The expected output
- The students output

Example:   
```
Error Problem #2:    
    Failed test 1 of 4  
    Input tested: 4  
    12   
    Expected output: The sum of all even integers between 4 and 12 is 24.   
    Your output:    
    Enter a positive integer: Enter another positive integer: The sum of all even integers between 4 and 12 is 36.
```

Othewise they recieve this:   
```
Test Problem #2: Passed all 4 tests
```


# InOutMimic.java

This class overrides the PrintStream and InputStream so I can provide a veriety of mock user inputs and check their print statemtnes for accuracy.
It's a separate class so it can be easily copied to other projects.
