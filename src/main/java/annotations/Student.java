package annotations;

import java.lang.reflect.Method;

public class Student {
    private String firstname;
    private String lastname;
    private int age;

    public Student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "firstname=' " + firstname + '\'' + ", lastname='" + lastname + '\'' + ", age=" + age + '}';
    }


    @MyCustomAnnotation(value = {"first", "second"})
    @Deprecated
    public void methodWithAnnotation(@Deprecated int someNumber){
        // ...
    }

    // let's see how we can process @MyCustomAnnotation
    public void processMyCustomAnnotation(){
        Method[] methods = this.getClass().getMethods();

        for (Method method: methods) {
            if (method.isAnnotationPresent(MyCustomAnnotation.class)){
                MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
                System.out.println(annotation.value()[0]); // first
                System.out.println(annotation.value()[1]); // second
            }
        }
    }

    public void processDeprecatedAnnotation() {
        Method[] methods = this.getClass().getMethods();
        for (Method method: methods){
            if (method.isAnnotationPresent(Deprecated.class)) {
                System.out.println("Method " + method.getName() + " is deprecated");
            }
        }
    }
}
