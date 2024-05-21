package exporter;

import export_config.*;

import java.util.ArrayList;
import java.util.List;

public class Exporter {
    ExportConfig config;
   final List<String> values;
    public Exporter(ExportConfig config,List<String> values) {
        this.values= new ArrayList<>(values);
        this.config=new ExportConfig(config.getFileName(),config.getFileHeader());
    }
    public void export()
    {
        System.out.println(this.config.getFileName());
        System.out.println(this.config.getFileHeader());
        for(int i=0;i<this.values.size();i++)
            System.out.println(this.values.get(i));
    }
}
