package bazaar;

/*
 * Enum for all the global attributes.
 * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes
 */
public enum HttpGlobalAttribute {
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
    WRITINGSUGGESTIONS("writingsuggestions");

    private final String attribute;

    HttpGlobalAttribute(String attribute) {this.attribute = attribute;}
}
