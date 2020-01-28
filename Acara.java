
package DaftarPanitia;

public class Acara {
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
    AcaraLink head;
    AcaraLink tail;
    AcaraLink temp;


public Acara(){

}

public Acara(String namaAcara){
    namaAcara = namaAcara;
    next = null;
    previous = null;
}

public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

 public void insertDepan(String namaAcara,String penyelengara,String pembina,String deskripsi,String divisi1,
         String divisi2,String divisi3,String divisi4,String divisi5,String divisi6,String divisi7) {
        AcaraLink baru;
        baru = new AcaraLink(namaAcara,penyelengara,pembina,deskripsi,divisi1,divisi2,divisi3,divisi4,divisi5,divisi6,divisi7);
        baru.next = null;
        baru.previous = null;
        if (isEmpty() == true) {
            head = baru;
            tail = baru;
            head.next = null;
            head.previous = null;
        } else {
            head.previous = baru;
            baru.next = head;
            head = baru;
        }
    }
 
 public void hapusDepan() {
        AcaraLink hapus;
        hapus = head;
        if (head.next != null) {
            head = head.next;
            head.previous = null;
            hapus = null;
        } else {
            head = null;
            tail = null;
        }
    }
 
 public void hapusBelakang() {
     if (head.next != null) {
        temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next.previous = null;
        temp.next = null;
 }else{
         head = null;
         tail = null;
     }
 }
 
 public void printDepan() {
        if (isEmpty() == false) {
            temp = head;
            while (temp != null) {
                temp.displaynode();
                temp = temp.next;
            }
        }
    }

    public void printBelakang() {
        temp = tail;
        while (temp != null) {
            temp.displaynode();
            temp = temp.previous;
        }
    }

    public void displaynode() {
        System.out.print("Nama Acara :"+namaAcara);
        System.out.print("penyelengara :"+penyelengara);
        System.out.print("pembina :"+pembina);
        System.out.print("deskripsi :"+deskripsi);
        System.out.print("divisi1 :"+divisi1);
        System.out.print("divisi2 :"+divisi2);
        System.out.print("divisi3 :"+divisi3);
        System.out.print("divisi4 :"+divisi4);
        System.out.print("divisi5 :"+divisi5);
        System.out.print("divisi6 :"+divisi6);
        System.out.print("divisi7 :"+divisi7);
    }
    
    public String displaynodeNamaAcara() {
        return this.namaAcara;
    }
    
    public void cari(String input) {
        boolean flag = false;
        if (isEmpty() == false) {
            AcaraLink ea = head;
            do {
                if (ea.namaAcara.contains(input)) {
                    System.out.println("ada");
                    System.exit(0);
                } else {
                    flag = false;
                }
                ea = ea.next;
            } while (ea != null);
            if (flag == false) {
                System.out.println("tidak ada");
            }
        } else {
            System.out.println("data anda kosong");
        }
    }

    public void filter(String cari) {
        if (isEmpty() == false) {
            AcaraLink ea = head;
            do {
                if (ea.namaAcara.contains(cari)) {
                    System.out.println("Nama Acara :"+ea.namaAcara);
                    System.out.println("penyelengara :"+ea.penyelengara);
                    System.out.println("pembina :"+ea.pembina);
                    System.out.println("deskripsi :"+ea.deskripsi);
                    System.out.println("divisi1 :"+ea.divisi1);
                    System.out.println("divisi2 :"+ea.divisi2);
                    System.out.println("divisi3 :"+ea.divisi3);
                    System.out.println("divisi4 :"+ea.divisi4);
                    System.out.println("divisi5 :"+ea.divisi5);
                    System.out.println("divisi6 :"+ea.divisi6);
                    System.out.println("divisi7 :"+ea.divisi7);
                } else {
                    System.out.print("");
                }
                ea = ea.next;
            } while (ea != null);
        } else {
            System.out.println("data anda kosong");
        }
    }
    
    public void filterPenyelenggara(String cari) {
        if (isEmpty() == false) {
            AcaraLink ea = head;
            do {
                if (ea.penyelengara.contains(cari)) {
                    System.out.println("Nama Acara :"+ea.namaAcara);
                    System.out.println("penyelengara :"+ea.penyelengara);
                    System.out.println("pembina :"+ea.pembina);
                    System.out.println("deskripsi :"+ea.deskripsi);
                    System.out.println("divisi1 :"+ea.divisi1);
                    System.out.println("divisi2 :"+ea.divisi2);
                    System.out.println("divisi3 :"+ea.divisi3);
                    System.out.println("divisi4 :"+ea.divisi4);
                    System.out.println("divisi5 :"+ea.divisi5);
                    System.out.println("divisi6 :"+ea.divisi6);
                    System.out.println("divisi7 :"+ea.divisi7);
                } else {
                    System.out.print("");
                }
                ea = ea.next;
            } while (ea != null);
        } else {
            System.out.println("data anda kosong");
        }
    }
    
    public String tampil(String cari) {
            if (isEmpty() == false) {
            AcaraLink ea = head;
                if (ea.namaAcara.contains(cari)) {
                    return ea.namaAcara;
                } else {
                    return "data tidak ditemukan";
                }              
        } else {
            return "data kosong";
        }
    }

}