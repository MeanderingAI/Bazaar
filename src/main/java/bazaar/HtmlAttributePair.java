package bazaar;

/*
 * HttpAttributePair is a wrapper for
 * HttpGlobalAttribute, HttpNormalAttribute, HttpSpecialAttribute
 * This class is used with HttpAttributeList.
 */
public class HtmlAttributePair {
    private HtmlGlobalAttribute gAttribute;
    private HtmlNormalAttribute hAttribute;
    private HtmlSpecialAttribute sAttribute;
    private String key;

    /*
     * @param attribute
     * 
     * Construct a pair with a global attribute.
     * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/
     */
    public HtmlAttributePair(HtmlGlobalAttribute attribute) {
        this.gAttribute = attribute;
        this.hAttribute = null;
        this.sAttribute = null;
        this.key = null;
    }
    
    /*
     * @param attribute
     * 
     * Construct a pair with a normal attribute.
     * https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes
     */
    public HtmlAttributePair(HtmlNormalAttribute attribute) {
        this.gAttribute = null;
        this.hAttribute = attribute;
        this.sAttribute = null;
        this.key = null;
    }
    
    /*
     * @param attribute
     * 
     * Construct a pair with a special attribute.
     */
    public HtmlAttributePair(HtmlSpecialAttribute attribute) {
        this.gAttribute = null;
        this.hAttribute = null;
        this.sAttribute = attribute;
        this.key = null;
    }

    public HtmlAttributePair(HtmlGlobalAttribute attribute, String key) {
        this.gAttribute = attribute;
        this.hAttribute = null;
        this.sAttribute = null;
        this.key = key;
    }
    public HtmlAttributePair(HtmlNormalAttribute attribute, String key) {
        this.gAttribute = null;
        this.hAttribute = attribute;
        this.sAttribute = null;
        this.key = key;
    }

    /*
     * @param attribute the attribute to declare 
     * @param key the value of the attribute
     * 
     * Construct a pair with a special attribute.
     * <xml attribute="key">
     * </xml>
     */
    public HtmlAttributePair(HtmlSpecialAttribute attribute, String key) {
        this.gAttribute = null;
        this.hAttribute = null;
        this.sAttribute = attribute;
        this.key = key;
    }

    /*
     * @param attribute the attribute to match against
     * @return true if the attribute matches
     */
    public boolean matchesTag(HtmlNormalAttribute attribute) {
        return this.hAttribute == attribute;
    }

    /*
     * @param attribute the attribute to match against
     * @return true if the attribute matches
     */
    public boolean matchesTag(HtmlSpecialAttribute attribute) {
        return this.sAttribute == attribute;
    }

    /*
     * @param attribute the attribute to match against
     * @return true if the attribute matches
     */
    public boolean matchesTag(HtmlGlobalAttribute attribute) {
        return this.gAttribute == attribute;
    }
    
    /*
     * @return the key value in the attribute pair
     */
    public String getKey() {
        return this.key;
    }

    /*
     * @return a string representation of the attribute pair
     * 
     * May throw a RuntimeException if no attributes are set.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.gAttribute != null) {
            sb.append(this.gAttribute.toString());
        } else if(this.hAttribute != null) {
            sb.append(this.hAttribute.toString());
        } else if(this.sAttribute != null){
            sb.append(this.sAttribute.toString());
        } else {
            throw new RuntimeException("No attributes set.");
        }

        if (this.key != null) {
            sb.append('=');
            sb.append(this.key);
        }
        return sb.toString();
    }
}
