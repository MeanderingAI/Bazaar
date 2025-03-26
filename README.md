Bazaar is a front-end written in Java

# Install

```
git clone git@github.com:MeanderingAI/Bazaar.git
cd Bazaar
mvn clean install
```

# Usage

Expected to be used with [Stallholder](https://github.com/MeanderingAI/Stallholder).

An example html page would then be;
```
import bazaar.HtmlPage;
import bazaar.MyHttpNodeList;
import bazaar.HttpTag
import bazaar.HttpAttributePair;
import bazaar.HttpGlobalAttribute;

public class WelcomePage extends HtmlPage {
    private MyHttpNodeList nodes;

    public WelcomePage() {
        nodes = new MyHttpNodeList();
        nodes.add(new MyHttpNode(HttpTag.DOCTYPE, true));

        MyHttpNode htmlTag = new MyHttpNode(HttpTag.HTML, new HttpAttributePair(HttpGlobalAttribute.LANG, "en"));


        MyHttpNode head = new MyHttpNode(HttpTag.HEAD);
        MyHttpNode title_tag = new MyHttpNode(HttpTag.TITLE, "Hello World");
        head.add(title_tag);
        htmlTag.add(head);

        MyHttpNode body = new MyHttpNode(HttpTag.BODY);
        MyHttpNode paragraph = new MyHttpNode(HttpTag.P, "Welcome");
        body.add(paragraph);
        htmlTag.add(body);
        nodes.add(htmlTag);
    }

    public String toString() {
        return nodes.toString();
    }
    
}
```
