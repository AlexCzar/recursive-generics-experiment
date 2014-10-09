package com.asarkisov.experiments;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;

public class UseBuilders {
	public static void main(String[] args) {
		A a = new A.Builder<>().withStringVal("a").create();
		B b = new B.Builder<>().withStringVal("b").withBooleanVal(true).create();
		C c = new C.Builder<>().withStringVal("c").withIntVal(0).create();

		System.out.println(reflectionToString(a, MULTI_LINE_STYLE));
		System.out.println(reflectionToString(b, MULTI_LINE_STYLE));
		System.out.println(reflectionToString(c, MULTI_LINE_STYLE));
	}
}
