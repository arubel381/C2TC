package annotations;

//MarkerAnnotation
//SingleValueAnnotation
//MultiValueAnnotation

@interface SmartPhone
{
	String os() default "Symbian";
	int version() default 1;
}
@SmartPhone(os="Android", version=12)

class NokiaASeries 
{
	
}

public class AnnotationDemo_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
