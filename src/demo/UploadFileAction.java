package demo;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.Action;

public class UploadFileAction implements Action {

    private File myFile;
    private String myFileContentType;
    private String myFileFileName;
    
    @Override
    public String execute() throws Exception {
        try {
            if (myFile == null) {
                System.out.println("file is null");
                return ERROR;
            }
            
            String destPath = System.getProperty(PathConfiguration.UPLOAD_PATH);
            System.out.println("Src file name: " + myFile);
            System.out.println("Dst file name: " + myFileFileName);
            
            File destFile = new File(destPath, myFileFileName);
            FileUtils.copyFile(myFile, destFile);;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
        
        return SUCCESS;
    }

    public File getMyFile() {
        return myFile;
    }
    
    public void setMyFile(File file) {
        this.myFile = file;
    }
    
    public String getMyFileContentType() {
        return myFileContentType;
    }
    
    public void setMyFileContentType(String contentType) {
        this.myFileContentType = contentType;
    }
    
    public String getMyFileFileName() {
        return myFileFileName;
    }
    
    public void setMyFileFileName(String fileName) {
        this.myFileFileName = fileName;
    }
}
