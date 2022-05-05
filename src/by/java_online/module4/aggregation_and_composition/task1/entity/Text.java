package by.java_online.module4.aggregation_and_composition.task1.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text implements Serializable {

    @Serial
    private static final long serialVersionUID = 672619237247582025L;

    private List<Sentence> header;
    private List<Sentence> body;

    public Text() {
        this.header = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    public List<Sentence> getHeader() {
        return header;
    }

    public void setHeader(List<Sentence> header) {
        this.header = header;
    }

    public List<Sentence> getBody() {
        return body;
    }

    public void setBody(List<Sentence> body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text = (Text) o;

        if (!Objects.equals(header, text.header)) return false;
        return Objects.equals(body, text.body);
    }

    @Override
    public int hashCode() {
        int result = header != null ? header.hashCode() : 0;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Text{ header = " + header +", body = " + body +" }";
    }
}
