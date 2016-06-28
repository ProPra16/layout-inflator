package de.hhu.propra16.xml;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Created by Tobias Witt on 28.06.16.
 */
public class LayoutInflator {

    private Map<String, Supplier<Node>> factories = new HashMap<>();

    public LayoutInflator() {
        factories.put("Text", Text::new);
        factories.put("TextField", TextField::new);
        factories.put("Label", Label::new);
        factories.put("Button", Button::new);
        factories.put("GridPane", GridPane::new);
    }

    public GridPane inflate(URL xmlFile) {
        // Diese methode müssen Sie implementieren!
    }
}
