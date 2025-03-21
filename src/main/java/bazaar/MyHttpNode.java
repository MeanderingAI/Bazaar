package bazaar;

import java.util.Map;

/**
 * Represents a node in an HTML document.
 */
public class MyHttpNode {
    private HttpTagWrapper httpTagWrapper;
    private HttpAttributeList attributes;
    private HttpInputType inputType;
    private MyHttpNodeList children;
    private String inner_content;
    private boolean single_tag;

    /**
     * Default constructor
     * Should only be used for testing
     */
    public MyHttpNode() {
        this.httpTagWrapper = new HttpTagWrapper(HttpTag.ERROR);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.children = new MyHttpNodeList();
        this.inner_content = "";
        this.single_tag = false;
    }

    /**
     * @param httpTag Tag of the node.
     */
    public MyHttpNode(HttpTag httpTag) {
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }

    /**
     * @param httpTagWrapper of the node.
     */
    public MyHttpNode(HttpTagWrapper httpTagWrapper) {
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = httpTagWrapper;
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }
    
    /**
     * @param httpTag of the node.
     * @param single_tag if the node is a single tag.
     * 
     * If single_tag is set to true node is self-closing
     * Example: <br />
     */
    public MyHttpNode(HttpTag httpTag, boolean single_tag) {
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = single_tag;
    }

    /**
     * Constructs a node which has the tag and attributePair provided
     * @param httpTag
     * @param attribute
     */
    public MyHttpNode(HttpTag httpTag, HttpAttributePair attribute) {
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.attributes.add(attribute);
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }

    /**
     * Constructs a node which has the tag provided
     * @param httpTag
     * @param inner_content content inside the node
     */
    public MyHttpNode(HttpTag httpTag, String inner_content) {
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.inner_content = inner_content;
        this.single_tag = false;
    }

    /**
     * Constructs a node which has the tag provided
     * @param httpTag
     * @param inputType 
     */
    public MyHttpNode(HttpTag httpTag, HttpInputType inputType) {
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = inputType;
        this.inner_content = "";
        this.single_tag = false;
    }
    
    /**
     * Constructs a node which has the tag provided
     * @param httpTag
     * @param inputType 
     */
    public MyHttpNode(HttpTag httpTag, HttpInputType inputType, String inner_content) {
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = inputType;
        this.inner_content = inner_content;
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, boolean single_tag, HttpAttributePair... pairs) {
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        for(HttpAttributePair pair : pairs) {
            this.attributes.add(pair);
        }
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = single_tag;
    }

    public MyHttpNode(HttpTag httpTag, HttpAttributePair... pairs) {
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        for(HttpAttributePair pair : pairs) {
            this.attributes.add(pair);
        }
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }


    public MyHttpNode(HttpTag httpTag, boolean single_tag, HttpAttributeList list) {
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = list;
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = single_tag;
    }

    public MyHttpNode(HttpTag httpTag, MyHttpNode child) {
        this.children = new MyHttpNodeList();
        this.children.add(child);

        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, MyHttpNodeList childrenList) {
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.children = childrenList;
        this.inner_content = "";
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, HttpAttributePair attribute, String inner_content) {
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.attributes.add(attribute);
        this.inputType = null;
        this.children = new MyHttpNodeList();
        this.inner_content = inner_content;
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, HttpAttributePair attribute, MyHttpNode child) {
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.attributes.add(attribute);
        this.inputType = null;
        this.children = new MyHttpNodeList();
        this.children.add(child);
        this.inner_content = "";
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, MyHttpNode... myHttpNode) {this.listNode = false;
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.children = new MyHttpNodeList();
        for(MyHttpNode node : myHttpNode) {
            this.children.add(node);
        }
        this.inner_content = "";
        this.single_tag = false;
    }

    /**
     * @param e new node to add as child
     */
    public void add(MyHttpNode e) {
        this.children.add(e);
    }

    /**
     * 
     * @param es nodes to add as children
     */
    public void add(MyHttpNode... es) {
        for(MyHttpNode e : es) {
            this.children.add(e);
        }
    }

    /**
     * @param list list of nodes to add as children
     */
    public void add(MyHttpNodeList list) {
        for(Map.Entry<String, MyHttpNode> entry : list.entrySet()) {
            this.children.add(entry.getValue());
        }
    }
    
    /**
     * @param lists list of nodes to add as children
     */
    public void add(MyHttpNodeList... lists) {
        for(MyHttpNodeList list : lists) {
            this.add(list);
        }
    }

    /**
     * @param lists list of nodes to add as children
     */
    public void SetInnerContent(String inner_content) {
        this.inner_content = inner_content;
    }

    /**
     * @return String representation of the opening tag
     */
    private String toOpenTag() {
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        sb.append(this.httpTagWrapper.toString());

        if(this.attributes != null || !this.attributes.isEmpty()) {
            sb.append(this.attributes.toString());
        }

        if (this.inputType != null) {
            sb.append(' ');
            sb.append(this.inputType.toString());
        }

        sb.append('>');

        return sb.toString();
    }

    /**
     * @return String representation of the closing tag
     */
    private String toClosingTag() {
        StringBuilder sb = new StringBuilder();
        sb.append("</");
        sb.append(this.httpTagWrapper.toString());
        sb.append('>');
        return sb.toString();
    }

    /**
     * @return String representation of the node
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.toOpenTag());
        if (!this.single_tag) {
            if (this.inner_content != "") {
                sb.append(this.inner_content);
            }
            if (this.children != null && this.children.size() != 0) {
                sb.append(this.children.toString());
            }
            sb.append(this.toClosingTag());
        }
        return sb.toString();
    }

}
