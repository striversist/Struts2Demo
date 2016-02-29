package demo.annotation.actions;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("json-default")
public class Json3Action extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	// 这里指定将被Struts2序列化的属性，该属性在action中必须有对应的getter方法
	private Map<String, Object> dataMap = new HashMap<>();

	@Action(value="json3", results={@Result(type="json", params={"root", "dataMap"})})
	public String doJson3() throws Exception {
		dataMap.clear();
		dataMap.put("result", 0);
		dataMap.put("id", "123");
		dataMap.put("name", "aaron");
		dataMap.put("password", "pwd123");
		dataMap.put("msg", "hello world from json3");
		return SUCCESS;
	}
	
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
}
