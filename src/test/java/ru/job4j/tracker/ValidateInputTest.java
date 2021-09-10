package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {
    @Test
    public void whenInvalidInputOne1Then1() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInvalidInput123Then123() {
        Output out = new StubOutput();
        String[] values = new String[]{"1", "2", "3"};
        for (String val: values) {
            Input in = new StubInput(
                    new String[]{val}
            );
            ValidateInput input = new ValidateInput(out, in);
            int selected = input.askInt("Enter menu:");
            assertThat(selected, is(Integer.parseInt(val)));
        }
    }

    @Test
    public void whenInvalidInputMinus1ThenMinus1() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }

    @Test
    public void whenCorrectInput1Then1() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }
}