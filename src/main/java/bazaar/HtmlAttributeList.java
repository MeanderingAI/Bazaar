package bazaar;


import java.util.ArrayList;
import java.util.List;

/**
 * The possible attributes to an html node
 * <xml {attribute_list}>
 * </xml>
 * 
 * https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes
 */
public class HtmlAttributeList {
    private List<HtmlAttributePair> pairs;

    public HtmlAttributeList() {
        this.pairs = new ArrayList<>();
    }

    public HtmlAttributeList(HtmlAttributePair... attributePairs) {
        this.pairs = new ArrayList<>();
        for(HtmlAttributePair attributePair : attributePairs) {
            this.pairs.add(attributePair);
        }
    }

    public boolean isEmpty() {
        return this.pairs.isEmpty();
    }

    public int length() {
        return this.pairs.size();
    }

    public void add(HtmlAttributePair attributePair) {
        this.pairs.add(attributePair);
    }

    public boolean contains(HtmlNormalAttribute attribute) {
        for(HtmlAttributePair pair : this.pairs ) {
            if(pair.matchesTag(attribute)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(HtmlSpecialAttribute attribute) {
        for(HtmlAttributePair pair : this.pairs ) {
            if(pair.matchesTag(attribute)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(HtmlGlobalAttribute attribute) {
        for(HtmlAttributePair pair : this.pairs ) {
            if(pair.matchesTag(attribute)) {
                return true;
            }
        }
        return false;
    }

    public String key(HtmlNormalAttribute attribute) throws RuntimeException {
        for(HtmlAttributePair pair : this.pairs ) {
            if(pair.matchesTag(attribute)) {
                return pair.getKey();
            }
        }
        throw new RuntimeException("Could not find key.");
    }

    public String key(HtmlSpecialAttribute attribute) throws RuntimeException {
        for(HtmlAttributePair pair : this.pairs ) {
            if(pair.matchesTag(attribute)) {
                return pair.getKey();
            }
        }
        throw new RuntimeException("Could not find key.");
    }

    public String key(HtmlGlobalAttribute attribute) throws RuntimeException {
        for(HtmlAttributePair pair : this.pairs ) {
            if(pair.matchesTag(attribute)) {
                return pair.getKey();
            }
        }
        throw new RuntimeException("Could not find key.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < this.pairs.size(); j++) {
            sb.append(" ");
            sb.append(this.pairs.get(j).toString());
        }
        return sb.toString();
    }
}
