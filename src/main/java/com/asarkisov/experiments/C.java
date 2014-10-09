package com.asarkisov.experiments;

public class C<T extends C.Builder<T>> extends A<T> {

	private final int intVal;

	public C(Builder<T> builder) {
		super(builder);
		this.intVal = builder.intVal;
	}

	public static class Builder<T extends Builder<T>> extends A.Builder<T> {

		protected int intVal = 0;

		public T withIntVal(int intVal) {
			this.intVal = intVal;
			return self();
		}

		@Override
		public C<T> create() {
			System.out.println("Creating C");
			return new C<>(this);
		}
	}
}
