package bazaar;

import ai.meandering.bazaar.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    If the intent is to have a map of children for ease of access to use this,
    Or if the intent is to have an invisible abstraction for a group of nodes.
 */
public class MyHttpNodeList {
    private Map<String, MyHttpNode> list;
    private String latest_key = "a";

    public MyHttpNodeList() {
        this.list = new HashMap<>();
    }

    public MyHttpNodeList(MyHttpNode node) {
        this.list = new HashMap<>();
        this.list.put(this.latest_key, node);
    }

    public MyHttpNodeList(MyHttpNode... nodes) {
        this.list = new HashMap<>();
        for(MyHttpNode node : nodes) {
            this.list.put(this.latest_key, node);
            this.latest_key = Utils.nextLexicographicalString(this.latest_key);
        }
    }

    public int size() {
        return this.list.size();
    }

    public void put(String key, MyHttpNode node) {
        this.latest_key = key;
        this.list.put(this.latest_key, node);
    }

    // breaks keys
    public void add(MyHttpNodeList list) {
        for(Map.Entry<String, MyHttpNode> entry : list.entrySet()) {
            this.list.put(this.latest_key, entry.getValue());
            this.latest_key = Utils.nextLexicographicalString(this.latest_key);
        }

    }

    // breaks keys
    public void add(MyHttpNodeList... lists) {
        for(MyHttpNodeList list : lists) {
            this.add(list);
        }
    }

    public void add(MyHttpNode node) {
        this.list.put(this.latest_key, node);
        this.latest_key = Utils.nextLexicographicalString(this.latest_key);
    }

    public void add(MyHttpNode... nodes) {
        for(MyHttpNode node : nodes) {
            this.list.put(this.latest_key, node);
            this.latest_key = Utils.nextLexicographicalString(this.latest_key);
        }
    }

    public MyHttpNode get(String key) {
        return this.list.get(key);
    }

    public Set<Map.Entry<String, MyHttpNode>> entrySet() {
        return this.list.entrySet();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, MyHttpNode> entry : this.list.entrySet()) {
            if(entry.getValue() == null) {
                continue;
            }
            sb.append(entry.getValue().toString());
        }
        return sb.toString();
    }

}
