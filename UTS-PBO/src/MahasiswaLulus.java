public class MahasiswaLulus extends Mahasiswa {
    int tahunWisuda;
    float ipk;

    public boolean ikutWisuda(){
        if(tahunWisuda > 2018 && tahunWisuda <= 2020){
            System.out.print("Mahasiswa Harus Sudah Lulus");
            return true;
        }
        else{
            System.out.print("Mahasiswa Harus Sudah Lulus");
            return false;
        }
    }
    
    @Override
    public void infoMahasiswa(){
        if(ikutWisuda()== true){
            int temp = loop * 4;
            this.ipk = (super.totalIPK / temp) + 2;
            System.out.println("Lulus dengan IPK " + ipk);
            super.infoMahasiswa();
        }
    }
}
