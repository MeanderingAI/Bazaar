package bazaar;

import java.util.Map;

public class MyHttpNode {
    private boolean listNode;
    //private CSSBank cssBank;
    private HttpTagWrapper httpTagWrapper;
    private HttpAttributeList attributes;
    private HttpInputType inputType;
    private MyHttpNodeList children;
    private String inner_content;
    private boolean single_tag;

    public MyHttpNode() {
        this.listNode = true;
        this.httpTagWrapper = new HttpTagWrapper(HttpTag.ERROR);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.children = new MyHttpNodeList();
        this.inner_content = "";
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag) {
        this.listNode = true;
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }


    public MyHttpNode(HttpTagWrapper httpTagWrapper) {
        this.listNode = true;
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = httpTagWrapper;
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, boolean single_tag) {
        this.listNode = true;
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = single_tag;
    }

    public MyHttpNode(HttpTag httpTag, HttpAttributePair attribute) {
        this.listNode = true;
        //this.cssBank = CSSBank.getInstance();
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.attributes.add(attribute);
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, String inner_content) {
        this.listNode = true;
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.inner_content = inner_content;
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, HttpInputType inputType) {
        this.listNode = true;
        //this.cssBank = CSSBank.getInstance();
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = inputType;
        this.inner_content = "";
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, HttpInputType inputType, String inner_content) {
        this.listNode = true;
        //this.cssBank = CSSBank.getInstance();
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = inputType;
        this.inner_content = inner_content;
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, boolean single_tag, HttpAttributePair... pairs) {
        this.listNode = true;
        //this.cssBank = CSSBank.getInstance();
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
        this.listNode = true;
        //this.cssBank = CSSBank.getInstance();
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
        this.listNode = true;
        //this.cssBank = CSSBank.getInstance();
        this.children = new MyHttpNodeList();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = list;
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = single_tag;
    }

    public MyHttpNode(HttpTag httpTag, MyHttpNode child) {
        this.listNode = true;
        //this.cssBank = CSSBank.getInstance();
        this.children = new MyHttpNodeList();
        this.children.add(child);

        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.inner_content = "";
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, MyHttpNodeList childrenList) {
        this.listNode = true;
        //this.cssBank = CSSBank.getInstance();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.inputType = null;
        this.children = childrenList;
        this.inner_content = "";
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, HttpAttributePair attribute, String inner_content) {
        this.listNode = true;
        //this.cssBank = CSSBank.getInstance();
        this.httpTagWrapper = new HttpTagWrapper(httpTag);
        this.attributes = new HttpAttributeList();
        this.attributes.add(attribute);
        this.inputType = null;
        this.children = new MyHttpNodeList();
        this.inner_content = inner_content;
        this.single_tag = false;
    }

    public MyHttpNode(HttpTag httpTag, HttpAttributePair attribute, MyHttpNode child) {
        this.listNode = false;
        //this.cssBank = CSSBank.getInstance();
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
        //this.cssBank = CSSBank.getInstance();
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

    public void add(MyHttpNode e) {
        this.children.add(e);
    }

    public void add(MyHttpNode... es) {
        for(MyHttpNode e : es) {
            this.children.add(e);
        }
    }

    public void add(MyHttpNodeList list) {
        for(Map.Entry<String, MyHttpNode> entry : list.entrySet()) {
            this.children.add(entry.getValue());
        }
    }

    public void add(MyHttpNodeList... lists) {
        for(MyHttpNodeList list : lists) {
            this.add(list);
        }
    }

    public void SetInnerContent(String inner_content) {
        this.inner_content = inner_content;
    }

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
    private String toClosingTag() {
        StringBuilder sb = new StringBuilder();
        sb.append("</");
        sb.append(this.httpTagWrapper.toString());
        sb.append('>');
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        //if(this.httpTagWrapper.equals(HttpTag.LINK)) {
        //    sb.append(this.expandLinkTag());
        //} else {
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
        //}
        return sb.toString();
    }

    @Deprecated
    private String expandLinkTag() throws RuntimeException {
        if(!this.httpTagWrapper.equals(HttpTag.LINK)) {
            throw new RuntimeException("Expected type to be of link and have a single tag");
        }
        if(this.single_tag != true) {
            throw new RuntimeException("Expected type to be of link and have a single tag");
        }
        if(!this.attributes.contains(HttpSpecialAttribute.HREF)) {
            throw new RuntimeException("Expected href attribute");
        }
        if(!this.attributes.contains(HttpNormalAttribute.REL)) {
            throw new RuntimeException("Expected rel tag");
        }
        /*
        String rel_key = this.attributes.key(HttpNormalAttribute.REL);
        if (rel_key != "stylesheet"){
            throw new RuntimeException("Expected stylesheet as rel.");
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<style>");
        String href_key = this.attributes.key(HttpSpecialAttribute.HREF);
        CssDef css = this.cssBank.get(href_key);
        if(css != null) {
            sb.append(css.toString());
        }
        sb.append("</style>");

        return sb.toString();

         */
        return "";
    }

}
