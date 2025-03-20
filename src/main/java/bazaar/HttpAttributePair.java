package bazaar;

public class HttpAttributePair {
    private HttpGlobalAttribute gAttribute;
    private HttpNormalAttribute hAttribute;
    private HttpSpecialAttribute sAttribute;
    private String key;

    public HttpAttributePair(HttpGlobalAttribute attribute) {
        this.gAttribute = attribute;
        this.hAttribute = null;
        this.sAttribute = null;
        this.key = null;
    }

    public HttpAttributePair(HttpNormalAttribute attribute) {
        this.gAttribute = null;
        this.hAttribute = attribute;
        this.sAttribute = null;
        this.key = null;
    }

    public HttpAttributePair(HttpSpecialAttribute attribute) {
        this.gAttribute = null;
        this.hAttribute = null;
        this.sAttribute = attribute;
        this.key = null;
    }

    public HttpAttributePair(HttpGlobalAttribute attribute, String key) {
        this.gAttribute = attribute;
        this.hAttribute = null;
        this.sAttribute = null;
        this.key = key;
    }
    public HttpAttributePair(HttpNormalAttribute attribute, String key) {
        this.gAttribute = null;
        this.hAttribute = attribute;
        this.sAttribute = null;
        this.key = key;
    }

    public HttpAttributePair(HttpSpecialAttribute attribute, String key) {
        this.gAttribute = null;
        this.hAttribute = null;
        this.sAttribute = attribute;
        this.key = key;
    }

    public boolean matchesTag(HttpNormalAttribute attribute) {
        return this.hAttribute == attribute;
    }

    public boolean matchesTag(HttpSpecialAttribute attribute) {
        return this.sAttribute == attribute;
    }

    public boolean matchesTag(HttpGlobalAttribute attribute) {
        return this.gAttribute == attribute;
    }

    public String getKey() {
        return this.key;
    }

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
