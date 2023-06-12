package io.codelex.oop.summary.lazyboxexercise;

import java.util.function.Supplier;

public class LazyBox<T> {
    private T object;
    private boolean isInitialized;
    private Supplier<T> initializer;

    public LazyBox(Supplier<T> initializer) {
        this.initializer = initializer;
    }

    public T get() {
        if (!isInitialized) {
            object = initializer.get();
            isInitialized = true;
        }
        return object;
    }
}