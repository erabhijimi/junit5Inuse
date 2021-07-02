package com.cosmos.java8;

import java.util.Stack;

public class Java8NewFeaturesDemo {
    public static void main(String[] args) {
        System.out.println("Altimetrik Interview");
        Stack st = new Stack();
        st.push("a");
        st.push("a");
        st.push("c");
        st.push("a");
        st.push("a");
        int len =st.capacity();
        System.out.println(len);

    }
}
