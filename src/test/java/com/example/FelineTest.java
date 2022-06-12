package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

        @Test
        public void felineEatMeatTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.getFood("Хищник"));
    }
        @Test
        public void getKittensFeline() {
        assertEquals(1, feline.getKittens());
        }

        @Test
        public void felineHasThreeKittens() {
            assertEquals(3, feline.getKittens(3));
        }

        @Test
        public void felineGetFamily() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }
}


