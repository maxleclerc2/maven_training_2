package fr.lernejo.tester.internal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestClassDiscovererLernejoTests {
    public TestClassDiscovererLernejoTests() {

    }

    @Test
    public void get_class() {
        TestClassDiscoverer classDiscoverer = new TestClassDiscoverer("fr.lernejo.tester");
        List<TestClassDescription> classDescription = classDiscoverer.listTestClasses();

        classDescription.stream()
            //.map(cd -> cd.classToTest) // si l'attribut classToTest est public
            .forEach(System.out::println);

        Assertions.assertThat((int) classDescription.size())
            .isEqualTo(3);
    }
}
