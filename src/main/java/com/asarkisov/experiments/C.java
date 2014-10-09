package com.asarkisov.experiments;

public class C extends A {

	private final int intVal;

	public C(Builder<?> builder) {
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
		public C create() {
			System.out.println("Creating C");
			return new C(this);
		}
	}
}
