package bazaar;

/**
 * The possible special attributes to an html node
 * https://developer.mozilla.org/en-US/docs/Web/HTML/Special_attributes
 */
public enum HttpSpecialAttribute {
    NAME("name"), CONTENT("content"), CHARSET("charset"), 
    HREF("href"), SRC("src"), TYPE("type");

    private final String attribute;

    HttpSpecialAttribute(String attribute) {this.attribute = attribute;}
}
