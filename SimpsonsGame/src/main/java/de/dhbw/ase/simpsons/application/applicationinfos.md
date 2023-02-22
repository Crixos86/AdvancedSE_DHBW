# 1-Application

## Struktur: 

- Application Business Rules

- Anwendungsspezifische Geschäftslogik
- Regeln, die nur für den Anwendungsfall gelten
  - Spezifisch für die Anwendung
  - Nicht organisationsweit gültig
  - z.B. Regeln für einen Workflow

## Position:
- Enthält die Anwendungsfälle (Use Cases)
  - Resultiert direkt aus den Anforderungen
- Implementiert die anwendungsspezifische Geschäftslogik
  - Application-specific Business Rules
- Steuert den Fluss der Daten und Aktionen von und zu den Entities
  - Verwendet die Geschäftslogik, um den jeweiligen Anwendungsfall umzusetzen

### Beispiele:

- Bankkonto-Verwaltungssoftware
- Zentraler Use Case: Überweisungen
  - Abbuchung von Konto 1, Zubuchung auf Konto 2
  - Auch hier muss eine wichtige Regel gelten 
  - Die Summe aus Abbuchung und Zubuchung ergibt immer 0
  - Kann sich ändern, beispielsweise bei Einführung von Transaktionsgebühren
  - Keine Auswirkung auf die Domäne