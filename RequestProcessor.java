public class RequestProcessor {

    private RateLimiter limiter;

    public RequestProcessor(){
        limiter = new RateLimiter(3, 10000);
    }

    public void processRequest(String userId){

        Request request = new Request(userId);

        if(limiter.allowRequest(userId)){
            System.out.println("Request allowed for user: " + userId);
        }else{
            System.out.println("Request BLOCKED for user: " + userId);
        }
    }
}
