package example.sort;

import example.sort.algorithms.IAlgorithms;
import example.sort.algorithms.impl.Bubble;
import example.sort.algorithms.impl.Increase;
import example.sort.algorithms.impl.Reverse;
import example.sort.sorting.ISorting;
import example.sort.sorting.impl.Sorting;

public class Main {

    public static void main(String[] args) {
        String increase = "increase";
        sort(increase);
    }

    private static void sort(String method) {
        ISorting iSorting = new Sorting();
        IAlgorithms iAlgorithms = new Increase();

        if ("bubble".equalsIgnoreCase(method)) {
            iAlgorithms = new Bubble();
        } else if ("reverse".equalsIgnoreCase(method)) {
            iAlgorithms = new Reverse();
        }

        iSorting.setIAlgorithms(iAlgorithms);
        iSorting.sort();
    }

}
