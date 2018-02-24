package jack.javacore.lintcode.basics.insert_interval_30;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Solution {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
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
}