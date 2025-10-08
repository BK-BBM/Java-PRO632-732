import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");
        String[] columns = {"Student Name","Qualification","Marks"};
        Object[][] tableData = {
                {"Sahil","Bsc IT", "75"},
                {"Shivaar","Bsc IT", "73"},
                {"Njabulo","Bsc IT", "71"},
                {"Zothile","DIT", "75"},
                {"Taydin","DIT", "65"},
                {"Khetho","Bsc IT", "77"},
                {"Thembelihle","Bsc IT", "76"},
                {"Slee","DIT", "80"}
        };
        JTable table = new JTable(tableData, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}