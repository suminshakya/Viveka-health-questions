package com.vhq;

import com.vhq.service.impl.RemoveDuplicate;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateTest {

    @Test
    void removeDuplicateElements()  {

        RemoveDuplicate<Integer> removeDuplicate = new RemoveDuplicate();
        removeDuplicate.add(1);
        removeDuplicate.add(1);
        removeDuplicate.add(2);
        removeDuplicate.add(3);
        removeDuplicate.add(3);
        removeDuplicate.add(3);


        System.out.println("Expected Result :: " + removeDuplicate);

    }
}
