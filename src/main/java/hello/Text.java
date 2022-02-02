//package hello;
//
//public class Text {
//}
//1.	nap
//        Karakterkódolás megadása.
//<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
//        src  main  java
//        ide tesszük a kódolásokat
//        srctestjava
//        tesztelt programok jönnek ide
//        Javaban úgy kell fejleszteni, hogy megírja a forráskódot, amihez elegendő bármilyen szövegszerkesztő, és olyan módon kell elmenteni, hogy .java kiterjesztése legyen.
//        Projekt leíró állománya:
//<?xml version="1.0" encoding="UTF-8"?>
//<project xmlns="http://maven.apache.org/POM/4.0.0"
//        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
//<modelVersion>4.0.0</modelVersion>
//
//<groupId>training</groupId>
//<artifactId>javabgn</artifactId>
//<version>1.0-SNAPSHOT</version>
//
//<properties>
//<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
//<maven.compiler.source>17</maven.compiler.source>
//<maven.compiler.target>17</maven.compiler.target>
//</properties>
//
//</project>
//
//        Első javaban írt program megírása
//        Nem dolgozunk a fő mappába, mindig hozunk létre új csomagokat (könyvtárakat). Csomagokon belül pedig osztályok vannak.
//        Csomagok kisbetűvel osztályok nagybetűvel kezdődnek.
//        Java osztály mindenképpen tartalmaznia kell a csomag és az osztály nevét, plusz kapcsos zárójel.
//        Public módosító szó – egész projekten belül látható, bárhonnan meghívható, bárhonnan hivatkozható, osztályon kívülről is látható
//        Private módosító szó – nem lehet kívülről hozzáférni, csak az osztályokban láthatóak
//
//        System.out.println(); – írd ki a konzolra (sout a rövidítése)
//        Eredmény:
//        "C:\Program Files\Java\jdk-17.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=59571:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\T360-v2-JAPA-s06\IdeaProjects\javabgn\target\classes hello.Hello
//        Hello World!
//
//        Process finished with exit code 0
//
//        JAVA objektum orientált nyelv.. a programban objektumok működnek együtt.
//        Alapvető eszközei az osztályok. Egy fájlban egy osztály. Csomagokba, könyvtárakba rendezve (struktúra).
//        Osztály felépítése
//        -	attribútumok
//        o	jellemző tulajdonságok
//        o	adattárolás (változókban található adatok) – max.4-5
//        o	láthatósági módosítója (public, private)
//        -	metódust
//        o	main – elhelyezhető külön osztályban, de egy azon osztályban is rögzíthető
//        	public static void main – psvm a rövidítés
//        	hogyan működnek az oasztályon belül megírt dolgok
//        o	get – lekérdezés, attribútumok értékének lekérdezése
//        o	set / change – módostó, attribútumok értékének módosítása
//        o	this – az attribútum értékét adja
//        o	utasítások sorozata, mely névvel rendelkezik
//        o	állapot lekérdezésére és módosítására
//        -	konstruktor
//        o	létrehoz
//        o	nincs visszatérési értéke
//        o	hasonlóan működik, mint a set-ter metódus
//        o	osztály nevét kell tartalmaznia, nagybetűvel
//        o	állapot inicializálása – attribútumoknak értéket ad
//        o	példányosításkor fut le – objektumot hozok létre belőle
//        o	Pédányosítás:
//        	létre kell hozni egy új objektumot és az értékül adjuk egy érték típusú változónak
//        	azt tudjuk meghívni, amit az osztályokba létrehoztunk
//
//        String – szövegkezelő, szövegmegjelenítő
//        -	Osztály
//        -	Típus
//        -	Literál – String text = ”alma”; – szöveges típusú objektum jön létre
//        -	Üres String – String word = ” ”;
//        -	konkatenáció – String apple = ”jonathán” + text
//        -	egyenlőség vizsgálat (text.equals)
//        -	indexOf – karakterek számának megadása indexként első betű a 0. index
//        -	lenght – szavak hossza
//        -	substring – karakterek adott indexétől adja az eredményt, vagy kettő index közöttit
//        -	\n – sortörés
//        int – számokat tároló (egész számokat)
//        return – add vissza nekem, van visszatérési érték
//        void – csak csináljon valamit, nincs visszatérési érték
//        = - értékadás
//        System.in – konzolról adatbekérés
//
//        Megjegyzés:
//        -	// blabla
//        -	/* blabla */
//
//        Többféle ellenőrző mechanizmus
//        -	sárgával kiemelt kijelölés – van még más lehetőség is, valami pluszt lehet megadni
//        -	piros kijelölés – valami gond van még ott a kódban
//
//        Osztályok
//        -	UML
//        o	osztályok és kapcsolatok
//        o	egységes jelölőnyelv
//        o	GRAFIKUS LEÍRÓ NYELV
//        o	osztálydiagram
//
//        Osztály neve	Trainer
//        Attribútumok (típus és név)	- name: String
//        - yearOfBirth: int
//        Konstruktor
//        metódusok
//        getter metódusok
//        setter metódusok	+ Trainer (name: String, year OfBirth: int)
//
//        Adattípusok
//
//        Operátorok
//        -	gyakori
//        -	példányosításra
//        -	értékadó
//        -	összehasonlítés
//        -	logaikai
//        o	feltételek megadásakor
//        -	egy operandusú operátor
//        o	++ (z++;) egy értékkel növeli az értéket
//        o	-- (z--;) egy értékkel csökkenti az értéket
//        Utasítások
//        -	Értékadó
//        -	Kifejezés egy operandusú operátorral
//        -	Példányosítás
//        -	Metódushívás
//        -	Vezérlő utasítások
//        o	feltételeket és ciklusokat
//
//        Dátumok, időpontok tárolására alkalmas osztályok
//        -	LocalDate
//        -	LocalTime
//        -	LocalDateTime
//
//        Java Language Specification
//        -	mindig a forráskódból indulunk ki (szöveges állomány)
//        -	1 forráskód 1 java osztályt tartalmazzon
//        o	public class { }
//        o	osztály elé az importok mehetnek
//        -	objektum, ami az osztályból jön létre
//        o	string
//        o	new
//        o	példány csak úgy lesz, ha kiírjuk a new-t
//         
//        2. nap
//
//        A forrás utasításokból áll (sorok utasítások).
//
//        Hogyan jön létre egy objektum, úgy hogy példányosítjuk.
//        -	new
//        -	String
//
//        Vezérlési szerkezetek (ControlStatements)
//        -	Elágazás
//        o	induljon el a program, legyen meg a feltétel és vizsgáljuk meg a feltételt, hogy igaz vagy sem
//        o	if, else
//        -	Ciklus
//        o	induljon el a program, kezdődjön a számolás és legyen egy feltétel, írja ki
//        o	újra vizsgálja meg a feltételt, újra írja ki
//        o	és így tovább míg hamis ágra nem fut, akkor véget ér a program
//        o	for
//        o	for (int i=0; i<10; i++) – 3 feltételt tartalmaz
//        % - maradék jelölés
//
//        Feladatok: Numbers, Greeting
//
//        Tömbök (ArraysAndLists)
//        -	létrehozása new-val
//        -	kezdőértéket kapnak az elemei
//        -	az elemei indexelődnek
//        -	nem indexeltük-e túl a tömböt, index ellenőrzés – IndexOutOfBoundsException)
//        -	lekérhetjük a hosszát, length
//        -	tömbliterál {3, 6, 1};, primitív
//        -	e helyett a listákat használják inkább
//        -	mindig meg kell adni milyen hosszú legyen, vagy a java mondja meg az értékeit, vagy mi hozzuk létre
//
//        Listák, ArrayList osztály (ArraysAndLists2)
//        -	definiálása mindig List
//        -	dinamikus, tömbök helyett ezt használjuk
//        -	nem lehet olyat, hogy a primitív típusú egész számokat tartalmazza
//        -	csak osztály típusú objektumokat tud befogadni (nagybetűsöket)
//        -	csomagoló osztályok értékek létrehozásához
//        o	int – Integer
//        o	double – Double
//        o	boolean – Boolean
//        o	char – Character
//        -	listához hozzá lehet adni új elemet, ki lehet venni belőle, törölni lehet
//        -	tartalmazza-e az adott értéket, megtudjuk a méretét (mennyi elemet tartalmaz)
//        -	más osztályok is hozzáadhatók és variálhatók (List<Product> kép) – lényeg, hogy egy package-n belül legyen
//        -	kiírom egy adott részét – for (Product p: products)…
//        -	nem csak a lista tartalmazhat osztály típusú dolgokat, hanem osztály is tartalmazhat listákat -  nem volt világos a menete (Address.java)
//
//
//        For-each ciklus (ArraysAndLists2)
//        -	az adott lista elemeit vizsgálja, de nem tudjuk az indexét
//
//        Feladat: Freezer, Second
//
//        -	számok helyére 0
//        -	objektumok helyére null
//
//        Objektumok
//        -	osztály csak egy típus, egy minta
//        -	konkrét pédányosítással egy objektum, egy osztály példánya
//        -	állapota van, az attribútumainak értéke a memóriában
//        -	a változó csak egy név, melynek típusa van, értéke
//        o	speciális null érték
//        o	referencia az objektumra
//        -	változó értékadás referencia változtatás
//        -	tömbben szerepelhetnek
//        -	kollekciókban szerepelhetnek
//        -	más osztály attribútuma
//        -	metódus a viselkedését írja le
//        -	attribútumok tulajdonságait írja le
//
//        Attribútumok használata
//        -	eltárolt adatok, értékek, írják le az objektum állapotát
//        -	láthatóság (private illik ellátni, hogy senki ne tudjon hozzájutni)
//        -	értékadás tipikusan konstruktoron vagy metóduson keresztül
//        -	default érték null (osztálytípusú), számok esetében 0, 0.0 (számtípusú)
//
//        Konstruktor
//        -	objektum állapotának inicializálása
//        -	neve az Osztály nevével megegyező, nincs visszatérési érték
//        -	default kontruktor
//        o	ha nem írunk bele konstruktort, akkor a háttér rak bele egyet (target alatti részben lehet megnézni .class)
//        o	ami azt jelenti, hogy példányosítani már lehet
//
//        Metódusok
//        -	lekérdező (pl. getter)
//        -	állapot módosító (pl. setter)
//        -	imperatív programoás eszközei
//        -	utasításokat tartalmaz
//        -	attribútumokhoz hozzáférnek
//        -	lokális változókat definiálhat és férhet hozzá
//        -	metóduson belüli metódus hívás
//        -	toString metódus
//        o	ki lehet írni magát az objektumot
//
//        Feladat: Kompozíció Course.java és Student.java
//
//        előre mennek az általános leírások
//
//         
//        Felsorolásos osztálytípus (Color.java (enum) + Car.java (class))
//        -	Enum (nem Class)
//        -	olyan dolgokat lehet megadni, ami konkrét felsorolás, ezeket az értékeket hívjuk meg
//        -	lehet hozzá felvenni attribútumot, metódust
//        -	konstans, nagybetűvel
//        -	sorrendiség, lekérdezhetők, indexelhetők
//        Feladat: Enum (Continent.java, EnumMain.java)
//        Feladat: Chess (Chess.java, ChessMain.java)
//
//
//        Hasznos metódusok
//        -	valueOf
//        -	name
//        -	ordinal
//
//        Egyszerű típusok (képen)
//        Autoboxing
//        -	Csomagolás
//        Számok más számrendszerben (képen)
//
//        Típuskonverzió
//        -	erősen típusos nyelv
//        -	kifejezésben összegyeztethetőek
//        -	automatikus konverzió
//        -	explicit konverzió
//        o	többről a kevesebb fele konvertálni kell (double  int)
//        o	információ vesztés történhet
//        -	különböző verziók
//        -	típuskényszerítés
//        -	boxing és unboxing
//        -	parse és format
//        o	Integer.toString(2)  String numberString = Integer.toSring(2)
//        o	Integer.parseInt(”23”)
//        String metódusok
//        -	meghívható String változóként
//        -	toUpperCase – csupa nagybetűvel
//        -	toLowerCase – csupa kisbetűvel
//        -	összehasonlítás (John.equals(John)) / (John.equalsIgnoreCase(John)
//        -	substring – írja ki adott indextól, vagy két index közötti intervallumban
//        -	láncolás – (John Doe.toUpperCase().substring(2,6)
//        -	kezdet – (John Doe.startsWith(f))
//        -	vége – (John Doe.endsWith(e))
//
//        StringBuilder
//        -	szövegekkel akar dolgozni
//        -	beépített osztály a javaban
//        -	StringBuilder sb = new StringBuilder();
//        sb.append(„x);
//        sb.append(„ „);
//        sb.append(„körte”);
//        System.out.prtintln(sb.toString())
//
//        helyettestő karakterek:
//        -	%d egész szám
//        -	%s szöveg
//        -	%f lebegőpontos szám, megadható a tizedesjegyek száma %.1f (1 tizedesjegy)
//        -	System.out.printf(„Vettem %d kiló almát.”, 1);
//        -	System.out.printf("A %s osztály megtett %d km-t, ez az egész %.2f része.", "10.a", 23, 0.5666);
//        -	A 10.a osztály megtett 23 km-t, ez az egész 0,57 része.
//
//
//        Java alkalmazás végtelenségig tud nőni, nincs limit utasításra, nincs limit attribútumnak
//
//        3 rétegű alkalmazás
//        -	alkalmazás szétvágásra kerül
//        -	azokon belül osztályok szerepelnek, melyek valamiért felelősek
//        -	alsó réteg – adatbázisért felelős
//        -	középső réteg – üzleti logika réteg, üzleti folyamatok (use case)
//        -	felső réteg – felhasználóval tartja a kapcsolatot, controller, UI
//        technologiák amivel felhasználói felületeket lehet összerakva
//        -	html
//        -	angular, react
//
//        Könyvnyilvántartó rendszer készítése
//
//
//         
//        3.	nap
//
//        Ciklusok
//        -	while (ControlStatements)
//        o	boolean feltétel
//        o	addig hajtja végre a törzset, amíg a feltétel igaz
//        o	minden végrehajtás előtt kiértékelődik a feltétel
//        o	végtelen ciklus implementálható
//        o	elől tesztelő ciklus
//        o	előszőr feltételt vizsgál és ha igaz, akkor lefut az utasítás
//        -	do-while (ControlStatements)
//        o	egyszer mindenképpen lefut
//        o	hátul tesztelő ciklus
//        o	csak utólag értékeli ki a feltételt és közben már lefut az utasítás
//        -	for (ControlStatements)
//        o	inicializációs utasítás (deklarált változó csak a ciklus törzsében látható)
//        o	feltétel
//        o	léptető utasítás
//        o	0 és n-1 közötti értékek között gyakran használatos
//        -	for-each (ArraysAndLists2)
//        o	tömb elemeinek bejárására
//        o	kollekció elemeinek bejárására
//        Vezérlési szerkezetek és elágazások
//        -	3 vezérlési szerkezet használatával minden algoritmus felépíthető
//        o	szekvencia
//        o	szelekció
//        o	iteráció
//        -	nincs szükség ugrásra
//        Feltétes elágazás
//        -	if
//        o	if + else
//        o	további feltételeket is lehet, további else
//        -	switch
//        o	case ágak megadása (többet is lehet)
//        o	default – minden más esetben
//        o	break – onnan nem megy tovább
//        o	feltételben: bármi ami int típussá automatikusan konvertálható, String, enum
//Feladat: Control.java
//
//        while(!exit.equals("x")) – a !-jel az elentétje lesz a szövegnek, itt: exit nem egyenlő az x-el
//
//
//         
//        Maven
//        unit tesztelés – egység tesztelés
//        -	java fejlesztő magának írja meg ezeket a teszteket
//        -	hasznosak, ha később újra bele kell nyúlni a fejlesztésbe
//        -	pom.xml
//        o	függőséget rögzítünk (dependencies rész) és egy plugint, ami kell a működéséhez
//        -	test ág
//        o	amit tesztelni akarunk
//        -	unit assert metódusok
//        o	assertEquals – egyenlő – ez a leggyakrabban használt
//        o	assertNotEquals – ne legyen egyenlő
//        o	assertNull -
//        o	assertNotNull -
//        o	assertSame – ugyan annak várom azt
//        o	assertNotSame – nem ugyan annak várom azt
//        o	assertTrue – igaznak várom azt
//        o	assertFalse – hamisnak várom azt
//        o	assertArrayEquals – tömbök egyezőségéhez
//
//        Java hibaüzenetek = Kivételek (exceptions.java, threearrays.java)
//        -	mikor találkozunk kivétellel
//        -	normál működés során nem várt esetek
//        -	happy path elvártnak megfelelő működés
//        -	ha olyan adattal, működéssel találkozunk, melyre nem számítottunk
//        -	ez lehet programozói hiba
//        -	be kellene olvasni egy fájlt de nem jól van az elérési útvonala
//        -	throw new
//        Kötelező Könyvek junior fejlesztőknek:
//        Clean Code
//        Effective Java
//        -	69. szabály: Kivételeket ne használd vezérlésre
//        && - illetve
//        || -
//        Resources
//        -	ide lehet fájlokat bepakolni, amelyek szükségesek a fejlesztéshez
//        -	olvasni lehet az itteni fájlokból
//        -	meg írni lehet a fájlokból
//        -	ReadAndWriteFile.java – names.txt
//        -	BuyAndBuy.java – buying.txt, bought.txt
//
//
//
//
//
//
//
