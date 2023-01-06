# Test Cases

This is a breakdown of how I used JUnit 5 to set up the test system.  The idea is for each problem to be tested with a veriety of possible inputs including special cases that would cause Exceptions if not properly handle.

If a test case is not passed, the following will be sent to the console:
- The problem number
- Which test case was failed
- The input tested
- The expected output
- The students output

Example:
![]()

Othewise they recieve this:
![](https://github.com/rshunter05/Unit03_While_Loops_Key/blob/master/Screen%20Shot%202023-01-06%20at%209.54.35%20AM.png)


# InOutMimic.java

This class overrides the PrintStream and InputStream so I can provide a veriety of mock user inputs and check their print statemtnes for accuracy.
