package bazaar;

import bazaar.HtmlAttribute;

/*
 * HttpAttributePair is a wrapper for
 * HttpGlobalAttribute, HttpNormalAttribute, HttpSpecialAttribute
 * This class is used with HttpAttributeList.
 */
public class HtmlAttributePair {
    private HtmlAttribute attribute;
    private String key;

    /*
     * @param attribute
     * 
     */
    public HtmlAttributePair(HtmlAttribute attribute) {
        this.attribute = attribute;
        this.key = null;
    }
    
    /**
     * 
     */
    public HtmlAttributePair(String attribute, String key) {
        this.attribute = HtmlAttribute.fromString(attribute);
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
    public HtmlAttributePair(HtmlAttribute attribute, String key) {
        this.attribute = attribute;
        this.key = key;
    }

    /*
     * @param the attribute to match against
     * @return true if the attribute matches
     */
    public boolean matchesTag(HtmlAttribute attribute) {
        return this.attribute == attribute;
    }

    /*
     * @return the key value in the attribute pair
     */
    public String getKey() {
        return this.key;
    }

    public String toHeaderString() {
        String qq = this.attribute.getValue();
        if (this.key != null) {
            qq = qq + ": ";
            qq = qq + this.key;
        }
        return qq;
    }

    /*
     * @return a string representation of the attribute pair
     * 
     * May throw a RuntimeException if no attributes are set.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.attribute);
        if (this.key != null) {
            sb.append('=');
            sb.append(this.key);
        }
        return sb.toString();
    }
}
