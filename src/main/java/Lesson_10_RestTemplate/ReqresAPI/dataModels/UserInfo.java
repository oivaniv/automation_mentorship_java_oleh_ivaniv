package Lesson_10_RestTemplate.ReqresAPI.dataModels;

import java.io.Serializable;
import java.util.Objects;

public class UserInfo implements Serializable {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return page == userInfo.page && per_page == userInfo.per_page && total == userInfo.total && Objects.equals(data, userInfo.data) && Objects.equals(support, userInfo.support);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, per_page, total, data, support);
    }

    private int page;
    private int per_page;
    private int total;
    private Data data;
    private Support support;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "page=" + page +
                ", per_page=" + per_page +
                ", total=" + total +
                ", data=" + data +
                ", support=" + support +
                '}';
    }
}
