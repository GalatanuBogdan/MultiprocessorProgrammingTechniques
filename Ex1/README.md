# Exercitiul 1

In urmatoarea imagine vom stabili punctele de linearizare cat si ordinea acestora:

![Isorie](https://github.com/GalatanuBogdan/TehniciDeProgramareMultiprocesor/blob/main/Ex1/IstoriaEvenimentelor.png)

Cu ajutorul informatiilor de mai sus vom demostra cum istoria H primita in cerinta este atat linearizabila
cat si consistent secventiala. <br>

Vom crea o istorie G pentru a demonstra proprietatea de linearizare, din care observam trecerea cu succes de etapele "Appending zero or more responses to pending invocations(that took effect)" cat si "discarding other pending invocations" fara a exista o modificare asupra istoriei H. <br>

Astfel, istoriile H si G sunt echivalente, rezultand faptul ca istoria initiala 
este linearizabila. <br> 
Fiind linearizabila, istoria H este si consistent secventiala, existand astfel o ordine a 
evenimentelor in care efectul acestora sa nu se afecteze reciproc. <br>
