/*
 * *
 *  * Copyright (C) 2023 Udesh Imalka Weerasekara. All rights reserved.
 *  * Senior Software Engineer
 *
 */

package datastructure.arraysds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date:2023-10-15
 * Author:imalkaweerasekara
 */

class ArraysDSQuestion1 {
    public static void main(String[] args) {
        final List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        ArraysDSQuestion1.reverseArray(integerList);
    }

    /**
     * return the reverse of input integer array
     *
     * @param integerList input List<Integer>
     *
     * @return List<Integer> of reversed array
     */
    public static List<Integer> reverseArray(List<Integer> integerList) {

        List<Integer> integerList1 = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            integerList1.add(integerList.get(integerList.size() - (i + 1)));
        }

        return integerList1;
    }
}
