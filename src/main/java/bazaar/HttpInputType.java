package bazaar;

public enum HttpInputType {
    BUTTON("button"), CHECKBOX("checkbox"),
    COLOR("color"), DATE("date"), DATETIMELOCAL("datetime-local"),
    EMAIL("email"), FILE("file"), HIDDEN("hidden"),
    IMAGE("image"), MONTH("month"), NUMBER("number"),
    PASSWORD("password"), RADIO("radio"), RANGE("range"),
    RESET("reset"), SEARCH("search"), SUBMIT("submit"),
    TEL("tel"), TEXT("text"), TIME("time"), URL("url"),
    WEEK("week");

    private final String type;

    HttpInputType(String type) {this.type = type;}

}
