package converter.java.test;


import converter.java.main.Converter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {
    @Test
    public void initialize() {
        System.out.println("Test Initialized");
    }

    @Test
    public void test_should_convert_1() {
        Converter converter = new Converter();
        String convertedValue = converter.convert(1);

        Assertions.assertEquals("I", convertedValue);

    }

    @Test
    public void test_should_convert_3() {
        Converter converter = new Converter();
        String convertedValue = converter.convert(3);

        Assertions.assertEquals("III", convertedValue);

    }

    @Test
    public void test_should_convert_5() {
        Converter converter = new Converter();
        String convertedValue = converter.convert(5);

        Assertions.assertEquals("V", convertedValue);

    }

    @Test
    public void test_should_convert_6() {
        Converter converter = new Converter();
        String convertedValue = converter.convert(6);

        Assertions.assertEquals("VI", convertedValue);
    }

    @Test
    public void test_should_convert_10() {
        Converter converter = new Converter();
        String convertedValue = converter.convert(10);

        Assertions.assertEquals("X", convertedValue);
    }

    @Test
    public void test_should_convert_4() {
        Converter converter = new Converter();
        String convertedValue = converter.convert(4);

        Assertions.assertEquals("IV", convertedValue);
    }

    @Test
    public void test_should_convert_9() {
        Converter converter = new Converter();
        String convertedValue = converter.convert(9);

        Assertions.assertEquals("IX", convertedValue);
    }

    @Test
    public void test_should_convert_20() {
        Converter converter = new Converter();
        String convertedValue = converter.convert(20);

        Assertions.assertEquals("XX", convertedValue);
    }

    @Test
    public void test_should_convert_50() {
        Converter converter = new Converter();
        String convertedValue = converter.convert(50);

        Assertions.assertEquals("L", convertedValue);
    }

    @Test
    public void test_should_convert_40() {
        Converter converter = new Converter();
        String convertedValue = converter.convert(40);

        Assertions.assertEquals("XL", convertedValue);
    }



}
