package com.bercut.course;

import static java.util.Arrays.*;

public class Property {
    private String name;
    private Double[] values = new Double[10];
    int indexValue = 0;

    public void SetName(String name){
        this.name = name;
    }

    public void SetValueOnce(double value){
        this.values[0] = value;
    }

    public void AddValue(double value){
        this.values[indexValue++] = value;
    }

    public Double GetMinValue(){
        sort(values, 0, indexValue);
        return values[0];
    }

    private String ArrayToString(Double[] values){
        StringBuilder result = new StringBuilder("{");
        for(Double value: values) {
            if(value == null){
                break;
            }
            result.append(value).append(", ");
        }
        result.replace(result.length()-2,result.length(), "}");
        return result.toString();
    }

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", value=" + ArrayToString(values) +
                '}';
    }
}
