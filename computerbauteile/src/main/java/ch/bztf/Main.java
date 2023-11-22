package ch.bztf;

public class Main {
    public static void main(String[] args) {
        Disk c = new Disk();
        Disk d = new Disk();
        Disk e = new Disk();

        PC acer = new PC(c);
        PC hp = new PC(c);

        acer.diskWechseln(c);
        acer.diskWechseln(d);
        System.out.println(e.getStatus());
        hp.diskWechseln(e);
    }
}