package api.endpoints;

public enum ResourceEndpoints {
    LIST("/unknown"),
    SINGLE("/unknown/%s");

    private String url;

    ResourceEndpoints(String url) {
        this.url = url;
    }

    public String getResourceUrl() {
        return url;
    }
}


