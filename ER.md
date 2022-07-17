# Tipologia di relazioni nel DB
## One to one
- Account - Titolare
- Account - Cliente
## One to many
- Cliente - Ordine 
## Many to many
- Ordine prodotto: relazione M2M con tabella di join ordine_prodotto (si spezza in due one to many)