# ASE-SimpsonsQuiz
Ein Repository für meine Teilnahme am Kurs "Advanced Software Engineering" der DHBW Karlsruhe.
## Beschreibung
Die Applikation Simpsons-Quiz ist ein Terminal-basierendes Minispiel. Durch gezielte
Fragen, welche User:innen mittels Tastatureingaben beantworten, soll bestimmt werden,
durch welchen Charakter des Simpsons Universum er oder sie am ehesten repräsentiert
wird. Zusätzlich werden Informationen über den Zielcharakter ausgegeben. Dies umfasst
den Wohnort, den Arbeitsplatz, die Art der Fortbewegung und das Lieblingsessen der
Simpsons-Figur. Zusätzlich werden individuelle, charakterspezifische Fakten präsentiert.
Die visuelle Ausgabe im Terminal wird durch eine ASCII - Repräsentation des verifizierten Charakterbildes unterstützt.
Nachdem alle Fragen beantwortet wurden und der oder die User:in seinen Simpsons Charakter mit Erläuterungen erhalten hat, werden alle Informationen zusätzlich in einer
Textdatei abgelegt um sie später noch einmal nachlesen zu können.

## Starten der Applikation
Zum Start der Applikation sind folgende Voraussetzungen notwendig:
- Das Java Development Kit (JDK) um den Code kompilieren und auszuführen zu können.
- Eine IDE um die Ausführung des Codes komfortabler zu gestalten.

Um die Applikation zu starten kann der Code innerhalb einer IDE der Wahl geöffnet werden. Danach muss die Java Klasse ’SimpsonsTerminal’ im Ordner ’SimpsonsQuiz/plugin0/src/main/java/com/dhbw/ase/simpsons/plugin/SimpsonsTerminal.java’ ausgeführt werden. Alle Interaktionen der Applikation mit dem User erfolgen anhand einer textbasierten Ausgabe über das Terminal der IDE. Im Anschluss an die Ausführung der
Applikation wird eine Textdatei mit dem Namen ’YourCharacter.txt’ erstellt. Diese
enthält alle Informationen über den Simpsons-Charakter, welcher durch die Antworten
des Users bestimmt wurde und im Terminal zu sehen waren.

## Testen der Applikation
Um die Applikation zu testen gelten folgende Voraussetzungen:
- Maven ist installiert
- Optional: Die IDE IntelliJ ist installiert

Zum Start des Test ist sicherzustellen, dass der Code in der IDE der Wahl geöffnet ist.
Danach können alle Tests-Klassen im Verzeichnis der jeweiligen Schicht unter:
SimpsonsGame/src/test/java/de/dhbw/ase/simpsons gefunden und einzeln ausgeführt
werden.
Alternativ kann im Wurzelverzeichnis ’SimpsonsGame’ auch die Kommandozeile geöffnet
werden und mit dem Befehl ’mvn test’ alle Tests ausgeführt werden.
