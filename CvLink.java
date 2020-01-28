
package DaftarPanitia;

public class CvLink {
    public String nama;
    public String nim;
    public String prodi;
    public String divisi1;
    public String divisi2;
    public String pengalaman1;
    public String pengalaman2;
    public String panitia1;
    public String panitia2;
    public CvLink next;
    public CvLink previous;
    
    public CvLink(){
        nama = null;
        nim = null;
        prodi = null;
        divisi1 = null;
        divisi2 = null;
        pengalaman1 = null;
        pengalaman2 = null;
        panitia1 = null;
        panitia2 = null;
        next = null;
        previous = null;
    }

    public CvLink(String nama,String nim,String prodi,String divisi1,String divisi2,String pengalaman1,String pengalaman2,String panitia1,String panitia2) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.divisi1 = divisi1;
        this.divisi2 = divisi2;
        this.pengalaman1 = pengalaman1;
        this.pengalaman2 = pengalaman2;
        this.panitia1 = panitia1;
        this.panitia2 = panitia2;
        next = null;
        previous = null;
    }
    
    public void displaynode(){
        System.out.println(nama+" ");
        System.out.println(nim+" ");
        System.out.println(prodi+" ");
        System.out.println(divisi1+" ");
        System.out.println(divisi2+" ");
        System.out.println(pengalaman1+" ");
        System.out.println(pengalaman2+" ");
        System.out.println(panitia1+" ");
        System.out.println(panitia2+" ");
    }
}
