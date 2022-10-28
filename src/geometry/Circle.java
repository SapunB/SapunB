package geometry;

public class Circle {
    private Point center;
    private int r;
    private boolean selected;

    public Circle(){

    }

    public Circle(Point x, int y){
        this.center = x;
        this.r = y;
    }

    public Circle(Point x, int y, boolean selected){
        this.center = x;
        this.r = y;
        this.selected = selected;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
