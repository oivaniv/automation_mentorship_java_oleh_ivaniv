package lesson_10_RestTemplate.ReqresAPI.dataModels;

import java.io.Serializable;
import java.util.Objects;

public class Support implements Serializable {
    private String url;
    private String text;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Support support = (Support) o;
        return Objects.equals(url, support.url) && Objects.equals(text, support.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "support{" +
                "url='" + url + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
