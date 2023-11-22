package ch.bztf;

public class PC {
    private Disk verweisAufDisk;

    public void diskWechseln(Disk disk) {
        if (verweisAufDisk != disk) {
            if (verweisAufDisk != null) {
                verweisAufDisk.ausbau();
            }
            this.verweisAufDisk = disk;
            disk.einbau();
        } else {
            System.out.println("Diese Disk ist bereits eingebaut.");
        }
    }

    public PC(Disk vaufDisk) {
        if (vaufDisk.getStatus()) {
            vaufDisk = new Disk();
            System.out.println("Diese Disk wird bereits verwendet. Es wurde eine neue erstellt.");
        }
        vaufDisk.einbau();
        verweisAufDisk = vaufDisk;
    }

    public Disk getDisk() {
        return verweisAufDisk;
    }
}
