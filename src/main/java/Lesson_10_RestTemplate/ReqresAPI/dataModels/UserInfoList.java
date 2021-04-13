package Lesson_10_RestTemplate.ReqresAPI.dataModels;

import java.io.Serializable;
import java.util.List;

public class UserInfoList implements Serializable {
    private int page;
    private int per_page;
    private int total;
    private List<Data> data;
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

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
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
