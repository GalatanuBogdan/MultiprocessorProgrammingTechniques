# Exercise 1
The following execution sequence (history) is given below. Is it linearizable? And sequentially consistent? The initial value is considered to be r = 0.
Argue the answer by providing explanations (possibly the execution history sequence) and/or a diagram with the linearization points, where applicable.

In the following image, we will establish the points of linearization and their order:

![Isorie](https://github.com/GalatanuBogdan/TehniciDeProgramareMultiprocesor/blob/main/Ex1/IstoriaEvenimentelor.png)

With the help of the information above, we will demonstrate how the history H received in the requirement is both linearizable and sequentially consistent. <br>

We will create a history G to demonstrate the linearizability property, from which we observe the successful transition of the steps "Appending zero or more responses to pending invocations (that took effect)" and "discarding other pending invocations" without any modification to the history H. <br>

Thus, histories H and G are equivalent, resulting in the fact that the initial history is linearizable.

Being linearizable, history H is also sequentially consistent, meaning there is an order of events where their effects do not interfere with each other. <br>
