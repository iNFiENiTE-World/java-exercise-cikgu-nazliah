import java.util.Scanner;

class fromKbToConverter {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double kb_in, mb_out, gb_out, tb_out, pb_out;

        log("Enter number of kilobyte: ");
        kb_in = sc.nextDouble();

        mb_out = kb_in / 1e3;
        gb_out = kb_in / 1e6;
        tb_out = kb_in / 1e9;
        pb_out = kb_in / 1e12;
        
        log("\nmegabyte: " + mb_out + " MB");
        log("\ngigabyte: " + gb_out + " GB");
        log("\nterabyte: " + tb_out + " TB");
        log("\npetabyte: " + pb_out + " PB");

        sc.close();
    }

    static void log (String message) {
        System.out.print(message);
    }
}