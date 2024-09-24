package com.espirit.modules.to_be_renamed.connector;

import com.espirit.modules.to_be_renamed.To_be_renamedPOJO;
import com.espirit.modules.to_be_renamed.project.To_be_renamedProjectApp;
import com.espirit.modules.to_be_renamed.project.To_be_renamedProjectConfig;
import de.espirit.firstspirit.agency.SpecialistsBroker;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class To_be_renamedConnector {

    //connector class to take all third party API communication

    private static final Class<?> LOGGER = To_be_renamedConnector.class;

    private static To_be_renamedConnector connector = null;

    private String var1;
    private String var2;

    //get a connector instance using a service broker to get all information from the project app config panel
    public static To_be_renamedConnector getInstance(SpecialistsBroker broker) throws IOException {

        if (connector != null) {
            return connector;
        } else {
            connector = new To_be_renamedConnector(broker);
            return connector;
        }
    }

    //get a connector instance with manual values
    public static To_be_renamedConnector getInstance(String var1, String var2) throws IOException {

        if (connector != null) {
            return connector;
        } else {
            connector = new To_be_renamedConnector(var1, var2);
            return connector;
        }
    }

    //constructor with project app config panel values
    private To_be_renamedConnector(SpecialistsBroker broker) {

        this.var1 = To_be_renamedProjectConfig.values(broker, To_be_renamedProjectApp.class).getString(To_be_renamedProjectConfig.VAR_1);
        this.var2 = To_be_renamedProjectConfig.values(broker, To_be_renamedProjectApp.class).getString(To_be_renamedProjectConfig.VAR_2);

    }

    //constructor with manual values if needed
    private To_be_renamedConnector(String var1, String var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    //implement some methods to communicate with some third party API

    public List<To_be_renamedPOJO> getSomeData(String filterBySomething) {

        //replace this getSomeData method with meaningful name and an appropriate filter criteria

        ArrayList<To_be_renamedPOJO> to_be_renamedList = new ArrayList<To_be_renamedPOJO>();
        To_be_renamedPOJO to_be_renamedItem = new To_be_renamedPOJO(this.var1);
        to_be_renamedList.add(to_be_renamedItem);

        return to_be_renamedList;
    }

    public List<To_be_renamedPOJO> getSomeData(Collection<String> filterBySomethingMultiple) {

        //call the single filter method above for demo purposes
        //replace this getSomeData method with a meaningful name and some appropriate filter criterias

        return getSomeData("");
    }

}
