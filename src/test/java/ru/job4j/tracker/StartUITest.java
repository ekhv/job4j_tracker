package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit Program" + System.lineSeparator() + "Выход" + System.lineSeparator()
        ));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1", "1", "replaced item", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ReplaceAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        Item replaced = tracker.findAll()[0];
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu."
                        + System.lineSeparator()
                        + "0. Delete Item"
                        + System.lineSeparator()
                        + "1. Exit Program"
                        + System.lineSeparator()
                        + "=== Delete item ===="
                        + System.lineSeparator()
                        + "Ошибка удаления заявки."
                        + System.lineSeparator()
                        + "Menu."
                        + System.lineSeparator()
                        + "0. Delete Item"
                        + System.lineSeparator()
                        + "1. Exit Program"
                        + System.lineSeparator()
                        + "Выход"
                        + System.lineSeparator()
        ));
    }

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenFindAllAction(){
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new FindAll(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu."
                        + System.lineSeparator()
                        + "0. Show all items"
                        + System.lineSeparator()
                        + "1. Exit Program"
                        + System.lineSeparator()
                        + "=== Show all items ===="
                        + System.lineSeparator()
                        + "Хранилище еще не содержит заявок"
                        + System.lineSeparator()
                        + "Menu."
                        + System.lineSeparator()
                        + "0. Show all items"
                        + System.lineSeparator()
                        + "1. Exit Program"
                        + System.lineSeparator()
                        + "Выход"
                        + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByNameAction(){
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0","Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new FindByName(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu."
                        + System.lineSeparator()
                        + "0. Find item by name"
                        + System.lineSeparator()
                        + "1. Exit Program"
                        + System.lineSeparator()
                        + "=== Find items by name ===="
                        + System.lineSeparator()
                        + "Заявки с именем: Item name не найдены."
                        + System.lineSeparator()
                        + "Menu."
                        + System.lineSeparator()
                        + "0. Find item by name"
                        + System.lineSeparator()
                        + "1. Exit Program"
                        + System.lineSeparator()
                        + "Выход"
                        + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByIdAction(){
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new FindById(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu."
                        + System.lineSeparator()
                        + "0. Find item by id"
                        + System.lineSeparator()
                        + "1. Exit Program"
                        + System.lineSeparator()
                        + "=== Find item by id ===="
                        + System.lineSeparator()
                        + "Заявка с введенным id: 1 не найдена."
                        + System.lineSeparator()
                        + "Menu."
                        + System.lineSeparator()
                        + "0. Find item by id"
                        + System.lineSeparator()
                        + "1. Exit Program"
                        + System.lineSeparator()
                        + "Выход"
                        + System.lineSeparator()
        ));
    }
}