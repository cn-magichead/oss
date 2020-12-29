package com.magichand.plugin.oss.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;
/**
 * @author wuph
 */
@Documented
@Retention(SOURCE)
@Target(TYPE)
public @interface AutoIgnore {
}
