package org.javacore.time;

import org.junit.Test;

import java.time.Instant;

/**
 * 瞬间类 Instant
 *
 * Created by bysocket on 16/7/12.
 */
public class InstantTest {

    @Test
    public void test() {
        // 获取现在的时间
        Instant now = Instant.now();
        System.out.println(now);

        // 1000000000 年 12月 31日
        Instant max = Instant.MAX;
        System.out.println(max);

        // 10亿年前
        Instant min = Instant.MIN;
        System.out.println(min);
    }
}
