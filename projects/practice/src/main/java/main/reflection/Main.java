package main.reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException {
        //Metadata
        Method[] declaredMethods = Printer.class.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));

//        System.out.println(Arrays.toString(declaredMethods[0].getParameters()));

        //Methods invocation
//        Printer printer = new Printer();
//        Object invokedViaReflection = declaredMethods[0].invoke(printer, "Invoked via reflection");
//        System.out.println(invokedViaReflection);

        //Creation
//        Constructor<Printer> constructor = Printer.class.getConstructor();
//        Printer printerInstance = constructor.newInstance();
//        Class<?> printerForName = Class.forName("main.reflection.Printer");

        //Implementation in runtime
//        Class<?> interFace = Class.forName("main.reflection.ICounter");
//        ClassLoader classLoader = interFace.getClassLoader();
        //array of interfaces to implement
//        Class<?>[] interfacesToImplement = {interFace};
//        InvocationHandler invocationHandler = (object, method, args1) -> {
//            if (method.getName().equals("count")) {
//                int arg0 = (int) args1[0];
//                int arg1 = (int) args1[1];
//                return arg0 + arg1;
//            }
//            throw new UnsupportedOperationException();
//        };
//        Object counterInstance = Proxy.newProxyInstance(classLoader, interfacesToImplement, invocationHandler);
//        Method method = counterInstance.getClass().getMethod("count", int.class, int.class);
//        Object result = method.invoke(counterInstance, 7, 9);
//        System.out.println(result);

    }

}
