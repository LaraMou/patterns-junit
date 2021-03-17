package com.patterns.mockito;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

/*
 Ejecutaría todos los test desde esta clase que estén dentro del paquete creational e iterator y que  la
 clase o método contenga la Tag "database"
* */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.patterns.mockito")
@SuiteDisplayName("Suite patrones mockito")
public class SuiteTest {
}
