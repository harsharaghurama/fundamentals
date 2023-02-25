package com.algos.csfundamentals.threads.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortRunner {
    public static void main(String[] args) throws Exception {
        List<Integer> inputArray = new ArrayList<>();
        for(int i=10; i>=0; i--) {
            inputArray.add(i);
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(executorService, inputArray);
        Future<List<Integer>> sortedValues = executorService.submit(sorter);
        System.out.println(sortedValues.get());
        executorService.shutdown();
    }
}
