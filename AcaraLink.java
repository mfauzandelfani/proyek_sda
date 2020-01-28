
package DaftarPanitia;

public class AcaraLink {

    public String namaAcara;
    public String penyelengara;
    public String pembina;
    public String deskripsi;
    public String divisi1;
    public String divisi2;
    public String divisi3;
    public String divisi4;
    public String divisi5;
    public String divisi6;
    public String divisi7;
    public AcaraLink next;
    public AcaraLink previous;

    public AcaraLink() {
        namaAcara = null;
        penyelengara = null;
        pembina = null;
        deskripsi = null;
        divisi1 = null;
        divisi2 = null;
        divisi3 = null;
        divisi4 = null;
        divisi5 = null;
        divisi6 = null;
        divisi7 = null;
        next = null;
        previous = null;
    }

    public AcaraLink(String namaAcara, String penyelengara, String pembina, String deskripsi, String divisi1,
            String divisi2, String divisi3, String divisi4, String divisi5, String divisi6, String divisi7) {
        this.namaAcara = namaAcara;
        this.penyelengara = penyelengara;
        this.pembina= pembina;
        this.deskripsi = deskripsi;
        this.divisi1 = divisi1;
        this.divisi2 = divisi2;
        this.divisi3 = divisi3;
        this.divisi4 = divisi4;
        this.divisi5 = divisi5;
        this.divisi6 = divisi6;
        this.divisi7 = divisi7;
        next = null;
        previous = null;
    }

    public void displaynode() {
        System.out.println(namaAcara + " ");
        System.out.println(penyelengara + " ");
        System.out.println(pembina + " ");
        System.out.println(deskripsi + " ");
        System.out.println(divisi1 + " ");
        System.out.println(divisi2 + " ");
        System.out.println(divisi3 + " ");
        System.out.println(divisi4 + " ");
        System.out.println(divisi5 + " ");
        System.out.println(divisi6 + " ");
        System.out.println(divisi7 + " ");
    }
}
