package com.xjd.ct.dal;

import org.springframework.beans.BeanUtils;

/**
 * @author elvis.xu
 * @since 2015-03-20 14:16
 */
public class OtherTest {
	public static void main(String[] args) {
		A a = new A();
		a.setA("1adsfsdf");
		a.setB("2b");
		a.setC("3");
		B b = new B();

		BeanUtils.copyProperties(a, b);
		System.out.println(b);
	}

	public static class A {
		private String a;
		private String b;
		private String c;

		public String getA() {
			return a;
		}

		public void setA(String a) {
			this.a = a;
		}

		public String getB() {
			return b;
		}

		public void setB(String b) {
			this.b = b;
		}

		public String getC() {
			return c;
		}

		public void setC(String c) {
			this.c = c;
		}

	}

	public static class B {
		private String a;
		private int b;
		private String d;

		public String getA() {
			return a;
		}

		public void setA(String a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		public String getD() {
			return d;
		}

		public void setD(String d) {
			this.d = d;
		}

		@Override
		public String toString() {
			return "B{" +
					"a='" + a + '\'' +
					", b=" + b +
					", d='" + d + '\'' +
					'}';
		}
	}
}
