package com.study.java_study.ch16_제네릭;

import lombok.ToString;

public class Sender2 {

    @ToString
    public class Sender {
        private Object data1;
        private Object data2;

        public Sender(Object data1, Object data2) {
            this.data1 = data1;
            this.data2 = data2;
        }
    }


}
