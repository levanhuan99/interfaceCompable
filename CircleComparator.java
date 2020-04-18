package comparator;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        double c=c1.getRadius();
        double b=c2.getRadius();
        if (c1.getRadius() > c2.getRadius()){
            return 1;
        }else  if (c1.getRadius() < c2.getRadius()){
            return -1;
        }else return 0;
    }
    //?? e không hiểu là bây giờ bên này có thêm vài phwuogn thức nữa thì làm sao??

}
