package exampleexerciseclassanonymous;

public class Main {
    public static void main(String[] args) {

        BehaviorWhenPressed behaviorWhenPressed = new BehaviorWhenPressed() {
            @Override
            public void action() {
                System.out.println("I am from class anonymous");
            }
        };

        Button button = new Button();
        button.addAction(behaviorWhenPressed);
    }
}

interface BehaviorWhenPressed {
void action();
}

class Button{

    void addAction(BehaviorWhenPressed behaviorWhenPressed){
        behaviorWhenPressed.action();
    }

}

