package com.asarkisov.experiments;

public class A<T extends A.Builder<T>> {

	private String stringVal;

	public A(Builder<T> builder) {
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

		public A<T> create() {
			System.out.println("Creating A");
			return new A<>(this);
		}

	}
}
