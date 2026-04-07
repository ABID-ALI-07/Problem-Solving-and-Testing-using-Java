import java.util.ArrayList;
import java.util.List;

class BrowserHistory {
    private List<String> history;
    private int current;
    private int maxBound;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        current = 0;
        maxBound = 0;
    }

    public void visit(String url) {
        current++;
        if (current < history.size()) {
            history.set(current, url);
        } else {
            history.add(url);
        }
        maxBound = current;
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history.get(current);
    }

    public String forward(int steps) {
        current = Math.min(maxBound, current + steps);
        return history.get(current);
    }
}
