SELECT surname AS "Фамилия", max(expierence) AS "Стаж" FROM Workers 
    WHERE expierence < (SELECT max(expierence) FROM Workers);
