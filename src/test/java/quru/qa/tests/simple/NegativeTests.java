package quru.qa.tests.simple;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import quru.qa.tests.TestBase;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NegativeTests extends TestBase {

    @Test
    void test0() {
        assertTrue(false);
    }

    @Test
    void test1() {
        assertTrue(false);
    }

    @Test
    @Tag("smoke")
    void test2() {
        assertTrue(false);
    }

    @Test
    void test3() {
        assertTrue(false);
    }

    @Test
    void test4() {
        assertTrue(false);
    }
}
