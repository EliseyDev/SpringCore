package ru.enovikow.robot.model.impl.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.enovikow.robot.model.interfaces.Hand;

@Component
@Lazy
public class ToshibaHandImpl implements Hand {
    public void catching() {
        System.out.println("Catching by Toshiba hands");
    }
}
