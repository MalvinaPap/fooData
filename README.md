# fooData

## Search Engine
Search engine, written in Java, that searches for local products from all over Greece. The engine gets urls meant for indexing
from a MySql database, made by a web crawler. It is supposed to search a number of specified-by-us web sites, which are given to 
the crawler. The list of websites may expand. 
	
FooData search engine works as follows: the program gets a the links from the database, reads the HTML code of each one and
collects keywords from the metatag areas description, title and keywords. After that it creates an index containing the keywords
and the urls where they were found. The user can write a word and the engine searches into the index to find out if it exists.
This project supports mainly greek words,one at a time,but english words can also get indexed depending on the web page searched. It uses steming for capital and non-capital letters and also excludes a number of stop-words from the final index.
It is built using Maven and JUnit testing.

## How to use it:

import the project and the included jar file into eclipse, convert to maven project,build and run class Search_Demo.
alternative: open cmd-write java -jar fooData_Search.jar
	
 
   *Authors:*
   
Ioanna Giftaki

Panagiota Dimitropoulou

Maria Moula

Vasiliki Bei

Maria-Malevi Papadaki

Elena Triantafyllou

Aristea Troullinou

Ioanna Foti



