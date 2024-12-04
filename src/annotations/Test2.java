package annotations;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomi = Class.forName("annotations.Xiaomi");
        Annotation annotation1 = xiaomi.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation1;
        System.out.println(smartPhone.OS() + " " + smartPhone.yearOfCompanyCreation());

        Class iphone = Class.forName("annotations.Iphone");
        Annotation annotation2 = iphone.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone2 = (SmartPhone) annotation2;
        System.out.println(smartPhone2.OS() + " " + smartPhone2.yearOfCompanyCreation());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Windows";
    int yearOfCompanyCreation();
}


@SmartPhone(yearOfCompanyCreation = 2010)
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {


    String model;
    double price;
}