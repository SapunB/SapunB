package geometry;

public class Line {
    private Point startPoint;
    private Point endPoint;
    private boolean selected;

    public Line(){

    }

    public Line(Point x, Point y){
        this.startPoint = x;
        this.endPoint = y;
    }

    public Line(Point x, Point y, boolean selected){
        this.startPoint = x;
        this.endPoint = y;
        this.selected = selected;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
