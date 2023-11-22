package ch.bztf;

public class Disk {
    private boolean eingebaut;

    public void einbau() {
        if (!eingebaut) {
            eingebaut = true;
        } else {
            System.out.println("Diese Disk kann nicht eingebaut werden, da sie bereits verwendet wird");
        }
    }

    public void ausbau() {
        if (eingebaut) {
            eingebaut = false;
        } else {
            System.out.println("Diese Disk kann nicht ausgebaut werden, da sie nicht verwendet wird");
        }
    }

    public boolean getStatus() {
        return eingebaut;
    }
}
