package demo;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class EnvironmentConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map context, String[] values, Class clazz) {
        Environment environment = new Environment(values[0]);
        return environment;
    }

    @Override
    public String convertToString(Map context, Object value) {
        Environment environment = (Environment) value;
        return environment == null ? null : environment.getName();
    }

}
