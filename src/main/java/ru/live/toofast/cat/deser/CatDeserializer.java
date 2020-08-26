package ru.live.toofast.cat.deser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ru.toofast.cat.model.Cat;
import ru.toofast.cat.model.CatCollection;

import java.io.*;

public class CatDeserializer {

    public CatCollection deserialize(String filename) throws IOException, ClassNotFoundException {

        ObjectMapper objectMapper = new XmlMapper();
        File file = new File(filename);

        Object o = objectMapper.readerFor(CatCollection.class)
                .readValue(file);
        CatCollection catCollection = (CatCollection) o;
        System.out.println(catCollection);

        return catCollection;
    }


}
