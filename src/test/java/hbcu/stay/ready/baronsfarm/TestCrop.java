package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCrop {

    @Test
    public void CropTest() {
        // Given
        ArrayList<Edible> bundleOfCrops = new ArrayList<>();
        Edible testCrop = new Edible(bundleOfCrops);
        bundleOfCrops.add(testCrop);

        // When
        int expectedSize = 1;
        int actualSize = bundleOfCrops.size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
