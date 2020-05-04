/*
 * Курс "DEV-j210. Java EE. Разработка веб-сервисов".
 * Класс RSApplication предназначен для конфигурирования приложения, 
 * представляющего простой REST-сервис.
 * (С) Ю.Д.Заковряшин, 2018-2020.
 */
package org.netbeans.rs.config;

import demo.HelloRS;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Класс обеспечивает конфигурирование приложения.
 *
 * @author (С) Ю.Д.Заковряшин, 2018-2020.
 */
@ApplicationPath("rs")
public class RSApplication extends Application {

    /**
     * Метод выполняет регистрацию RESTful сервисов.
     *
     * @return возвращает коллекцию типа {@link java.util.Set}, содержащую
     * ссылки на зарегистрированные RESTful сервисы.
     */
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(HelloRS.class);
        return set;
    }
}
