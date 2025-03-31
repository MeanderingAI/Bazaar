package bazaar;

import java.util.Map;

/**
 * Represents a node in an HTML document.
 */
public class HtmlNode {
    private HtmlTagWrapper httpTagWrapper;
    private HtmlAttributeList attributes;
    private HtmlInputType inputType;
    private HtmlNodeList children;
    private String inner_content;
    private boolean single_tag;

    /**
     * Default constructor
     * Should only be used for testing
     */
    public HtmlNode() {
        this.httpTagWrapper = new HtmlTagWrapper(HtmlTag.ERROR);
        this.attributes = new HtmlAttributeList();
        this.inputType = null;
        this.children = new HtmlNodeList();
        this.inner_content = "";
        this.single_tag = false;
    }

    /**
     * @param httpTag Tag of the node.
     */
    public HtmlNode(HtmlTag httpTag) {
        this.children = new HtmlNodeList();
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }

    /**
     * @param httpTagWrapper of the node.
     */
    public HtmlNode(HtmlTagWrapper httpTagWrapper) {
        this.children = new HtmlNodeList();
        this.httpTagWrapper = httpTagWrapper;
        this.attributes = new HtmlAttributeList();
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
    public HtmlNode(HtmlTag httpTag, boolean single_tag) {
        this.children = new HtmlNodeList();
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = single_tag;
    }

    /**
     * Constructs a node which has the tag and attributePair provided
     * @param httpTag
     * @param attribute
     */
    public HtmlNode(HtmlTag httpTag, HtmlAttributePair attribute) {
        this.children = new HtmlNodeList();
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
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
    public HtmlNode(HtmlTag httpTag, String inner_content) {
        this.children = new HtmlNodeList();
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        this.inputType = null;
        this.inner_content = inner_content;
        this.single_tag = false;
    }

    /**
     * Constructs a node which has the tag provided
     * @param httpTag
     * @param inputType 
     */
    public HtmlNode(HtmlTag httpTag, HtmlInputType inputType) {
        this.children = new HtmlNodeList();
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        this.inputType = inputType;
        this.inner_content = "";
        this.single_tag = false;
    }
    
    /**
     * Constructs a node which has the tag provided
     * @param httpTag
     * @param inputType 
     */
    public HtmlNode(HtmlTag httpTag, HtmlInputType inputType, String inner_content) {
        this.children = new HtmlNodeList();
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        this.inputType = inputType;
        this.inner_content = inner_content;
        this.single_tag = false;
    }

    public HtmlNode(HtmlTag httpTag, boolean single_tag, HtmlAttributePair... pairs) {
        this.children = new HtmlNodeList();
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        for(HtmlAttributePair pair : pairs) {
            this.attributes.add(pair);
        }
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = single_tag;
    }

    public HtmlNode(HtmlTag httpTag, HtmlAttributePair... pairs) {
        this.children = new HtmlNodeList();
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        for(HtmlAttributePair pair : pairs) {
            this.attributes.add(pair);
        }
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }


    public HtmlNode(HtmlTag httpTag, boolean single_tag, HtmlAttributeList list) {
        this.children = new HtmlNodeList();
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = list;
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = single_tag;
    }

    public HtmlNode(HtmlTag httpTag, HtmlNode child) {
        this.children = new HtmlNodeList();
        this.children.add(child);

        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }

    public HtmlNode(HtmlTag httpTag, HtmlNodeList childrenList) {
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        this.inputType = null;
        this.children = childrenList;
        this.inner_content = "";
        this.single_tag = false;
    }

    public HtmlNode(HtmlTag httpTag, HtmlAttributePair attribute, String inner_content) {
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        this.attributes.add(attribute);
        this.inputType = null;
        this.children = new HtmlNodeList();
        this.inner_content = inner_content;
        this.single_tag = false;
    }

    public HtmlNode(HtmlTag httpTag, HtmlAttributePair attribute, HtmlNode child) {
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        this.attributes.add(attribute);
        this.inputType = null;
        this.children = new HtmlNodeList();
        this.children.add(child);
        this.inner_content = "";
        this.single_tag = false;
    }

    public HtmlNode(HtmlTag httpTag, HtmlNode... myHttpNode) {
        this.httpTagWrapper = new HtmlTagWrapper(httpTag);
        this.attributes = new HtmlAttributeList();
        this.inputType = null;
        this.children = new HtmlNodeList();
        for(HtmlNode node : myHttpNode) {
            this.children.add(node);
        }
        this.inner_content = "";
        this.single_tag = false;
    }

    /**
     * @param e new node to add as child
     */
    public void add(HtmlNode e) {
        this.children.add(e);
    }

    /**
     * 
     * @param es nodes to add as children
     */
    public void add(HtmlNode... es) {
        for(HtmlNode e : es) {
            this.children.add(e);
        }
    }

    /**
     * @param list list of nodes to add as children
     */
    public void add(HtmlNodeList list) {
        for(Map.Entry<String, HtmlNode> entry : list.entrySet()) {
            this.children.add(entry.getValue());
        }
    }
    
    /**
     * @param lists list of nodes to add as children
     */
    public void add(HtmlNodeList... lists) {
        for(HtmlNodeList list : lists) {
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
