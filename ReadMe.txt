Proiect Banca

BANCA
Stocheaza intern pentru fiecare client urmatoarele informatii: CNP, Sold Cont EURO, Sold Cont RON

Ofera clientilor o interfata prin care acestia pot face urmatoarele operatii:
- Creare conturi: la inregistrare unui client vor fi create ambele conturi(RON, EURO).
- Lichidare conturi: un client poate sa isi lichideze ambele conturi dacaacestea au soldul 0. Toate informatiile despre client vor fi sterse lalichidare.
- Depozit/retragere: clientul poate face depozite in RON sau EURO. Soldulunui cont nu poate fi mai mic de 1000 RON/EURO.
- Interogarea conturilor: informatiile despre ambele conturi va fi transmisa clientului la cererea acestuia.

Ofera fiscului o interfata prin care acesta poate face urmatoarele operatii:
- Inceperea/incetarea procedurii de monitorizare a unui client
- Notificarea fiscului atunci cand soldul oricarui cont al unui client monitorizat s-a schimbat. Informatiile despre un client vor fi transmise de la banca la fisc intotdeauna pentru ambele conturi odata (RON+EURO)

CLIENTUL (persoana fizica)
Isi va crea conturile la banca.
Va depune/retrage bani din oricare cont.
Va lichida conturile.

FISCUL
Are capacitate de a monitoriza mai mult de un client.
Va cache-ui informatiile primite de la banca pentru fiecare client pe care il monitorizeaza.
In momentul in care este notificat ca statusul unui client al bancii s-a modificat (prin primirea unei notificari pentru ambele conturi) va afisa un mesaj despre ce cont a avut soldul modificat.


Aceasta aplicatie am realizat-o folosind IDE-ul : Apache NetBeans.
Am folosit Maven Dependencies pentru a realiza conexiunea cu bazele de date(phpMyAdmin) cat si cu GMail.
Functionalitatea de trimitere a mailului o voi prezenta live deoarece programul are nevoie de datele mele de logare pentru GMail.(acestea le voi inlocui in cod cu "xxxxx").
In acest pachet se pot gasi codul sursa cat si schema de prezentare a aplicatiei "Schema_aplicatie.png/drawio".