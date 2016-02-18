package demo;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action {

    private String name;
    
    @Override
    public String execute() throws Exception {
        System.out.println("Inside action...");
        if ("secret".equals(name)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
