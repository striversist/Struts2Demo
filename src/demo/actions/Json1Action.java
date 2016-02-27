package demo.actions;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

public class Json1Action extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Action("json1")
	public void doJson() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("result", 0);
		jsonObject.put("id", "123");
		jsonObject.put("name", "aaron");
		jsonObject.put("password", "pwd123");
		jsonObject.put("msg", "hello world!");
		out.println(jsonObject.toString());
		out.flush();
		out.close();
	}
}
