package bazaar;

/**
 * The possible special attributes to an html node
 * https://developer.mozilla.org/en-US/docs/Web/HTML/Special_attributes
 * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes
 * https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes
 */
public enum HtmlAttribute {
    //special
    NAME("name"), CONTENT("content"), CHARSET("charset"), 
    HREF("href"), SRC("src"), TYPE("type"),
    //global
    ACCESS_KEY("access_key"),
    ANCHOR("anchor"), //Experimental Limited Support
    AUTOCAPITALIZE("autocapitalize"),
    AUTOCORRECT("autocorrect"), //Experimental
    AUTOFOCUS("autofocus"), CLASS("class"), CONTENTEDITABLE("contenteditable"),
    DATASTAR("data-*"), DIR("dir"), DRAGGABLE("draggable"), ENTERKEYHINT("enterkeyhint"),
    EXPORTPARTS("exportparts"), HIDDEN("hidden"), ID("id"), INERT("inert"), INPUTMODE("inputmode"),
    IS("is"), ITEMID("itemid"), ITEMPROP("itemprop"), ITEMREF("itemref"), ITEMSCOPE("itemscope"),
    ITEMTYPE("itemtype"), LANG("lang"), NONCE("nonce"), PART("part"), POPOVER("popover"), SLOT("slot"),
    SPELLCHECK("spellcheck"), STYLE("style"), TABINDEX("tabindex"), TITLE("title"), TRANSLATE("translate"),
    VIRTUALKEYBOARDPOLICY("virtualkeyboardpolicy"), //Experimental
    WRITINGSUGGESTIONS("writingsuggestions"),
    //normal
    ACCEPT("accept"), AUTOCOMPLETE("autocomplete"),
    CAPTURE("capture"), CROSS_ORIGIN("crossorigin"),
    DIRNAME("dirname"), DISABLED("disabled"),
    ELEMENT_TIMING("elementtiming"), FOR("for"),
    MAX("max"), MAXLENGTH("maxlength"), MIN("min"),
    MIN_LENGTH("minlength"), MULTIPLE("multiple"),
    PATTERN("pattern"), PLACEHOLDER("placeholder"),
    READONLY("readonly"), REL("rel"), REQUIRED("required"),
    SIZE("size"), STEP("step"),
    //unsorted
    ACTION("action"), METHOD("method"), VALUE("value");
    
    private final String attribute;

    HtmlAttribute(String attribute) {this.attribute = attribute;}
}
