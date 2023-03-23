# 0-Domain
## Struktur: 

- Enterprise Business Rules
- Fachliche Regeln, die innerhalb einer Organisation immer gelten 
- Existieren immer, unabhängig davon, ob diese Regeln in einer Anwendung nachmodelliert wurden
- Beispiel:
  - Ein Student kann genau eine Erstklausur, eine Nachklausur und eine mündliche Prüfung pro Modul ablegen

## Position der Elemente: 

- Entities (Business Objects)
- Sollte sich am seltensten ändern
- Immun gegen Änderungen an Details wie Anzeige, Transport oder Speicherung

### Beispiel:

- Domäne: Bankkonto-Verwaltungssoftware
- Ein zentraler Begriff ist das „Konto“
- Jedes Konto muss der zentralen Regel genügen:
- Die Summe der Zubuchungen, Abbuchungen und des inversen Kontostands ergibt immer 0
- Das Konto ist eine Klasse im Domain Code
- Die Regel ist eine Invariante in der Konto-Klasse
  - Jede Methode der Klasse Konto muss die Regel beachten