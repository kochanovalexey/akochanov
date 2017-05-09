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
		double ab = calculationLineLength(a, b);
		double ac = calculationLineLength(a, c);
		double bc = calculationLineLength(b, c);
		double p = (ab + ac + bc) / 2;
		if (ab + ac > bc & ab + bc > ac & bc + ac > ab) {
			return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
		} else {
			return 0.0;
		}
	}

	/**
	 * calculationLineLength Метод вычисляющий длину стороны треугольника.
	 * @param firstPoint - координаты первой точки.
	 * @param secondPoint - координаты второй точки.
	 * @return - возращат длину стороны.
	*/
	public double calculationLineLength(Point firstPoint, Point secondPoint) {
		return Math.sqrt(Math.pow(Math.abs(firstPoint.getX() - secondPoint.getX()), 2) + Math.pow(Math.abs(firstPoint.getY() - secondPoint.getY()), 2));
	}
}