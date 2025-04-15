package task2;

public class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Handled " + issue);
        } else if (nextHandler != null) {
            System.out.println("[FAQBot] Cannot handle " + issue + " — passing to next level");
            nextHandler.handle(issue);
        } else {
            System.out.println("[FAQBot] Cannot handle " + issue + " — escalate manually");
        }
    }
}
