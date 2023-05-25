package test.java.com.example.anagram;

import main.java.com.example.anagram.AnagramCreator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class AnagramCreatorTest {
    @Test(expected = IllegalArgumentException.class)
    public void ShouldNotBeNull() {
        AnagramCreator anagramCreator = new AnagramCreator();
        anagramCreator.createAnagram(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ShouldNotBeEmpty() {
        AnagramCreator anagramCreator = new AnagramCreator();
        anagramCreator.createAnagram("");
    }

    @Test
    public void ShouldBeReverseWithConditionsVersion1() {
        AnagramCreator ac1 = new AnagramCreator();
        Assert.assertEquals("AnagramCreator{resultArray = [oll1eH, dc!ba]}", ac1.createAnagram("Hel1lo ab!cd"));
    }

    @Test
    public void ShouldBeReverseWithConditionsVersion2() {
        AnagramCreator ac1 = new AnagramCreator();
        Assert.assertEquals("AnagramCreator{resultArray = [oll1eH, dlrow]}", ac1.createAnagram("Hel1lo world"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ShouldBeReverseWithConditionsVersion3() {
        AnagramCreator ac1 = new AnagramCreator();
        ac1.createAnagram("          abc          ");
    }
}