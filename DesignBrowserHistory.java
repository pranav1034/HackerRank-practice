import java.util.Stack;

class BrowserHistory {

    Stack<String> forward=new Stack<>();
    Stack<String> back=new Stack<>();
    String curr;

    public BrowserHistory(String homepage) {
        curr=homepage;
    }

    public void visit(String url) {
        back.push(curr);
        curr=url;
        while(!forward.isEmpty())
            forward.pop();

    }

    public String back(int steps) {
        for(int i=0;i<steps;i++){
            if(!back.isEmpty()){
                forward.push(curr);
                curr=back.peek();
                back.pop();
            }
        }
        return curr;
    }

    public String forward(int steps) {
        for(int i=0;i<steps;i++){
            if(!forward.isEmpty()){
                back.push(curr);
                curr=forward.pop();
            }
        }
        return curr;

    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */