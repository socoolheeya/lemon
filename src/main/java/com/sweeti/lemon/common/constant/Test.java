//package com.sweeti.lemon.common.constant;
//
//import org.jooq.meta.ClassUtils;
//import org.jooq.meta.jaxb.Jdbc;
//import org.jooq.tools.jdbc.JDBCUtils;
//
//import java.sql.Driver;
//
//public class Test {
//
//    public static void main(String[] args) {
//        ClassLoader loader = null;
//        Jdbc jdbc = new Jdbc();
//        jdbc.setDriver("com.mariadb.jdbc.Driver");
//        jdbc.setUrl("jdbc:mariadb://localhost:3306/lemon");
//        jdbc.setUsername("lemon-api");
//        jdbc.setPassword("1234");
//        String result = jdbc.getDriver();
//
//
//
//        Class<? extends Driver> driver = (Class<? extends Driver>) loadClass(jdbc);
//    }
//
//
//    public String driverClass(Jdbc j) {
//        String result = j.getDriver();
//
//        if (result == null) {
//            result = JDBCUtils.driver(j.getUrl());
//            log.info("Database", "Inferring driver " + result + " from URL " + j.getUrl());
//        }
//
//        return result;
//    }
//
//    public static Class<?> loadClass(String className) throws ClassNotFoundException {
//        try {
//            if (loader == null) {
//                return ClassUtils.loadClass(className);
//            } else {
//                return loader.loadClass(className);
//            }
//        }
//    } catch (ClassNotFoundException e) {
//
//        }
//}
