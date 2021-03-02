package net.suncaper.projecttracking.common;

public class PagableResponse<T> {
    private long total;
    private T data;

    public PagableResponse() {
    }

    public PagableResponse(long total, T data) {
        this.total = total;
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
