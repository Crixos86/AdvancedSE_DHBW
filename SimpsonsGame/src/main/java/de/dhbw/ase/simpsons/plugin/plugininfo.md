## Struktur: 

- Frameworks und Driver
- Auf gar keinen Fall enthält diese Schicht Anwendungslogik
  - Die Daten fallen mundfertig aus dem Adapter
  - Alle Entscheidungen sind bereits gefallen
  - Anfragen werden nicht uminterpretiert (das machen die Adapter)

- Keine emotionale Bindung an diesen Code
  - Jederzeitige Änderung möglich
  - Auswirkungen nur auf die Adapterschicht
  - Übersichtlicher Aufwand


## Position:

- Greift auf Adapter zu
- Keine Logik
- Enthält "Benutzeroberfläche"
- Datenbank, GUI, Drittsysteme, Geräte