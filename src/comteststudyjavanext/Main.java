package comteststudyjavanext;

public class Main {
    public static void main(String[] args) {

        BehaviorTest behaviorTest = (double age) ->  {
            return age - 6;
        };

        BehaviorTwo behaviorTwo = new BehaviorTwo() {
            @Override
            public void action(int a, int b) {
                System.out.println(a + b);
            }
        };

        Button button = new Button();

        button.addAction(behaviorTwo);

    }
}

interface BehaviorTest{
    public double study(double age);
}

interface BehaviorTwo{
    public void action(int a, int b);
}

class Button {
    Button(){
        System.out.println("This is button.");
    }

    void addAction(BehaviorTwo behaviorTwo){
        behaviorTwo.action(3, 4);
    }
}