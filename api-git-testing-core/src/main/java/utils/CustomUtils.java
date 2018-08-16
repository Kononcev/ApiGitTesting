package utils;

import java.lang.reflect.Field;

public class CustomUtils {
   public static Class<?> getFieldClass(Class<?> clazz, String name) {
      if (clazz==null || name==null || name.isEmpty()) {
         return null;
      }
      name = name.toLowerCase();
      Class<?> propertyClass = null;
      for (Field field : clazz.getDeclaredFields()) {
         field.setAccessible(true);
         if (field.getName().equals(name)) {
            propertyClass = field.getType();
            break;
         }
      }
      return propertyClass;
   }
}
