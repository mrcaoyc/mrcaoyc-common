package com.github.mrcaoyc.common.bean;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象复制
 *
 * @author CaoYongCheng
 */

public class BeanCopy {
    private BeanCopy() {
    }


    /**
     * 复制单个对象，如果源为null，返回null
     *
     * @param source      源
     * @param targetClass 目标类型
     * @return 复制的结果
     */
    public static <S, T> T copy(S source, Class<T> targetClass) {
        if (source == null) {
            return null;
        }
        T target;
        try {
            target = targetClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("对象无法进行COPY，请检查构造方法");
        }
        BeanUtils.copyProperties(source, target);
        return target;
    }

    /**
     * 复制单个对象，如果源为null，返回null
     *
     * @param source           源
     * @param targetClass      目标类型
     * @param ignoreProperties 需要忽略的属性
     * @return 复制的结果
     */
    public static <S, T> T copy(S source, Class<T> targetClass, String... ignoreProperties) {
        if (source == null) {
            return null;
        }
        T target;
        try {
            target = targetClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("对象无法进行COPY，请检查构造方法");
        }
        BeanUtils.copyProperties(source, target, ignoreProperties);
        return target;
    }

    /**
     * 复制单个对象，如果源为null或size等于0，则返回空列表
     *
     * @param source      源
     * @param targetClass 目标类型
     * @return 复制的结果
     */
    public static <S, T> List<T> copyList(List<S> source, Class<T> targetClass) {
        if (CollectionUtils.isEmpty(source)) {
            return new ArrayList<>(0);
        }
        List<T> target = new ArrayList<>(source.size());
        source.forEach(s -> target.add(BeanCopy.copy(s, targetClass)));
        return target;
    }

    /**
     * 复制单个对象，如果源为null或size等于0，则返回空列表
     *
     * @param source           源
     * @param targetClass      目标类型
     * @param ignoreProperties 需要忽略的属性
     * @return 复制的结果
     */
    public static <S, T> List<T> copyList(List<S> source, Class<T> targetClass, String... ignoreProperties) {
        if (CollectionUtils.isEmpty(source)) {
            return new ArrayList<>(0);
        }
        List<T> target = new ArrayList<>(source.size());
        source.forEach(s -> target.add(BeanCopy.copy(s, targetClass, ignoreProperties)));
        return target;
    }
}
