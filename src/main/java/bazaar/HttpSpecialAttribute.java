package bazaar;

public enum HttpSpecialAttribute {
    NAME("name"), CONTENT("content"), CHARSET("charset"), 
    HREF("href"), SRC("src"), TYPE("type");

    private final String attribute;

    HttpSpecialAttribute(String attribute) {this.attribute = attribute;}
}
