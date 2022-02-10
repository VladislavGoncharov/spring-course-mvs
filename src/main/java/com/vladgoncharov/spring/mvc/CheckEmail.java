package com.vladgoncharov.spring.mvc;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailClass.class)
public @interface CheckEmail {

    String value() default "vlad.com";
    String message() default "Попробуй еще разок ;)";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};


}


