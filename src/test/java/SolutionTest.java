import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution() {
        Solution s = new Solution();
        assertThat(s.solution()).isOne();
    }
}
