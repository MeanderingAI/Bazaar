package bazaar;

import java.util.Objects;

public class HttpTagWrapper {
    private HttpTag tag;
    private String customTag;

    public HttpTagWrapper(HttpTag tag) {
        this.tag = tag;
    }

    public HttpTagWrapper(String customElement) {
        this.customTag = customElement;
    }

    public String toString() {
        if (tag != null) {
            return tag.toString();
        } else {
            return customTag;
        }
    }

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
        HttpTagWrapper that = (HttpTagWrapper) o;
        return tag == that.tag || Objects.equals(customTag, that.customTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, customTag);
    }
}
