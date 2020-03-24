# Fossil

# Structure
- Package GlobalData : include classes for interface car and 2 child class BMW and Toyota
- Package runTest : include main methor to run test for each question : 1, 2, 4
- Package globalData : include a global vaiable for run test sequence

# How to run
- Question 1 : run by main method at Question1.java

- Question 2 : run by main method at Question2.java
    + Design run like a interface and 2 child class BMW and Toyota will inheritance and overwrite methods of class car
    + In runtest, put 2 object Toyota and BMW to 2 Thread and run them.
    
- Question 3 : 
    + Order of outputs in 2 and 1 different because Question1, we init 2 car in one Thread and when run , 2 object will run one by one sequence, car1 run done then car2 run, so we see 100 100 100 100 100 ...... 200 200 200 200 200. With Question2, we put 2 car to 2 different Thread and when 2 Thread start with start at same time and method run() at same time also.
    
- Question 4 : 
    + I will create a method runSequence for each car. In this method, there is a flag to wait for other car print maxSpeed and switch the flag to notify for this car print maxSpeed. The program keeps running until the two car take print each maxSpeed at 10 times.

- Question in Instructions : Concurrency: how to handle different tasks at the same time, for instance, start 10 tests at the same time and collect results
    + Please refer question3, we will create 10 Thread, each thread for earch test and start all Thread at same time.

