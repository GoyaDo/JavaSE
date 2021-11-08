package com.goya.enumm;

/**
 * @author goya
 * @create 2021-05-11 21:34
 */
public interface Food {
    enum Appetizer implements Food {
        SALAD, SOUP, SORING_ROLLS;
    }

    enum MainCourse implements Food {
        LASAGNE, BURRITO, PAD_THAI,
        LENTILS, HUMMOUS, VINDALOO;
    }
}
