package lectures;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Lecture3 {

    @Test
    public void min() {
        final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
        int min = numbers.stream().min(Comparator.naturalOrder()).get();
        assertThat(min).isEqualTo(1);
    }

    @Test
    public void max() {
        final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
        int max = numbers.stream().max(Comparator.naturalOrder()).get();
        assertThat(max).isEqualTo(100);
    }
}
