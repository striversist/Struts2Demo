package demo.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private static final String FILE_PATH = "G:\\Projects\\J2EE\\Struts2Demo\\downloads\\light.jpg";
    private InputStream fileInputStream;
    private String downloadFileName;

    @Action(value="download", results={
        @Result(name="success", type="stream", params={"contentType", "application/octet-stream",
                "inputName", "fileInputStream", "contentDisposition", "attachment;filename=${downloadFileName}",
                "bufferSize", "4096"})
    })
    public String download() throws Exception {
        System.out.println("GET PARAMETERS: downloadFileName=" + downloadFileName);
        File downloadFile = new File(FILE_PATH);
        fileInputStream = new FileInputStream(downloadFile);
        
        return SUCCESS;
    }
    
    public InputStream getFileInputStream() {
        return fileInputStream;
    }
    
    public void setDownloadFileName(String downloadFileName) {
        this.downloadFileName = downloadFileName;
    }
    
    public String getDownloadFileName() {
        return downloadFileName;
    }
}
