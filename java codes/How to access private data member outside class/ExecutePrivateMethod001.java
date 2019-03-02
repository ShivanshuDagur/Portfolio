import java.lang.reflect.Method;

public class ExecutePrivateMethod001 
{
	public static void main(String[] args) 
	{
		String className = "Doo";
		
		try 
		{
		// load the class
		Class obj = Class.forName(className);
		
		String methodName = "fx1";
		Class[] param = {};
		
		// lets provide the info of method
		Method m = obj.getDeclaredMethod(methodName, param);
		
		// lets make this method access able
		m.setAccessible(true);
		
		Doo d = new Doo();
		Object[] methodArgs = {};
		
		// call the method
		m.invoke(d, methodArgs);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
		
	}
}
