package homework.seventh.taskOne;

public class Square extends Shape{
    @Override
    Double getArea(double d) {
        return Math.pow(d , 2);
    }

    @Override
    Double getPerimeter(double d) {
        return d * 4;
    }
}
