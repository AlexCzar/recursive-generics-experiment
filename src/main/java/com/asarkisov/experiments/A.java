package com.asarkisov.experiments;

public class A {

	private String stringVal;

	public A(Builder<?> builder) {
		this.stringVal = builder.stringVal;
	}

	public static class Builder<T extends Builder<T>> {

		protected String stringVal = null;

		@SuppressWarnings("unchecked")
		protected T self() {
			return (T) this;
		}

		public T withStringVal(String stringVal) {
			this.stringVal = stringVal;
			return self();
		}

		public A create() {
			System.out.println("Creating A");
			return new A(this);
		}

	}
}
