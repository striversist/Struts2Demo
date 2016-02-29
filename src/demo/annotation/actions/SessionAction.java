package demo.annotation.actions;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class SessionAction extends ActionSupport implements SessionAware {

    private static final long serialVersionUID = 1L;
    private Map<String, Object> session;

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Action("session")
    public void doSession() {
        if (session == null) {
            System.err.println("session is null");
            return;
        }
        String key = (String) session.get("key");
        if (key == null) {
            session.put("key", "123abc");
        } else {
            System.out.println("key from session: " + key);
        }
    }

}
