package cn.kgc.springboot09.config;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class BeanConfig {

    @Bean
    public LocalValidatorFactoryBean validatorFactoryBean(){
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setProviderClass(HibernateValidator.class);
        ReloadableResourceBundleMessageSource source = new
                ReloadableResourceBundleMessageSource();
        source.setBasenames("classpath:/validationMessages/validation");
        bean.setValidationMessageSource(source);
        return bean;
    }

}
