package api.endpoints;

public enum DelayedResponseEndpoints {
    DELAYED_RESPONSE("/users");

    private String url;

    DelayedResponseEndpoints(String url) {
        this.url = url;
    }

    public String getDelayedResponseUrl() {
        return url;
    }
}
