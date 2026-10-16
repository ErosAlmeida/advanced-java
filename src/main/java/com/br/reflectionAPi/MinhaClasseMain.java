package com.br.reflectionAPi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MinhaClasseMain {
    public static void main( String[] args ) throws Exception {
        MinhaClasse mc = new MinhaClasse();

        executar(mc);
    }

    private static void executar( MinhaClasse mc) throws InvocationTargetException, IllegalAccessException {
        Class<MinhaClasse> c = (Class<MinhaClasse>) mc.getClass();

        Method[] methods = c.getDeclaredMethods();

        for (Method m : methods){
            Executar annot = m.getDeclaredAnnotation(Executar.class);

            if(annot != null){
                m.invoke(mc);
            }
        }
    }
}
