import java.util.HashMap;
import java.util.Map;

public class RateLimiter {

    private Map<String, UserBucket> userBuckets;
    private int limit;
    private long window;

    public RateLimiter(int limit, long window) {
        this.limit = limit;
        this.window = window;
        this.userBuckets = new HashMap<>();
    }

    public boolean allowRequest(String userId){

        userBuckets.putIfAbsent(userId, new UserBucket(limit, window));

        UserBucket bucket = userBuckets.get(userId);

        return bucket.allowRequest();
    }
}
