
package DaftarPanitia;

public class CV {
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
    CvLink head;
    CvLink tail;
    CvLink temp;
    
    public CV(){
        
    }
    
    public CV(String nama){
    nama = nama;
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
    
    public void insertDepan(String nama,String nim,String prodi,String divisi1,String divisi2,
         String pengalaman1,String pengalaman2,String panitia1,String panitia2) {
        CvLink baru;
        baru = new CvLink(nama,nim,prodi,divisi1,divisi2,pengalaman1,pengalaman2,panitia1,panitia2);
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
        CvLink hapus;
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
        System.out.print("Nama Acara :"+nama);
        System.out.print("penyelengara :"+nim);
        System.out.print("pembina :"+prodi);
        System.out.print("deskripsi :"+divisi1);
        System.out.print("divisi1 :"+divisi2);
        System.out.print("divisi2 :"+pengalaman1);
        System.out.print("divisi3 :"+pengalaman2);
        System.out.print("divisi4 :"+panitia1);
        System.out.print("divisi5 :"+panitia2);
    }
    
        public void cari(String input) {
        boolean flag = false;
        if (isEmpty() == false) {
            CvLink ea = head;
            do {
                if (ea.nama.contains(input)) {
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

    public void filter(String input) {
        if (isEmpty() == false) {
            CvLink ea = head;
            do {
                if (ea.nama.contains(input)) {
                    System.out.print("Nama Acara :"+nama);
                    System.out.print("penyelengara :"+nim);
                    System.out.print("pembina :"+prodi);
                    System.out.print("deskripsi :"+divisi1);
                    System.out.print("divisi1 :"+divisi2);
                    System.out.print("divisi2 :"+pengalaman1);
                    System.out.print("divisi3 :"+pengalaman2);
                    System.out.print("divisi4 :"+panitia1);
                    System.out.print("divisi5 :"+panitia2);
                } else {
                    System.out.print("data yang anda cari tidak ada");
                }
                ea = ea.next;
            } while (ea != null);
        } else {
            System.out.println("data anda kosong");
        }
    }
}
