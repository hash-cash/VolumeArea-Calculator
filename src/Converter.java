public abstract class Converter {
    protected double areaIn, areaFt;

    public double printAreaConvertedFt(){return areaFt;};
    public double printAreaConvertedIn(){return areaIn;};
    public abstract void getAreaConverted();
}
