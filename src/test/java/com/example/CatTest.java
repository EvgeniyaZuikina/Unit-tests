package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Mock
    Feline feline;

    @Test
    public void catEatsAnimalFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void catGetSound() {
        assertThat(cat.getSound(), equalTo("Мяу"));
    }
}
