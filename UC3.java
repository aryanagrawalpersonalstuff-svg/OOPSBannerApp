public class OOPSBanner {
    public static void main(String[] args) {

        String[] line1 = {" *** ", " *** ", " **** ", " **** "};
        String[] line2 = {"*   *", "*   *", "*   *", "*    "};
        String[] line3 = {"*   *", "*   *", "**** ", " *** "};
        String[] line4 = {"*   *", "*   *", "*    ", "    *"};
        String[] line5 = {" *** ", " *** ", "*    ", "**** "};

        System.out.println(String.join("  ", line1));
        System.out.println(String.join("  ", line2));
        System.out.println(String.join("  ", line3));
        System.out.println(String.join("  ", line4));
        System.out.println(String.join("  ", line5));
    }
}