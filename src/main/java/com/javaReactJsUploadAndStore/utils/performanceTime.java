package com.javaReactJsUploadAndStore.utils;

public abstract class performanceTime {

    static long startTime;
    static long finishTime;

    public void setStartTime(){
        startTime = System.nanoTime();
    }

    public void finishTime(){
        finishTime = System.nanoTime();
    }

    public void howLongItTakes (){
        long time = finishTime - startTime;
        System.out.println(time / 1_000_000_000);
    }


}
