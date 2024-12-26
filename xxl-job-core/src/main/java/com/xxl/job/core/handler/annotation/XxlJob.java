package com.xxl.job.core.handler.annotation;

import java.lang.annotation.*;

/**
 * annotation for method jobhandler
 *
 * @author xuxueli 2019-12-11 20:50:13
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface XxlJob {

    /**
     * jobhandler name
     *
     * @return String
     */
    String value();

    /**
     * init handler, invoked when JobThread init
     *
     * @return string
     */
    String init() default "";

    /**
     * destroy handler, invoked when JobThread destroy
     *
     * @return string
     */
    String destroy() default "";

}
