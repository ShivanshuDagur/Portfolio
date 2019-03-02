import java.lang.reflect.Method;

public class ExecutePrivateMethod002 
{
	public static void main(String[] args) 
	{
		String className = "Doo";
		
		try 
		{
		// load the class
		Class obj = Class.forName(className);
		
		String methodName = "fx2";
		Class[] param = {int.class, float.class, String.class};
		
		// lets provide the info of method
		Method m = obj.getDeclaredMethod(methodName, param);
		
		// lets make this method access able
		m.setAccessible(true);
		
		Doo d = new Doo();
		Object[] methodArgs = {100,200.0f,""};
		
		// call the method
		String str = (String)m.invoke(d, methodArgs);
			
		System.out.println(str);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
		
	}
}
