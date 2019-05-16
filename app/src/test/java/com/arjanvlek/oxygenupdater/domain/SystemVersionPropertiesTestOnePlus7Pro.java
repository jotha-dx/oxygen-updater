package com.arjanvlek.oxygenupdater.domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Oxygen Updater, copyright 2019 Arjan Vlek. File created by arjan.vlek on 16/05/2019.
 */
public class SystemVersionPropertiesTestOnePlus7Pro extends SystemVersionPropertiesTest {

    /*
     * Test if European Economic Area (EEA) model is correctly detected by the app.
     * Note: The device *is* detected by App 1.0.0 - 2.3.2, but those legacy versions
     * cannot differentiate the EU version from other regional editions.
     * As nobody is going to use such old OU versions on OP7+, this is acceptable
     */
    @Test
    public void testSupportedDevice_EEAVersion_OxygenOS951GM21BA() {
        String testDataDir = "op7pro-eea";
        String testDataOfVersion = "9.5.1.GM21BA";

        Assert.assertTrue(isSupportedDevice(
                testDataDir,
                testDataOfVersion,
                "OnePlus7Pro_EEA",
                "OnePlus 7 Pro",
                "OnePlus7Pro",
                "9.5.1.GM21BA",
                "OnePlus7ProOxygen_21.E.05_GLO_005_1904250312",
                true)
        );

        Assert.assertEquals("OnePlus 7 Pro (EU)", getSupportedDevice(testDataDir, testDataOfVersion).getName());
    }

    /*
     * Test if International (intl) model is correctly detected by the app.
     * Note: All variants of OP7 Pro are incorrectly detected as this variant by app versions 1.0.0 - 2.3.2
     * However: as nobody is going to use such old OU versions on OP7+, this is acceptable
     */
    @Test
    public void testSupportedDevice_INTLVersion_OxygenOS953GM21AA() {
        String testDataDir = "op7pro-intl";
        String testDataOfVersion = "9.5.3.GM21AA";

        Assert.assertTrue(isSupportedDevice(
                testDataDir,
                testDataOfVersion,
                "OnePlus7Pro",
                "OnePlus 7 Pro",
                "OnePlus7Pro",
                "9.5.3.GM21AA",
                "OnePlus7ProOxygen_21.O.07_GLO_007_1905120542",
                true)
        );

        Assert.assertEquals("OnePlus 7 Pro (INTL)", getSupportedDevice(testDataDir, testDataOfVersion).getName());
    }
}
