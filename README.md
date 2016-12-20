# fooData

	Search engine, written in Java, that searches for local products from all over Greece. The engine gets urls meant for indexing from a MySql database, made by a web crawler. It is supposed to search a number of specified-by-us web sites, which are given to the crawler. The list of websites may expand. 
	
       FooData search engine works as follows: the program gets a the links from the database, reads the HTML code of each one and collects keywords from the metatag areas description, title and keywords. After that it creates an index containing the keywords and the urls where they where found. The user can write a word and the engine searches into the index to find out if it exists.
	
       To use it you must have a MySql database and change the connection credentials in class Crawling, to your own.

   Sites searched at the moment:




 
   Authors

Ιωάννα Γυφτάκη
Παναγιώτα Δημητροπούλου
Μαρία Μουλά
Βασιλική Μπέη
Μαρία-Μαλεβή Παπαδάκη
Έλενα Τριαντάφυλλου
Αριστέα Τρουλλινού
Ιωάννα Φώτη


