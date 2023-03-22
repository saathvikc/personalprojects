public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        double trials = Double.parseDouble(args[1]);
        double num_steps = 0.0;
        int x1 = 0, x2 = 0;
        int y1 = 0, y2 = 0;

        for (int i = 0; i < trials; i++) {
            while (Math.abs(x1 - x2) + Math.abs(y1 - y2) != r) {
                double direction = Math.random();
                if (direction < 0.25) {
                    y1++;
                } else if (direction < 0.5) {
                    y1--;
                } else if (direction < 0.75) {
                    y2++;
                } else {
                    y2--;
                }
                num_steps++;
            }

            y1 = 0;
            y2 = 0;
        }

        double average_steps = num_steps / trials;

        System.out.println("average number of steps = " + average_steps);
    }
}
