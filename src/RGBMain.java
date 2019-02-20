import controller.RGBController;
import model.RGB;

public class RGBMain {
    public static void main(String[] args) {
        RGBController rgb = new RGBController();
        RGB red = rgb.setRGB(255,0,0);
        RGB blue = rgb.setRGB(0,0,255);
        RGB strange = rgb.setRGB(122,120,108);

        System.out.println(red);
        System.out.println(blue);
        System.out.println(strange);

        System.out.println(rgb.mixColor(red, blue));
        System.out.println(rgb.mixColor(strange, blue));
        System.out.println(rgb.clearColor(strange));

    }
}
