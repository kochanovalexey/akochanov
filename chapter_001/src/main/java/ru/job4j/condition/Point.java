package ru.job4j.condition;

/**
 * Class Класс описывает точку в системе координат.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class Point {
	/**
	 * Координата x.
	*/
    private int x;

	/**
	 * Координата y.
	*/
    private int y;

    /**
	 * Point Метод присваивающий координаты.
	 * @param x - первая координата.
	 * @param y - вторая координата.
	*/
    public Point(int x, int y) {
       this.x = x;
       this.y = y;
    }

	/**
	 * getX Метод возвращающий x.
	 * @return - x.
	*/
    public int getX() {
		return this.x;
	}

	/**
	 * getY Метод возвращающий y.
	 * @return - y.
	*/
    public int getY() {
		return this.y;
    }

	/**
	 * is Метод определяет находится ли точка на функции  y(x) = a * x + b.
	 * @param a - a.
	 * @param b - b.
	 * @return - true or false.
	*/
	public boolean is(int a, int b) {
		return this.y == a * this.x + b;
	}
}