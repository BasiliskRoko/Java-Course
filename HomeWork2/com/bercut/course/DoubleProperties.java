package com.bercut.course;

import static java.util.Arrays.*;

public class DoubleProperties{
    Property[] properties = new Property[10];
    int index_property = 0;
    static DoubleProperties doubleProperties;

    void AddProperties(String name, double value){
        Property property = new Property();
        property.SetName(name);
        property.SetValueOnce(value);
        properties[index_property++] = property;
    }

    void AddProperties(String name, String values){
        Property property = new Property();
        property.SetName(name);
        for(String value :values.split(",")){
            property.AddValue(Double.parseDouble(value));
        }

        properties[index_property++] = property;
    }

    Property getMinProperty(){
        sort(properties, 0, index_property, new SortByProperty());
        return properties[0];
    }

    public static void main(String... args) {
        if(args.length != 1)
            return;

        doubleProperties = new DoubleProperties();

        String[] parameters = args[0].split(";");
        for(String parameter: parameters){
            String[] keyValue = parameter.split("=");
            if(keyValue.length != 2)
                continue;
            doubleProperties.AddProperties(keyValue[0], keyValue[1]);
        }

        for(Property parameter: doubleProperties.properties) {
            if(parameter != null)
                System.out.println(parameter);
        }

        System.out.println("Minimum property: " + doubleProperties.getMinProperty().toString());
    }
}

