package jack.springboot.autoconfigure.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 *
 * @author Zhengde.ZHOU
 * @since 2018-09-09
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional({OnSystemPropertyCondition.class})
public @interface ConditionalOnSystemProperty {

    /**
     * Java 系统属性名称
     * @return
     */
    String key();

    /**
     * Java 系统属性值
     * @return
     */
    String value();

}
