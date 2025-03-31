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
import bazaar.HtmlNodeList;
import bazaar.HtmlTag
import bazaar.HtmlAttributePair;
import bazaar.HtmlGlobalAttribute;

public class WelcomePage extends HtmlPage {
    private MyHtmlNodeList nodes;

    public WelcomePage() {
        nodes = new HtmlNodeList();
        nodes.add(new HtmlNode(HttpTag.DOCTYPE, true));

        HtmlNode htmlTag = new HtmlNode(HtmlTag.HTML, new HtmlAttributePair(HtmlGlobalAttribute.LANG, "en"));


        HtmlNode head = new HtmlNode(HttpTag.HEAD);
        HtmlNode title_tag = new HttpNode(HttpTag.TITLE, "Hello World");
        head.add(title_tag);
        htmlTag.add(head);

        HtmlNode body = new HtmlNode(HtmlTag.BODY);
        HtmlNode paragraph = new HtmlNode(HtmlTag.P, "Welcome");
        body.add(paragraph);
        htmlTag.add(body);
        nodes.add(htmlTag);
    }

    public String toString() {
        return nodes.toString();
    }
    
}
```
