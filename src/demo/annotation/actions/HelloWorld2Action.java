package demo.annotation.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespaces(value={@Namespace("/demo"), @Namespace("/")})
@Action(value="hello2", results={
	@Result(name="success", location="/HelloWorld.jsp"),
	@Result(name="error", location="/AccessDenied.jsp")
})
@InterceptorRefs(value={@InterceptorRef("params"), @InterceptorRef("timer")})
public class HelloWorld2Action extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String name;
    
    @Override
    public String execute() throws Exception {
    	name = "HelloWorld2Action";
        return SUCCESS;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
