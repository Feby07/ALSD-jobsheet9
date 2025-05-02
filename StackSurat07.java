public class StackSurat07 {
    Surat07[] stack;
    int top;
    int size;

    public StackSurat07(int size) {
        this.size = size;
        stack = new Surat07[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat07 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat izin lagi.");
        }
    }

    public Surat07 pop() {
        if (!isEmpty()) {
            Surat07 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin untuk diambil.");
            return null;
        }
    }

    public Surat07 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void prosesSurat() {
        Surat07 suratDiProses = pop();
        if (suratDiProses != null) {
            System.out.println("Surat sedang diproses:");
            suratDiProses.tampilkanInfo();
        } else {
            System.out.println("Tidak ada surat yang bisa diproses.");
        }
    }

    public void lihatSuratTerakhir() {
        Surat07 suratTerakhir = peek(); 
        if (suratTerakhir != null) {
            System.out.println("Surat terakhir yang masuk: ");
            suratTerakhir.tampilkanInfo();
        } else {
            System.out.println("Tidak ada surat yang masuk.");
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat izin ditemukan: ");
                stack[i].tampilkanInfo();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat izin dari " + namaMahasiswa + " tidak ditemukan.");
        }
    }
}
