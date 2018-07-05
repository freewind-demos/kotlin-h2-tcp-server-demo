Kotlin H2 Database Demo
=======================

Run `Hello.kt` from IDE. 

It will show the url to connect the memory h2 from web console, like:

```
jdbc:h2:tcp://192.168.1.102:9092/mem:mydb
```

Then run in terminal:

```
brew install h2
h2
```

Fill the url and use username password `sa/sa` to connect.

Another way to start h2 web console: Find you h2 jar file, and run

```
java -cp h2-1.4.197.jar org.h2.tools.Console -web -browser
```

Notice
------

It may be very very slow to connect the db in the web console, on Mac. The reason may be the host name of the machine defined by Mac.

See: <https://stackoverflow.com/questions/41029630/h2-console-glacially-slow>