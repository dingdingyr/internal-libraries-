package cn.wehax.util;


import java.security.InvalidParameterException;
import java.util.List;

public class ArrayUtil {
    /**
     * 如果数组索引越界，返回true
     *
     * @param size  数组元素个数
     * @param index 索引
     * @return
     */
    public static boolean isOutOfBounds(int size, int index) {
        if (index < 0 || index >= size)
            return true;
        else
            return false;
    }


    public static <T> boolean isOutOfBounds(List<T> list, int index) {
        if(list == null)
            throw new InvalidParameterException("list is null");

        return isOutOfBounds(list.size(), index);
    }
}
