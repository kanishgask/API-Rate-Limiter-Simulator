import java.util.LinkedList;
import java.util.Queue;

public class UserBucket {

    private Queue<Long> requests;
    private int limit;
    private long window;

    public UserBucket(int limit, long window) {
        this.limit = limit;
        this.window = window;
        this.requests = new LinkedList<>();
    }

    public boolean allowRequest(){

        long now = System.currentTimeMillis();

        while(!requests.isEmpty() && now - requests.peek() > window){
            requests.poll();
        }

        if(requests.size() < limit){
            requests.add(now);
            return true;
        }

        return false;
    }
}
