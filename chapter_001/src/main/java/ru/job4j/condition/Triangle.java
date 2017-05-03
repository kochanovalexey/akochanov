package ru.job4j.condition;

/**
 * Class Класс вычисляет площадь треугольника.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class Triangle {
	/**
	 * Точка a.
	*/
	private Point a;

	/**
	 * Точка b.
	*/
	private Point b;

	/**
	 * Точка c.
	*/
	private Point c;

	/**
	 * Конструктор класса.
	 * @param a - точка a.
	 * @param b - точка b.
	 * @param c - точка c.
	*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * area Метод вычисляющий площадь треугольника по заданным точкам.
	 * @return - возвращает площадь треугольника.
	*/
	public double area() {
		boolean triangle;
		if (a.getX() == b.getX() && a.getY() == b.getY() || a.getX() == c.getX() && a.getY() == c.getY() || c.getX() == b.getX() && c.getY() == b.getY()) {
			triangle = false;
		} else {
			triangle = true;
		}

		if (triangle) {
			double ab = Math.sqrt(Math.pow(Math.abs(a.getX() - b.getX()), 2) + Math.pow(Math.abs(a.getY() - b.getY()), 2));
			double ac = Math.sqrt(Math.pow(Math.abs(a.getX() - c.getX()), 2) + Math.pow(Math.abs(a.getY() - c.getY()), 2));
			double bc = Math.sqrt(Math.pow(Math.abs(b.getX() - c.getX()), 2) + Math.pow(Math.abs(b.getY() - c.getY()), 2));
			double p = (ab + ac + bc) / 2;
			return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
		} else {
			return 0.0;
		}
	}
}