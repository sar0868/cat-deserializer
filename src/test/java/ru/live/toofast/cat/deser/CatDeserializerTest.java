package ru.live.toofast.cat.deser;

import org.junit.jupiter.api.Assertions;
import ru.toofast.cat.model.CatCollection;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CatDeserializerTest {

    @org.junit.jupiter.api.Test
    void deserialize() throws IOException, ClassNotFoundException {

        CatDeserializer catDeserializer = new CatDeserializer();
        CatCollection cats = catDeserializer.deserialize("C:\\Temp\\cat-serialization\\cat.xml");

        Assertions.assertTrue(cats.getCats().size() == 2);
        Assertions.assertEquals("Mara", cats.getCats().iterator().next().getName());
    }
}