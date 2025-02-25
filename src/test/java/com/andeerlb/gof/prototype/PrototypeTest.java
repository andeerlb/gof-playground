package com.andeerlb.gof.prototype;

import com.andeerlb.gof.prototype.shallow.Information;
import com.andeerlb.gof.prototype.shallow.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

public class PrototypeTest {
    @DisplayName("Should return shallow copy with cloneable interface")
    @Test
    public void shouldReturnShallowCopyWithCloneableInterface() {
        var person1 = new Person("Anderson", "Babinski", new Information("M", 28));
        var person2 = person1.clone();

        Assertions.assertEquals("Anderson", person1.getGivenName());
        Assertions.assertEquals("Babinski", person1.getSurname());
        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals(person1.getGivenName(), person2.getGivenName());
        Assertions.assertEquals(person1.getSurname(), person2.getSurname());
        Assertions.assertEquals(person1.getInformation().getGender(), person2.getInformation().getGender());
        Assertions.assertEquals(person1.getInformation().getAge(), person2.getInformation().getAge());

        person2.getInformation().setGender("F");
        person2.getInformation().setAge(18);

        Assertions.assertEquals("F", person1.getInformation().getGender());
        Assertions.assertEquals(18, person1.getInformation().getAge());

        Assertions.assertEquals("F", person2.getInformation().getGender());
        Assertions.assertEquals(18, person2.getInformation().getAge());
    }

    @DisplayName("Should return shallow copy with modelmapper")
    @Test
    public void shouldReturnShallowCopyWithModelMapper() {
        var modelMapper = new ModelMapper();

        var person1 = new Person("Anderson", "Babinski", new Information("M", 28));
        var person2 = modelMapper.map(person1, Person.class);

        Assertions.assertEquals("Anderson", person1.getGivenName());
        Assertions.assertEquals("Babinski", person1.getSurname());
        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals(person1.getGivenName(), person2.getGivenName());
        Assertions.assertEquals(person1.getSurname(), person2.getSurname());
        Assertions.assertEquals(person1.getInformation().getGender(), person2.getInformation().getGender());
        Assertions.assertEquals(person1.getInformation().getAge(), person2.getInformation().getAge());

        person2.getInformation().setGender("F");
        person2.getInformation().setAge(18);

        Assertions.assertEquals("F", person1.getInformation().getGender());
        Assertions.assertEquals(18, person1.getInformation().getAge());

        Assertions.assertEquals("F", person2.getInformation().getGender());
        Assertions.assertEquals(18, person2.getInformation().getAge());
    }

    @DisplayName("Should return deep by Jackson with Json")
    @Test
    public void shouldReturnDeepCopyByJacksonWithJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        var person1 = new Person("Anderson", "Babinski", new Information("M", 28));
        var person2 =  objectMapper.readValue(objectMapper.writeValueAsString(person1), Person.class);

        Assertions.assertEquals("Anderson", person1.getGivenName());
        Assertions.assertEquals("Babinski", person1.getSurname());
        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals(person1.getGivenName(), person2.getGivenName());
        Assertions.assertEquals(person1.getSurname(), person2.getSurname());
        Assertions.assertEquals(person1.getInformation().getGender(), person2.getInformation().getGender());
        Assertions.assertEquals(person1.getInformation().getAge(), person2.getInformation().getAge());

        person2.getInformation().setGender("F");
        person2.getInformation().setAge(18);

        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals("F", person2.getInformation().getGender());
        Assertions.assertEquals(18, person2.getInformation().getAge());
    }

    @DisplayName("Should return deep by Jackson with ConvertValue")
    @Test
    public void shouldReturnDeepCopyByJacksonWithConvertValue() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        var person1 = new Person("Anderson", "Babinski", new Information("M", 28));
        var person2 =  objectMapper.convertValue(person1, Person.class);

        Assertions.assertEquals("Anderson", person1.getGivenName());
        Assertions.assertEquals("Babinski", person1.getSurname());
        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals(person1.getGivenName(), person2.getGivenName());
        Assertions.assertEquals(person1.getSurname(), person2.getSurname());
        Assertions.assertEquals(person1.getInformation().getGender(), person2.getInformation().getGender());
        Assertions.assertEquals(person1.getInformation().getAge(), person2.getInformation().getAge());

        person2.getInformation().setGender("F");
        person2.getInformation().setAge(18);

        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals("F", person2.getInformation().getGender());
        Assertions.assertEquals(18, person2.getInformation().getAge());
    }

    @DisplayName("Should return deep copy with modelmapper")
    @Test
    public void shouldReturnDeepCopyWithModelMapper() {
        var modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setDeepCopyEnabled(true);

        var person1 = new Person("Anderson", "Babinski", new Information("M", 28));
        var person2 = modelMapper.map(person1, Person.class);

        Assertions.assertEquals("Anderson", person1.getGivenName());
        Assertions.assertEquals("Babinski", person1.getSurname());
        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals(person1.getGivenName(), person2.getGivenName());
        Assertions.assertEquals(person1.getSurname(), person2.getSurname());
        Assertions.assertEquals(person1.getInformation().getGender(), person2.getInformation().getGender());
        Assertions.assertEquals(person1.getInformation().getAge(), person2.getInformation().getAge());

        person2.getInformation().setGender("F");
        person2.getInformation().setAge(18);

        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals("F", person2.getInformation().getGender());
        Assertions.assertEquals(18, person2.getInformation().getAge());
    }

    @DisplayName("Should return deep copy with serialization")
    @Test
    public void shouldReturnDeepCopyWithSerialization() {
        var person1 = new com.andeerlb.gof.prototype.deep.Person("Anderson", "Babinski",
                new com.andeerlb.gof.prototype.deep.Information("M", 28));
        var person2 = person1.clone();

        Assertions.assertEquals("Anderson", person1.getGivenName());
        Assertions.assertEquals("Babinski", person1.getSurname());
        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals(person1.getGivenName(), person2.getGivenName());
        Assertions.assertEquals(person1.getSurname(), person2.getSurname());
        Assertions.assertEquals(person1.getInformation().getGender(), person2.getInformation().getGender());
        Assertions.assertEquals(person1.getInformation().getAge(), person2.getInformation().getAge());

        person2.getInformation().setGender("F");
        person2.getInformation().setAge(18);

        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals("F", person2.getInformation().getGender());
        Assertions.assertEquals(18, person2.getInformation().getAge());
    }

    @DisplayName("Should return deep copy by constructor")
    @Test
    public void shouldReturnDeepCopyByConstructor() {
        var person1 = new com.andeerlb.gof.prototype.deep.Person("Anderson", "Babinski",
                new com.andeerlb.gof.prototype.deep.Information("M", 28));
        var person2 = new com.andeerlb.gof.prototype.deep.Person(person1);

        Assertions.assertEquals("Anderson", person1.getGivenName());
        Assertions.assertEquals("Babinski", person1.getSurname());
        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals(person1.getGivenName(), person2.getGivenName());
        Assertions.assertEquals(person1.getSurname(), person2.getSurname());
        Assertions.assertEquals(person1.getInformation().getGender(), person2.getInformation().getGender());
        Assertions.assertEquals(person1.getInformation().getAge(), person2.getInformation().getAge());

        person2.getInformation().setGender("F");
        person2.getInformation().setAge(18);

        Assertions.assertEquals("M", person1.getInformation().getGender());
        Assertions.assertEquals(28, person1.getInformation().getAge());

        Assertions.assertEquals("F", person2.getInformation().getGender());
        Assertions.assertEquals(18, person2.getInformation().getAge());
    }
}
