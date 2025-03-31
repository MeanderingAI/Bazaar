package bazaar;

/*
 * The possible normal attributes to an html node
 * https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes
 */
public enum HtmlNormalAttribute {
    ACCEPT("accept"), AUTOCOMPLETE("autocomplete"),
    CAPTURE("capture"), CROSS_ORIGIN("crossorigin"),
    DIRNAME("dirname"), DISABLED("disabled"),
    ELEMENT_TIMING("elementtiming"), FOR("for"),
    MAX("max"), MAXLENGTH("maxlength"), MIN("min"),
    MIN_LENGTH("minlength"), MULTIPLE("multiple"),
    PATTERN("pattern"), PLACEHOLDER("placeholder"),
    READONLY("readonly"), REL("rel"), REQUIRED("required"),
    SIZE("size"), STEP("step");

    private final String attribute;

    HtmlNormalAttribute(String attribute) {this.attribute = attribute;}
}
