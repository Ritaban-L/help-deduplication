package com.dhruvk.point;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class PointTest {

    @Test
    void twoElementsWithSamePointsShouldBeEqual() {

        Point pointOne=new Point(0,0);

        Point pointTwo=new Point(0,0);

        assertThat(pointOne,is(equalTo(pointTwo)));

    }

    @Test
    void twoElementsWithDifferentPointsShouldNotBeEqual(){

        Point pointOne = new Point(0, 0);

        Point pointTwo = new Point(1, 1);

        assertThat(pointOne,is(not(equalTo(pointTwo))));
    }

}

