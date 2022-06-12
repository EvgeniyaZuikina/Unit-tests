package com.example;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class CatTest {

    private final Feline feline = new Feline();
    private final Cat cat = new Cat(feline);

    @Test
    public void catEatsAnimalFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, cat.getFood());
    }

    @Test
    public void catGetSound() {
        assertThat(cat.getSound(), equalTo("Мяу"));
    }
}
