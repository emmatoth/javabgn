package control;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlTest {

//    @BeforeEach //minden teszteset előtt lefuttatja, ezt arra lehet használni, hogy ebben írjuk meg a kezdő értéket. példányosítás kiemelés
//    void init() {
//        // az itt található metódust, kiteszem attribútumként is - z osztályon kívülre (young.Trainer-es) Trainer youngTrainer;
//        youngTrainer = new Trainer(name "Béla");
//    }

    @Test
    void testGetCharacter() {
        Control control = new Control();
        assertEquals('g', control.getCharacter('g'));
        assertEquals('u', control.getCharacter('u'));
    }

}