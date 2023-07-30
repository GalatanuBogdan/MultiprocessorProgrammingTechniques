# Exercise 4

A tribe of savages eats from a single large pot that has a capacity of N portions. When a tribe member eats, they will take a portion from the pot if there is at least one available. If the pot is empty, the tribe member will instruct the cook to refill the pot and wait until it is completely full again. The cook only refills the pot with a complete set of portions (N portions). In short, tribe members cannot take a portion from the pot if it is empty, and the cook can only refill the pot when it is empty.
Write a program to simulate the behaviour of the tribe members and the cook, where each of them is represented by a thread, and the pot is a shared resource, following the constraints mentioned above. Assume that each tribe member wants to eat only one meal, but their total number exceeds the pot's capacity, so refilling will be necessary. The use of atomic types in Java is not allowed in the implementation of the solution.


In the following lines, we will illustrate the result of 3 executions:

## Execution 1:
### Input: 16 savages, PotCapacity 5<br/>
Savage_9 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_6 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_11 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_10 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_15 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_13 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_12 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_14 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_7 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_0 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_4 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_1 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_8 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_2 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_3 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_5 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
The pot has been filled. CurrentCapacity = 5<br/>
Savage_9 took a portion. CurrentCapacity = 4<br/>
Savage_6 took a portion. CurrentCapacity = 3<br/>
Savage_11 took a portion. CurrentCapacity = 2<br/>
Savage_10 took a portion. CurrentCapacity = 1<br/>
Savage_15 took a portion. CurrentCapacity = 0<br/>
Savage_13 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_12 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_14 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_7 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_0 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_4 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_1 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_8 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_2 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_3 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_5 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
The pot has been filled. CurrentCapacity = 5<br/>
Savage_13 took a portion. CurrentCapacity = 4<br/>
Savage_12 took a portion. CurrentCapacity = 3<br/>
Savage_14 took a portion. CurrentCapacity = 2<br/>
Savage_7 took a portion. CurrentCapacity = 1<br/>
Savage_0 took a portion. CurrentCapacity = 0<br/>
Savage_4 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_1 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_8 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_2 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_3 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_5 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
The pot has been filled. CurrentCapacity = 5<br/>
Savage_4 took a portion. CurrentCapacity = 4<br/>
Savage_1 took a portion. CurrentCapacity = 3<br/>
Savage_8 took a portion. CurrentCapacity = 2<br/>
Savage_2 took a portion. CurrentCapacity = 1<br/>
Savage_3 took a portion. CurrentCapacity = 0<br/>
Savage_5 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
The pot has been filled. CurrentCapacity = 5<br/>
Savage_5 took a portion. CurrentCapacity = 4<br/>
The cook served the whole tribe of savages<br/>

## Execution 2:
### Input: 10 savages, PotCapacity 5
Savage_4 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_0 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_2 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_3 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_1 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_5 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_6 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_7 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_8 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_9 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
The pot has been filled. CurrentCapacity = 5<br/>
Savage_4 took a portion. CurrentCapacity = 4<br/>
Savage_0 took a portion. CurrentCapacity = 3<br/>
Savage_2 took a portion. CurrentCapacity = 2<br/>
Savage_3 took a portion. CurrentCapacity = 1<br/>
Savage_1 took a portion. CurrentCapacity = 0<br/>
Savage_5 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_6 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_7 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
S

avage_8 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_9 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
The pot has been filled. CurrentCapacity = 5<br/>
Savage_5 took a portion. CurrentCapacity = 4<br/>
Savage_6 took a portion. CurrentCapacity = 3<br/>
Savage_7 took a portion. CurrentCapacity = 2<br/>
Savage_8 took a portion. CurrentCapacity = 1<br/>
Savage_9 took a portion. CurrentCapacity = 0<br/>
The cook served the whole tribe of savages<br/>

## Execution 3:
### Input: 10 savages, PotCapacity 7
Savage_6 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_0 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_5 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_3 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_1 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_4 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_2 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_7 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_8 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_9 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
The pot has been filled. CurrentCapacity = 7<br/>
Savage_6 took a portion. CurrentCapacity = 6<br/>
Savage_0 took a portion. CurrentCapacity = 5<br/>
Savage_5 took a portion. CurrentCapacity = 4<br/>
Savage_3 took a portion. CurrentCapacity = 3<br/>
Savage_1 took a portion. CurrentCapacity = 2<br/>
Savage_4 took a portion. CurrentCapacity = 1<br/>
Savage_2 took a portion. CurrentCapacity = 0<br/>
Savage_7 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_8 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
Savage_9 could not take his portion because the pot is completely empty. CurrentCapacity = 0<br/>
The pot has been filled. CurrentCapacity = 7<br/>
Savage_7 took a portion. CurrentCapacity = 6<br/>
Savage_8 took a portion. CurrentCapacity = 5<br/>
Savage_9 took a portion. CurrentCapacity = 4<br/>
The cook served the whole tribe of savages.
