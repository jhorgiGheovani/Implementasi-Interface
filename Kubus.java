public class Kubus implements Bangun3D{

    int sisi;
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public float countVol() {
        return sisi*sisi*sisi;
    }
    public float countLuas(){
        return 6*sisi*sisi;
    }
}
