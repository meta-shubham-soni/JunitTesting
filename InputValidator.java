
public class InputValidator {
	
	/**find is val is integer or not
	 * @param val
	 * @return boolean value
	 */
	public static boolean isInt(String val){
	    try
	    {
	        Integer.parseInt(val);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	    	System.out.println("Please enter integer");
	        return false;
	    }
	    
	}
	
	/**find is val is float or not
	 * @param val
	 * @return boolean value
	 */
	public static boolean isFloat(String val){
	    try
	    {
	        Float.parseFloat(val);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	    	System.out.println("Please enter float");
	        return false;
	    }
	    
	}
	
	/**find is val is double or not
	 * @param val
	 * @return boolean value
	 */
	public static boolean isDouble(String val){
	    try
	    {
	        Double.parseDouble(val);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	    	System.out.println("Please enter double");
	        return false;
	    }
	    
	}
	
}
