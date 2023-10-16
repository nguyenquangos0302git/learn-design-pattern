package example.sort.sorting.impl;

import example.sort.algorithms.IAlgorithms;
import example.sort.sorting.ISorting;

public class Sorting implements ISorting {

    private IAlgorithms iAlgorithms;

    @Override
    public void setIAlgorithms(IAlgorithms iAlgorithms) {
        this.iAlgorithms = iAlgorithms;
    }

    @Override
    public void sort() {
        iAlgorithms.sort();
    }
}
