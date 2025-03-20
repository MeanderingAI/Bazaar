package bazaar;

public enum HttpNormalAttribute {
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

    HttpNormalAttribute(String attribute) {this.attribute = attribute;}
}
