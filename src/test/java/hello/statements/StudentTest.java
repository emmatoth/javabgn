package hello.statements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test//annotáció
    void testGetName() { //minden tesztmetódusnak voidnak kell lennie
        //Given - megadott adatok, adott állapot, amiből kiindulunk
        Student student = new Student("Béla");
        //When - amikor valami történik
        String result = student.getName();
        //Then - akkor azt kapom-e eredményül amit szeretnék
        assertEquals("Béla",result); //ezzel megszületett 1 db teszt metódus, amit ugyan úgy fogunk tudni lefuttatni, mint bármilyen main metódust, ez a leggyakrabban használt metódus a teszten
    }

    @Test
    void testGetName2() {
        Student student = new Student("Béla");
        assertEquals("Béla",student.getName()); //így is lehet, kicsit rövidebb
    }
}
