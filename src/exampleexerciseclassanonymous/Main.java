package exampleexerciseclassanonymous;

public class Main {
    public static void main(String[] args) {

        BehaviorWhenPressed behaviorWhenPressed = new BehaviorWhenPressed() {
            @Override
            public void action() {
                System.out.println("I am from class anonymous");
            }
        };

        BehaviorWhenInvadeCursor behaviorWhenInvadeCursor = new BehaviorWhenInvadeCursor() {
            @Override
            public void actionTwo(int a, int b) {
                System.out.println(a + b);
            }
        };

        Button button = new Button();
        button.addAction(behaviorWhenPressed);

        Button button1 = new Button();
        button1.addActionTwo(3,5, behaviorWhenInvadeCursor);

        button.addActionTwo(6, 7, behaviorWhenInvadeCursor);
    }
}

interface BehaviorWhenPressed {
    void action();
}

interface BehaviorWhenInvadeCursor {
    void actionTwo(int a, int b);
}

class Button{
    void addAction(BehaviorWhenPressed behaviorWhenPressed){
        behaviorWhenPressed.action();
    }

    void addActionTwo(int a, int b, BehaviorWhenInvadeCursor behaviorWhenInvadeCursor){
        behaviorWhenInvadeCursor.actionTwo(a, b);
    }
}


