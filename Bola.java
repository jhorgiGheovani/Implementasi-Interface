public class Bola implements Bangun3D{
    int diameter;
    float PI = (float)Math.PI;

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public float countVol() {
        return (4*PI*(diameter/2)*(diameter/2)*(diameter/2))/3;
    }
    public float countLuas(){
        return 4*PI*(diameter/2)*(diameter/2);
    }
}
