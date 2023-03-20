public class GreatCircle {
    public static void main(String[] args) {
        Double x1 = Math.toRadians(Double.parseDouble(args[0]));
        Double x2 = Math.toRadians(Double.parseDouble(args[1]));
        Double y1 = Math.toRadians(Double.parseDouble(args[2]));
        Double y2 = Math.toRadians(Double.parseDouble(args[3]));
        Double r = 6371.0;

        Double sinx = Math.pow(Math.sin((x2 - x1) / 2), 2);
        Double siny = Math.pow(Math.sin((y2 - y1) / 2), 2);
        Double root = Math.sqrt(sinx + (Math.cos(x1) * Math.cos(x2) * siny));
        Double distance = 2 * r * Math.asin(root);

        System.out.println(distance + " kilometers");
    }
}