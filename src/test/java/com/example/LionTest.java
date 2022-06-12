package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import java.util.List;

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
            Exception exception = assertThrows(Exception.class,() -> new Lion("Неизвестный", new Feline()));
            String exceptionMessage = "Используйте допустимые значения пола животного - самец или самка";
            assertEquals(exceptionMessage, exception.getMessage());
        }

        @Test
        public void getSomeKittens() {
        assertEquals(1, lion.getKittens());
    }
}


