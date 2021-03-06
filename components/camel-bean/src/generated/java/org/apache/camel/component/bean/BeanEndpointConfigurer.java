/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.bean;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BeanEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BeanEndpoint target = (BeanEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "cache": target.setCache(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "method": target.setMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "parameters": target.setParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "scope": target.setScope(property(camelContext, org.apache.camel.BeanScope.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("cache", java.lang.Boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("method", java.lang.String.class);
        answer.put("parameters", java.util.Map.class);
        answer.put("scope", org.apache.camel.BeanScope.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BeanEndpoint target = (BeanEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "cache": return target.getCache();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "method": return target.getMethod();
        case "parameters": return target.getParameters();
        case "scope": return target.getScope();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

