public class ThreeDPoint extends Point{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z) {
        super(x, y, label);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + " , z = " + z;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ThreeDPoint)) {
            return false;
        }
        ThreeDPoint otherPoint = (ThreeDPoint) obj;
        return super.equals(obj) && this.z == otherPoint.z;
    }
}
