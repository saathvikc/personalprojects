public class CMYKtoRGB {
    public static void main(String[] args) {
        Double cyan = Double.parseDouble(args[0]);
        Double magenta = Double.parseDouble(args[1]);
        Double yellow = Double.parseDouble(args[2]);
        Double black = Double.parseDouble(args[3]);

        Double white = 1 - black;
        int red =  (int) (255 * white * (1 - cyan));
        int green =  (int) (255 * white * (1 - magenta));
        int blue =  (int) (255 * white * (1 - yellow));

        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
    }
}