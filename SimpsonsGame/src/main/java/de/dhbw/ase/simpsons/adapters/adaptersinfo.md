## Struktur: 

- Interface Adapters

## Position: 

- Presenter, Controller, Gateways
- Diese Schicht vermittelt Aufrufe und Daten an die inneren Schichten
  - Formatkonvertierungen
    - Externes Format wird so umgewandelt, dass die Applikation gut zurechtkommt
    - Internes Format wird so umgewandelt, dass die externen Plugins gut zurechtkommen

- Oftmals nur einfache Datenstrukturen, die hin- und hergereicht werden
- Ziel: Entkopplung von innen und außen

### Beispiel:

- Bankkonto-Verwaltungssoftware
- Anzeige auf Webseite (HTML) vorbereiten
- Alle veränderlichen Inhalte der Seite unzweideutig berechnen (RenderModel)
  - Geldbeträge als Zeichenketten im Format 1234,56 €
  - Die Anzeigeschicht benötigt keine numerischen Werte
  - Farben als HTML-Hexcodes
  - Attribute (z.B. checked="checked" für Checkboxes)

- Ziel: keine Umsetzungslogik in der Plugin-Schicht notwendig