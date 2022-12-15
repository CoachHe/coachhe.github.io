package com.coachhe.Section3_无意识的递归;

import java.util.stream.Stream;

/**
 * @author CoachHe
 * @date 2022/12/16 01:37
 **/
public class InfiniteRecursion {

    @Override
    public String toString() {
        return "InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {
        Stream.generate(InfiniteRecursion::new)
                .limit(10)
                .forEach(System.out::println);
    }
}
