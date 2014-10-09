package com.asarkisov.experiments;


public class B<T extends B.Builder<T>> extends A<T> {

	private boolean booleanVal;

	public B(Builder<T> builder) {
		super(builder);
		this.booleanVal = builder.booleanVal;
	}

	public static class Builder<T extends Builder<T>> extends A.Builder<T> {

		protected boolean booleanVal = false;

		public T withBooleanVal(boolean booleanVal) {
			this.booleanVal = booleanVal;
			return self();
		}

		@Override
		public B<T> create() {
			System.out.println("Creating B");
			return new B<>(this);
		}
	}
}
