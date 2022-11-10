# Exercitiul 3
## a)
Sa presupunem ca avem 2 threaduri A, B care se afla simultan in apelul functiei ShadyLock.lock(): 
	Daca threadul A a ajuns deja la linia 11 in timp ce threadul B a a ajuns la linia 9, se poate deduce ca Threadul B modifica turn-ul threadului A, furandu-i prioritatea thread-ului A, facandu-l pe acesta sa mai astepte cel putin inca o iteratie prin doWhile-uri. Acest proces se poate intampla la nesfarsit, cat timp un alt thread X doreste sa obtina lock-ul. 
Astfel, proprietatea de starvation-free nu este satisfacuta deoarece Threadul B ii fura prioritatea threadului A, facandu-l pe acesta sa astepte mai mult decat ar trebui(inca cel putin o iteratie)

## b)
Presupunem ca avem 3 threaduri A,B,C.

Consideram ca Threadul C se afla deja in sectiunea critica, setand y=ThreadId(C).

Threadurile A, B doresc sa obtina lock-ul si ajung sa astepte ambele la linia 8 din cauza threadului C.

In momentul in care Threadul C va executa VeryShadyLock.unlock(), se poate observa faptul ca y-ul devine 0, iar threadurile A si B vor putea iesi in acelasi timp din asteptare. Dintre aceste 2 threaduri A si B, doar unul dintre ele va avea x == me(ultimul intrat in lock), ceea ce implica faptul ca, un thread va executa linia 11, iar celalalt thread nu va executa linia 11, deoarece nu va intra in if. Rezulta astfel ca algoritmul pentru lock nu asigura excudere mutuala deoarece ambele threaduri A, B ajung in sectiunea critica in acelasi timp.

## c)
Tratam cazul in care toate thread-urile care apeleaza functia choose() ajung pe linia 10 in acelasi timp, de unde putem trage urmatoarele concluzii:

1) ultimul thread care ajunge pe linia 10, va avea last == me, ceea ce implica faptul ca, un singur thread va obtine valoarea "red"

2) Daca doar ultimul thread care ajunge pe linia 10 primeste valoarea "red", implica faptul ca celelalte n-1 thread-uri vor intra pe ultimul else si vor primi valoarea "black"


Din 1) si 2) rezulta ca maxim un thread poate obtine valoarea "red" si maxim n-1 thread-uri pot obtine valoarea "black"
