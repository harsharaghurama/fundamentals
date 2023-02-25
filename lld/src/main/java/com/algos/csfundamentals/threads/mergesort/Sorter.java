package com.algos.csfundamentals.threads.mergesort;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@AllArgsConstructor
public class Sorter implements Callable<List<Integer>> {

    ExecutorService executorService;

    private List<Integer> values;

    @Override
    public List<Integer> call() throws Exception {
        if(values.size() <= 1) {
            return values;
        }
        int mid = values.size()/2;
        List<Integer> leftArray = values.subList(0, mid);
        List<Integer> rightArray = values.subList(mid, values.size());

        Sorter leftSorter = new Sorter(executorService, leftArray);
        Sorter rightSorter = new Sorter(executorService, rightArray);

        Future<List<Integer>> sortedLeft = executorService.submit(leftSorter);
        Future<List<Integer>> sortedRight = executorService.submit(rightSorter);

        List<Integer> sortedArray = merge(sortedLeft, sortedRight);

        return sortedArray;
    }

    private List<Integer> merge(Future<List<Integer>> leftArray, Future<List<Integer>> rightArray)
            throws ExecutionException, InterruptedException {
        List<Integer> sortedArray = new ArrayList<>();
        int first = 0;
        int second = 0;
        List<Integer> left = leftArray.get();
        List<Integer> right = rightArray.get();
        while(first < left.size() && second < right.size()) {
            if(left.get(first) <= right.get(second)) {
                sortedArray.add(left.get(first));
                first++;
            }
            else {
                sortedArray.add(right.get(second));
                second++;
            }
        }
        while(first<left.size()) {
            sortedArray.add(left.get(first));
            first++;
        }
        while(second < right.size()) {
            sortedArray.add(right.get(second));
            second++;
        }
        return sortedArray;
    }

}
