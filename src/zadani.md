# Správa domácích mazlíčků
Vaším úkolem je vytvořit jednoduchou aplikaci pro správu domácích mazlíčků pomocí objektově orientovaného přístupu v jazyce Java. Aplikace bude umožňovat správu informací o několika domácích mazlíčcích.
1. Třída Mazlicek
Vytvořte třídu Mazlicek, která bude mít následující atributy:
- jmeno (String)
- druh (String) – např. "pes", "kočka", "králík"
- vek (int)
- vaha (double)
Třída Mazlicek by měla mít:
- Konstruktor pro inicializaci všech atributů. 
- Gettery a settery pro všechny atributy.
- Metodu toString(), která vrátí textovou reprezentaci mazlíčka ve formátu: "Jméno: [jmeno], Druh: [druh], Věk: [vek], Váha: [vaha] kg".
2. Hlavní třída Main
Vytvořte třídu Main, která bude obsahovat metodu main. V této metodě:
- Nejprve pro ověření funkčnosti
- Vytvořte několik objektů typu Mazlicek.
- Uložte tyto objekty do seznamu (např. ArrayList).
- Vypište všechny mazlíčky z vytvořeného seznamu pomocí cyklu a metody toSting().
- Přidejte textové menu, ve kterém bude uživatel moc mazlíčky přidat nebo zvolit možnost výpisu

 
Rozšíření správy mazlíčků
1. Výpis jména všech mazlíčků
- Přidejte možnost výpisu jen jména všech mazlíčků a to ve formátu: Jmena mazlicku jsou: Jmeno1, Jmeno2, Jmeno3. 
- Pokuste se dodržet, že jména jsou oddělena čárkou a za posledním je tečka.
2. Výpočet průměrného věku a váhy mazlíčků
- Vytvořte metody, které vypočítají a vypíšou průměrný věk a průměrnou váhu všech mazlíčků v seznamu.
- Metoda vypocetPrumernehoVeku(List<Mazlicek> seznamMazlicku) vrátí průměrný věk všech mazlíčků.
- Metoda vypocetPrumerneVahy(List<Mazlicek> seznamMazlicku) vrátí průměrnou váhu všech mazlíčků.
3. Hledání mazlíčka podle jména
- Přidejte metodu, která umožní vyhledání mazlíčka podle jména. Metoda by měla přijmout jako parametr jméno a seznam mazlíčků a vrátit daného mazlíčka, pokud existuje, jinak vrátit zprávu, že mazlíček nebyl nalezen.
- Metoda najdiMazlickaPodleJmena(String jmeno, List<Mazlicek> seznamMazlicku) vrátí mazlíčka se zadaným jménem nebo informaci o tom, že mazlíček nebyl nalezen.
4. Filtrování mazlíčků podle druhu
- Vytvořte metodu, která vrátí seznam všech mazlíčků určitého druhu (např. všichni psi nebo všechny kočky).
- Metoda filtrujMazlickyPodleDruhu(String druh, List<Mazlicek> seznamMazlicku) vrátí seznam mazlíčků zadaného druhu.

