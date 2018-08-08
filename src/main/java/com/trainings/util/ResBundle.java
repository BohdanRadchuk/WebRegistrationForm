package com.trainings.util;


import java.util.Locale;
import java.util.ResourceBundle;

public class ResBundle {
    private static final String PROPERTY_FILE_NAME = "db_connection";

    private static volatile ResBundle resBundle = null;
    public static ResourceBundle resourceBundle;

    private ResBundle(String locale) {
        //Locale.setDefault(Locale.US);
        //Locale.setDefault(new Locale(locale));
        //, Locale.getDefault()
        resourceBundle = ResourceBundle.getBundle(PROPERTY_FILE_NAME);
    }
    /*D:/java/EPAM/HomeWorks/WebRegistrationForm/src/main/java/com"constants"
    /*"/src/main/java/com/resources/constants"*/

    public static ResBundle getBundleInstance(String locale) {
        if (resBundle == null) {
            synchronized (ResBundle.class) {
                if (resBundle == null) {
                    resBundle = new ResBundle(locale);
                }
            }
        }
        return resBundle;
    }

    public ResourceBundle getResource (){
        return resourceBundle;
    }

}
