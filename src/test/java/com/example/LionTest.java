package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {

    Feline feline = new Feline();
    Lion lion = new Lion("Самка", feline);

    public LionTest() throws Exception {
    }

    @Test
    public void lionEatsAnimalFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, lion.getFood());
    }

    @Test
    public void lionSexExceptionTest() {
        String invalidSex = "Неизвестный";
        Exception actualException = null;
        try {
            new Lion(invalidSex, feline);
        } catch (Exception e) {
            actualException = e;
        }
        assertNotNull(actualException);
    }

    @Test
    public void getSomeKittens() {
        assertEquals(1, lion.getKittens());
    }
}


