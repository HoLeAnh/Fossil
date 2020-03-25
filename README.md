# Fossil

# Structure
- Package GlobalData : include classes for interface car and 2 child class BMW and Toyota
- Package runTest : include main methor to run test for each question : 1, 2, 4
- Package globalData : include a global vaiable for run test sequence

# How to run
- Question 1 : run by main method at Question1.java

- Question 2 : run by main method at Question2.java
    + Class car implement Runnable and overwrite method run() of thread
    + In runtest, put 2 object Toyota and BMW to 2 Thread and run them.
    
- Question 3 : 
    + Order of outputs in 2 and 1 different because Question1, we init 2 car in one Thread and when run, 2 object will run one by one sequence, toyota run done then bmw run, so we see 100 100 100 100 100 ...... 200 200 200 200 200. With Question2, we put 2 car to 2 different Thread and when 2 Thread start at same time and method run() of each car also run at same time.
    
- Question 4 : run by main method at Question4.java
    + I will create a method runSequence for each child class of car. In this method, there is a flag to wait for other car print maxSpeed and switch the flag to notify for this car print maxSpeed. The program keeps running until the two car take print each maxSpeed at 10 times.

- Question in Instructions : Concurrency: how to handle different tasks at the same time, for instance, start 10 tests at the same time and collect results
    + Please refer question3, we will create 10 Thread, each thread for earch test and start all Thread at same time.

