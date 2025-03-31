package bazaar;

import java.util.Objects;

/**
 * A wrapper class for HttpTag to allow for custom tags
 */
public class HtmlTagWrapper {
    private HtmlTag tag;
    private String customTag;

    /*
     * @param tag the tag we intend to wrap
     */
    public HtmlTagWrapper(HtmlTag tag) {
        this.tag = tag;
    }

    /*
     * @param customElement name of a custom element
     */
    public HtmlTagWrapper(String customElement) {
        this.customTag = customElement;
    }

    /*
     * @return the string representation of the tag
     */
    public String toString() {
        if (tag != null) {
            return tag.toString();
        } else {
            return customTag;
        }
    }

    /**
     * @return string representation of the opening tag 
     * 
     * "<customTag>"
     */
    public String toOpenTag() {
        if (tag != null) {
            return tag.toOpenTag();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("<");
            sb.append(this.customTag);
            sb.append(">");
            return sb.toString();
        }
    }

    /**
     * @return string representation of the closing tag
     * "</customTag>"
     */
    public String toCloseTag() {
        if(tag != null) {
            return tag.toCloseTag();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("</");
            sb.append(this.customTag);
            sb.append(">");
            return sb.toString();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HtmlTagWrapper that = (HtmlTagWrapper) o;
        return tag == that.tag || Objects.equals(customTag, that.customTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, customTag);
    }
}
