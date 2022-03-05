package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//MetaAnnotation

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone1
{
	String os() default "Symbian";
	int version() default 1;
}
@SmartPhone1(os="Android", version=12)

class RealmeXSeries
{
	String model;
	int size;
	public RealmeXSeries(String model, int size) {
		this.model = model;
		this.size = size;
	}
	
}
public class AnnotationDemo1 {

	public static void main(String[] args) {
		RealmeXSeries obj = new RealmeXSeries("RealmeX7Max",6);
		Class c  = obj.getClass();
		Annotation a = c.getAnnotation(SmartPhone1.class);
		SmartPhone1 s = (SmartPhone1)a;
		System.out.println(s.os());
		System.out.println(s.version());
	}

}
