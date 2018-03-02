package jack.javacore.lintcode.basics.insert_interval_30;

import java.util.*;

public class Solution {

    public List<Interval> insert1(List<Interval> intervals, Interval newInterval) {
        // write your code here
        LinkedList<Interval> intervals1 = new LinkedList<Interval>(intervals);
        int start = newInterval.start;
        int end = newInterval.end;

        int startInerval = 0;
        int endInterval = 0;

        ListIterator<Interval> iter = intervals1.listIterator();
        while (iter.hasNext()) {
            Interval interval = iter.next();
            if (start >= interval.end) {
                if (iter.hasNext() && start <= iter.next().start) {

                }
            }
        }

        return null;
    }

    public List<Interval> insert2(List<Interval> intervals, Interval newInterval) {
        // write your code here
        ArrayList<Interval> intervalList = new ArrayList(intervals);
        int start = newInterval.start;
        int end = newInterval.end;

        if (start > intervalList.get(0).start /*|| start < inter*/) {

        }
        for (Interval item : intervalList) {
            if (start <= item.start && start >= item.end) {
                if (end >= item.end) {
                    return intervals;
                }
            }
        }
        return null;
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        int start = newInterval.start;
        int end = newInterval.end;

        LinkedList<Integer> integers = new LinkedList<Integer>();
        for (Interval item : intervals) {
            integers.add(item.start);
            integers.add(item.end);
        }

        ListIterator<Integer> iter = integers.listIterator();
        boolean startIsEnd = true;
        Integer next = null;
        while (iter.hasNext()) {
            next = iter.next();
            if (start <= next) {
                startIsEnd = false;
                if (iter.previousIndex() % 2 == 1) {
//                    iter.remove();
//                    iter.add(start);
                    if (end <= next) {
                        return intervals;
                    }
                    /*ListIterator<Integer> subIter = integers.listIterator(iter.nextIndex());
                    while (subIter.hasNext()) {
                        if (end <= subIter.next()) {
                            iter.remove();
                            iter.add(end);
                            return transferIntergerToInterval(integers);
                        }
                        iter.next();
                        iter.remove();
                    }*/
                    while (iter.hasNext()) {
                        if (end > iter.next()) {
                            iter.previous();
                            iter.remove();
                            iter.next();

                        }
                    }
                } else if (iter.previousIndex()%2 == 1) {
                    iter.add(start);
                }
            }
            if (startIsEnd) {
                intervals.add(newInterval);
                return intervals;
            }
        }


        return null;
    }

    private List<Interval> transferIntergerToInterval(List<Integer> integers) {
        return null;
    }

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<Integer>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);
        integers.add(60);

        ListIterator<Integer> iter = integers.listIterator(3);
        while (iter.hasNext()) {
            System.out.println("Iterator's previous index = " + iter.previousIndex());
            System.out.println("Iterator's next index = " + iter.nextIndex());
            System.out.println(iter.next());
        }
    }
}