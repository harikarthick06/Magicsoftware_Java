public class SnakeLadderUC1 {
    public static int pos = 0;
    public static int rolls = 0;
    public static final int target = 100;

    public void play() {
        while (pos < target) {
            int dieRoll = (int) (Math.random() * 6) + 1;
            rolls++;
            int encounter = (int) (Math.random() * 3) + 1;
            switch (encounter) {
                case 1:
                    break;
                case 2:
                    pos -= dieRoll;
                    if (pos < 0) {
                        pos = 0;
                    }
                    break;
                case 3:
                    pos += dieRoll;
                    if (pos > target) {
                        pos = target - (pos - target);
                    }
            }
            System.out.println("Reached: " + pos + " in " + rolls + " rolls.");
        }
    }
    public static void main(String[] args) {
        SnakeLadderUC1 game = new SnakeLadderUC1();
        game.play();
    }
}
