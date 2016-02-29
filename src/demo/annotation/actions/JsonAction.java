package demo.annotation.actions;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.json.JSONException;
import org.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

public class JsonAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Action("json1")
	public void doJson1() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = createJsonObject("from json1");
		out.println(jsonObject.toString());
		out.flush();
		out.close();
	}
	
	@Action(value="json2", results={@Result(name="success", location="/json.jsp")})
	public String doJson2() throws Exception {
		JSONObject jsonObject = createJsonObject("from json2");
		ServletActionContext.getRequest().setAttribute("data", jsonObject.toString());
		return SUCCESS;
	}
	
	private JSONObject createJsonObject(String msg) {
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("result", 0);
			jsonObject.put("id", "123");
			jsonObject.put("name", "aaron");
			jsonObject.put("password", "pwd123");
			jsonObject.put("msg", "hello world " + msg);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return jsonObject;
	}
}
