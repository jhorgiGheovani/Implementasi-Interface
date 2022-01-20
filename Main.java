public class Main {
    public static void main(String[] args) {
        Kubus Kubus= new Kubus();
        Bola Bola = new Bola();
        Kubus.setSisi(2);
       System.out.println("Vol Kubus:"+Kubus.countVol());
       System.out.println("Luas Kubus:"+Kubus.countLuas());
        Bola.setDiameter(4);
       System.out.println("Vol Bola:"+Bola.countVol());
       System.out.println("Luas Bola:"+Bola.countLuas());
    }
}
