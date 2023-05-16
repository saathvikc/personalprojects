public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int num_steps = 0;
        int x1 = 0, x2 = 0;
        int y1 = 0, y2 = 0;
        System.out.println("(" + y1 + ", " + y2 + ")");

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
            
            System.out.println("(" + y1 + ", " + y2 + ")");
            num_steps++;
        }
 
        System.out.println("steps = " + num_steps);
    }
}