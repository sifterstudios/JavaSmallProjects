Oppgave 4 - Threads pools (Ekstra)
Siden det er en viss overhead ved å opprette threads ønsker vi noen gang å benytte oss av en forhåndsbestemt mengde tilgjengelige tråder. F.eks. avhengig av antall prosessorer/kjerner på maskinen. Vi kan bruke klassen Executors for å lage en slik "pool" av tråder for oss. Da trenger vi ikke å opprette nye tråder, kun instanser av en klasse som implementerer Runnable.

Lag en ny klasse som implementerer Runnable (kall klassen din Counter). I run metoden kan du lage en teller og løkke som skriver ut 0 til 10. Skriv også ut navnet på tråpen. Dette kan hentes med Thread.currentThread().getName(). Legg også til en liten pause med Thread.sleep(10). Dette gjør det lettere å se hva som foregår når vi skriver ut til konsollet.

Lag en Main-klasse med en main-metode. I main-metoden skal du opprette et fast antall tråder som skal "jobbe" med Counter-jobben.

Du kan opprette en "pool" av tråder ved å kalle Executors.newFixedThreadPool(5). Denne returnerer en instans av "ExecutorService".

Lag en evig løkke. I løkken oppretter du en ny instans av Counter-klassen din som du sender som parameter til metoden "submit" på instansen din av ExecutorService.

Kjør programmet ditt, hva blir navnet på trådene, og hvor mange unike trådnavn er det?

I hvilke situasjoner tenker du at parallelisering er nyttig? Diskuter fordeler og ulemper ved multithreading.