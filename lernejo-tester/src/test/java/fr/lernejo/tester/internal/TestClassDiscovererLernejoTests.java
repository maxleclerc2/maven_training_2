package fr.lernejo.tester.internal;

import fr.lernejo.tester.api.TestMethod;

import java.util.List;

public class TestClassDiscovererLernejoTests {

    @TestMethod
    public void get_class() {
        TestClassDiscoverer classDiscoverer = new TestClassDiscoverer("fr.lernejo.tester");
        List<TestClassDescription> classDescription = classDiscoverer.listTestClasses();

        /*
        classDescription.stream()
            //.map(cd -> cd.classToTest) // si l'attribut classToTest est public
            .forEach(System.out::println);
        */

        /*
        Assertions.assertThat((int) classDescription.size())
            .isEqualTo(3);
        */

        if (classDescription.size() == 3) return;
        throw new RuntimeException();
    }

    /*
    public static void main(String[] args) {
        TestClassDiscovererLernejoTests tests = new TestClassDiscovererLernejoTests();

        test.get_class();
    }
    */
}
