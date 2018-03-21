package diegojunco.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by Diego Junco on 21/03/2018
 **/
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean) bean).beforeIniti();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean) bean).afterInit();
        }

        return bean;
    }
}
