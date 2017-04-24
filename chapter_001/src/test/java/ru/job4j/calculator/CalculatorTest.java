package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 * @author Kochanov Alexey dzot-1993@yandex.ru
 * @version $ld$
 * @since 0.1
 */
public class CalculatorTest {
	/**
	* Test add.
	*/
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc =  new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}


	/**
	* Test substruct.
	*/
	@Test
	public void whenSubstructThreeMinusTwoThenOne() {
		Calculator calc = new Calculator();
		calc.substruct(3D, 2D);
		double result = calc.getResult();
		double expected = 1D;
		assertThat(result, is(expected));
	}

	/**
	* Test div.
	*/
	@Test
	public void whenDivNineDivideThreeThenThree() {
		Calculator calc = new Calculator();
		calc.div(9D, 3D);
		double result = calc.getResult();
		double expected = 3D;
		assertThat(result, is(expected));
	}

	/**
	* Test multiple.
	*/
	@Test
	public void whenMultipleTwoMultiplyThreeThenSix() {
		Calculator calc = new Calculator();
		calc.multiple(2D, 3D);
		double result = calc.getResult();
		double expected = 6D;
		assertThat(result, is(expected));
	}
}