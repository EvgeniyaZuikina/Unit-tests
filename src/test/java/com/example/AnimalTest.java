package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalTest {
    private final String animalKind;
    private final List<String> expected;
    Animal animal = new Animal();

    public AnimalTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalFood() {
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")},
        };
    }

    @Test
    public void getFood() throws Exception {
        List<String> actual = animal.getFood(animalKind);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeExceptionForAnotherAnimalKind() {
        String invalidAnimal = "Неизвестный";
        Exception actualException = null;
        try {
            Assert.assertEquals(animal.getFood(invalidAnimal), List.of("Неизвестный вид животного, используйте значение Травоядное или Хищник"));
        } catch (Exception e) {
            actualException = e;
        }
        assertNotNull(actualException);
    }

    @Test
    public void getFamily() {
        assertThat(animal.getFamily(), equalTo("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи"));
    }
}