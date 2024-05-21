package export_config;

public class ExportConfig {
    final String fileName;
   final String fileHeader;

    public ExportConfig(String fileName,String fileHeader) {
        this.fileName = fileName;
        this.fileHeader = fileHeader;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileHeader() {
        return fileHeader;
    }
}
