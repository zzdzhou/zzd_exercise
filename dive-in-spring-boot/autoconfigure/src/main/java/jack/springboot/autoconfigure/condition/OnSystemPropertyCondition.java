package jack.springboot.autoconfigure.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * Java 系统条件判断
 *
 * @author Zhengde.ZHOU
 * @since 2018-09-09
 */
public class OnSystemPropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String, Object> attrs = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String key = String.valueOf(attrs.get("key"));
        String value = String.valueOf(attrs.get("value"));
        System.out.println(System.getProperty(key));
        return value.equals(System.getProperty(key));
    }
}
