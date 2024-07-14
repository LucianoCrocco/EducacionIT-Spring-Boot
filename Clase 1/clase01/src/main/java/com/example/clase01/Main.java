package com.example.clase01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.clase01.BeanDos.SegundoBean;
import com.example.clase01.BeanTres.Persona;
import com.example.clase01.BeanUno.PrimerBean;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PrimerBean bean = (PrimerBean) context.getBean("miPrimerBean");
        // bean.setSaludo("Primer bean");
        System.out.println(bean.getSaludo());
        bean.mostrarMensaje("Primer bean");
        System.out.println("\n---Primer bean terminado---\n");

        SegundoBean beanDos = (SegundoBean) context.getBean("miSegundoBean");
        System.out.println(beanDos.getSaludoEnIngles());
        System.out.println("\n---Segundo bean terminado---\n");

        Persona beanTres = (Persona) context.getBean("miTercerBean");
        System.out.println(beanTres.getDomicilio());
        System.out.println("\n---Tercer bean terminado---\n");
        
    }
}