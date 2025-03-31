package bazaar;

import bazaar.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    If the intent is to have a map of children for ease of access to use this,
    Or if the intent is to have an invisible abstraction for a group of nodes.
 */
public class HtmlNodeList {
    private Map<String, HtmlNode> list;
    private String latest_key = "a";

    public HtmlNodeList() {
        this.list = new HashMap<>();
    }

    public HtmlNodeList(HtmlNode node) {
        this.list = new HashMap<>();
        this.list.put(this.latest_key, node);
    }

    public HtmlNodeList(HtmlNode... nodes) {
        this.list = new HashMap<>();
        for(HtmlNode node : nodes) {
            this.list.put(this.latest_key, node);
            this.latest_key = Utils.nextLexicographicalString(this.latest_key);
        }
    }

    public int size() {
        return this.list.size();
    }

    public void put(String key, HtmlNode node) {
        this.latest_key = key;
        this.list.put(this.latest_key, node);
    }

    // breaks keys
    public void add(HtmlNodeList list) {
        for(Map.Entry<String, HtmlNode> entry : list.entrySet()) {
            this.list.put(this.latest_key, entry.getValue());
            this.latest_key = Utils.nextLexicographicalString(this.latest_key);
        }

    }

    // breaks keys
    public void add(HtmlNodeList... lists) {
        for(HtmlNodeList list : lists) {
            this.add(list);
        }
    }

    public void add(HtmlNode node) {
        this.list.put(this.latest_key, node);
        this.latest_key = Utils.nextLexicographicalString(this.latest_key);
    }

    public void add(HtmlNode... nodes) {
        for(HtmlNode node : nodes) {
            this.list.put(this.latest_key, node);
            this.latest_key = Utils.nextLexicographicalString(this.latest_key);
        }
    }

    public HtmlNode get(String key) {
        return this.list.get(key);
    }

    public Set<Map.Entry<String, HtmlNode>> entrySet() {
        return this.list.entrySet();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, HtmlNode> entry : this.list.entrySet()) {
            if(entry.getValue() == null) {
                continue;
            }
            sb.append(entry.getValue().toString());
        }
        return sb.toString();
    }

}
