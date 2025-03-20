package bazaar;

public enum HttpTag {
    A("a"), ABBR("abbr"), ADDRESS("address"),
    AREA("area"), ARTICLE("article"), ASIDE("aside"),
    AUDIO("audio"), B("b"), BASE("base"), BDI("bdi"),
    BDO("bdo"), BLOCKQUOTE("blockquote"), BODY("body"),
    BR("br"), BUTTON("button"), CANVAS("canvas"),
    CAPTION("caption"), CITE("cite"), CODE("code"),
    COL("col"), COL_GROUP("colgroup"), DATA("data"),
    DATA_LIST("datalist"), DD("dd"), DEL("del"),
    DETAILS("details"), DFN("dfn"), DIALOG("dialog"),
    DIV("div"), DL("dl"), DT("dt"), EM("em"), EMBED("embed"),
    FENCED_FRAME("fencedframe"), //Experimental
    FIELD_SET("fieldset"), FIG_CAPTION("figcaption"),
    FIGURE("figure"), FOOTER("footer"), FORM("form"), H1("h1"), H2("h2"), HEAD("head"),
    HEADER("header"), HGROUP("hgroup"), HR("hr"), HTML("html"), I("i"),
    IFRAME("iframe"), IMG("img"), INPUT("input"), INS("ins"), KBD("kbd"),
    LABEL("label"), LEGEND("legend"), LI("li"), LINK("link"), MAIN("main"),
    MAP("map"), MARK("mark"), MENU("menu"), META("meta"), METER("meter"),
    NAV("nav"), NO_SCRIPT("noscript"), OBJECT("object"), OL("ol"),
    OPTGROUP("optgroup"), OPTION("option"), OUTPUT("output"), P("p"), PICTURE("picture"),
    PORTAL("portal"), //Experimental
    PRE("pre"), PROGRESS("progress"), Q("q"), RP("rp"), RT("rt"), RUBY("ruby"), S("s"),
    SAMP("samp"), SCRIPT("script"), SEARCH("search"), SECTION("section"), SELECT("select"),
    SLOT("slot"), SMALL("small"), SOURCE("source"), SPAN("span"), STRONG("strong"),
    SUB("sub"), STYLE("style"), SUMMARY("summary"), SUP("sup"), TABLE("table"),
    TBODY("tbody"), TD("td"), TEMPLATE("template"), TEXTAREA("textarea"), TFOOT("tfoot"),
    TH("th"), THEAD("thead"), TIME("time"), TITLE("title"), TR("tr"), TRACK("track"),
    U("u"), UL("ul"), VAR("var"), VIDEO("video"), WBR("wbr"), DOCTYPE("!DOCTYPE html"), ERROR("ERROR"),
    ADMIN_PANEL("admin-panel"); // custom element;

    private final String tag;

    HttpTag(String tag) {this.tag = tag;}

    public String toString() {return tag;}

    public String toOpenTag() {
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        sb.append(this.tag);
        sb.append('>');
        return sb.toString();
    }

    public String toCloseTag() {
        StringBuilder sb = new StringBuilder();
        sb.append("</");
        sb.append(this.tag);
        sb.append(">");
        return sb.toString();
    }
}

// Deprecated tags
//    ACRONYM("acronym"), BIG("big"), CENTER("center"), DIR("dir")
//    FONT("font"), FRAME("frame"), FRAMESET("frameset"), MARQUEE("marquee"),
//    NOBR("nobr"), NOEMBED("noembed"), NOFRAMES("noframes"), PARAM("param"),
//    PLAINTEXT("plaintext"), RB("rb"), RTC("rtc"), STRIKE("strike"), TT("tt")
//    XMP("xmp")