package Programs.Questions;

public class Rectangle_Area {
    public static void main(String[] args) {
        int ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = 3, by1 = 3, bx2 = 4, by2 = 4;
        int areaA = (ax2 - ax1) * (ay2 - ay1);
        int areaB = (bx2 - bx1) * (by2 - by1);

        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);

        int intersection = Math.max(overlapWidth, 0) * Math.max(overlapHeight, 0);

        System.out.println(areaA+areaB-intersection);



    }
}
