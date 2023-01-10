package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        String task1 = "Add visualisation";
        String task2 = "Add documentation";
        String task3 = "Add simple logic";

        //When
        board.getToDoList().getTasks().add(task1);
        board.getInProgressList().getTasks().add(task2);
        board.getDoneList().getTasks().add(task3);

        //Then
        assertAll(() -> assertEquals(task1, board.getToDoList().getTasks().get(0)),
                () -> assertEquals(task2, board.getInProgressList().getTasks().get(0)),
                () -> assertEquals(task3, board.getDoneList().getTasks().get(0)));
    }
}
