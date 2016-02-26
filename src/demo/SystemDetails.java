package demo;

import com.opensymphony.xwork2.Action;

public class SystemDetails implements Action {

    private Environment environment = new Environment("Development");
    private String operatingSystem = "Windows 7";
    
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public Environment getEnvironment() {
        return environment;
    }
    
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
    
    public String getOperatingSystem() {
        return operatingSystem;
    }
    
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
