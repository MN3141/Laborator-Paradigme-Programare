package org.example;

import export_config.*;
import exporter.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExportConfig config0 = new ExportConfig("log.txt","Last date:1998");
        ExportConfig config1= new ExportConfig("inventory.xlsx","IPRS items inventory");
        List<String> values=new ArrayList<>() ;
        values.add("1231");
        values.add("11111");
        Exporter exporter0=new Exporter(config0,values);
        values.add("2222");
        Exporter exporter1=new Exporter(config1,values);
        exporter0.export();
        exporter1.export();

    }
}