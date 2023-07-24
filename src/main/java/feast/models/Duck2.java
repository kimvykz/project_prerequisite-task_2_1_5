package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck2 {
    @Autowired
    private Chicken3 chicken3;

    public Duck2(Chicken3 chicken3) {
        this.chicken3 = chicken3;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a chicken, " + chicken3.toString();
    }
}
