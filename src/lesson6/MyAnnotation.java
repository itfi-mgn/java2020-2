package lesson6;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface MyAnnotation /* extends java.lang.Annotation */ {
	String myValue() default "";	// - primitives
						// - String
						// - Class
						// - enum
						// - other annotation
						// - arrays of previous types
	int myCount() default 100;	// 'ConstValue'
	String value();	// - primitives
}
