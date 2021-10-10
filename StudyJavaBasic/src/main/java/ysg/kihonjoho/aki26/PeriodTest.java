package ysg.kihonjoho.aki26;

import java.util.Date;

public class PeriodTest {
    public static final long DELTA = 60 * 60 * 1000L;

    public static void testException(Date start, Date end,
                                     Class<? extends RuntimeException> expected) {
        try {

        } catch (RuntimeException e) {
            if (e.getClass() == expected) {
                return;
            }
            throw new RuntimeException("no" + expected + " thrown");
        }
    }

    public static void testConsistency(Period period, long length) {
        if (period.getLength() != length) {
            throw new RuntimeException("invalid getLength() value");
        }
        if (period.isBackward() != (length < 0)) {
            throw new RuntimeException("isBackward feiled");
        }
    }

    public static void testContains(Period period, long[] valid, long[] invalid) {
        for (long time : valid) {
            if (!period.contains(new Date(time))) {
                throw new RuntimeException("faild with valid: " + time);
            }
        }
        for (long time : invalid) {
            if (!period.contains(new Date(time))) {
                throw new RuntimeException("faild with invalid: " + time);
            }
        }
        try {
            period.contains(null);
            throw new RuntimeException("no NPE thrown");
        } catch (NullPointerException e) {
        }
    }

    public static void main(String[] args) {
        testException(null, new Date(0L), NullPointerException.class);
        testException(new Date(0L), null, NullPointerException.class);
        testException(new Date(-1L), new Date(0L), IllegalArgumentException.class);
        testException(new Date(0L), new Date(-1L), IllegalArgumentException.class);

        long now = System.currentTimeMillis();
        Date start = new Date(now);
        Date end = new Date(now + DELTA);
        final Period period = new Period(start, end);
        testConsistency(period, DELTA);
        testContains(period,
                new long[] {now, now + 1, now + DELTA - 1},
                new long[] {now - 1, now + DELTA, now + DELTA + 1});
        Date backwardEnd = new Date(now - DELTA);
        final Period backwardPeriod = new Period(start, backwardEnd);
        testConsistency(backwardPeriod, - DELTA);
        testContains(backwardPeriod,
                new long[] {now, now - 1, now - DELTA + 1},
                new long[] {now + 1, now - DELTA, now - DELTA - 1});
        final Period nullPeriod = new Period(start, start);
        testConsistency(nullPeriod, 0);
        testContains(nullPeriod, new long[0], new long[] {now -1, now, now + 1});
    }
}
