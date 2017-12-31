
package dnb.atm.utils;

import java.text.DecimalFormat;

import org.apache.log4j.Logger;

/**
 * common function for project
 * 
 * @author phuctd.lt
 */
public class CommonFuntion {
    private static Logger LOG = Logger.getLogger(CommonFuntion.class);

    /**
     * check empty with parameter is object
     * 
     * @author phuctd.lt
     */
    public static final boolean isEmpty(Object obj) {
        return obj == null;
    }

    /**
     * check empty with parameter is String
     * 
     * @author phuctd.lt
     */
    public static final boolean isEmpty(final String str) {
        return str == null || Constants.EMPTY.equals(str.trim());
    }

    public static final String formatNumber(int amount) {
        DecimalFormat myFormatter = new DecimalFormat("#,###");
        if (!isEmpty(amount)) {
            return myFormatter.format(amount);
        }
        return Constants.EMPTY;
    }
    /**
     * Parse from String To JsonString.
     * 
     * @param jsonResult JSONObject
     * @return String JsonString
     * @author phuctd.lt
     */
    /*
     * public static String parseToJsonString(JSONObject js)throws
     * ConnectException{ String json = Constants.EMPTY; ObjectMapper mapper =
     * new ObjectMapper(); try { json = mapper.writeValueAsString(js); } catch
     * (JsonGenerationException e) { // TODO Auto-generated catch block
     * e.printStackTrace(); } catch (JsonMappingException e) { // TODO
     * Auto-generated catch block e.printStackTrace(); } catch (IOException e) {
     * // TODO Auto-generated catch block e.printStackTrace(); } return json; }
     */
}
