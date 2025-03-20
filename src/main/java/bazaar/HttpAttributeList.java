package bazaar;


import java.util.ArrayList;
import java.util.List;

public class HttpAttributeList {
    private List<HttpAttributePair> pairs;

    public HttpAttributeList() {
        this.pairs = new ArrayList<>();
    }

    public HttpAttributeList(HttpAttributePair... attributePairs) {
        this.pairs = new ArrayList<>();
        for(HttpAttributePair attributePair : attributePairs) {
            this.pairs.add(attributePair);
        }
    }

    public boolean isEmpty() {
        return this.pairs.isEmpty();
    }

    public int length() {
        return this.pairs.size();
    }

    public void add(HttpAttributePair attributePair) {
        this.pairs.add(attributePair);
    }

    public boolean contains(HttpNormalAttribute attribute) {
        for(HttpAttributePair pair : this.pairs ) {
            if(pair.matchesTag(attribute)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(HttpSpecialAttribute attribute) {
        for(HttpAttributePair pair : this.pairs ) {
            if(pair.matchesTag(attribute)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(HttpGlobalAttribute attribute) {
        for(HttpAttributePair pair : this.pairs ) {
            if(pair.matchesTag(attribute)) {
                return true;
            }
        }
        return false;
    }

    public String key(HttpNormalAttribute attribute) throws RuntimeException {
        for(HttpAttributePair pair : this.pairs ) {
            if(pair.matchesTag(attribute)) {
                return pair.getKey();
            }
        }
        throw new RuntimeException("Could not find key.");
    }

    public String key(HttpSpecialAttribute attribute) throws RuntimeException {
        for(HttpAttributePair pair : this.pairs ) {
            if(pair.matchesTag(attribute)) {
                return pair.getKey();
            }
        }
        throw new RuntimeException("Could not find key.");
    }

    public String key(HttpGlobalAttribute attribute) throws RuntimeException {
        for(HttpAttributePair pair : this.pairs ) {
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
