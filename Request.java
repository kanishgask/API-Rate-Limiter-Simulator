public class Request {

    private String userId;
    private long timestamp;

    public Request(String userId) {
        this.userId = userId;
        this.timestamp = System.currentTimeMillis();
    }

    public String getUserId() {
        return userId;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
