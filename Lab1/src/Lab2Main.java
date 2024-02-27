import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab2Main extends JFrame implements Lab2<K,V> {
    private Lab2<K,V> lab2;
    private JTextArea outputTextArea;

    public Lab2Main() {
        lab2 = new Lab2<>();
        initializeUI();
    }

    private void initializeUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 300);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        mainPanel.add(scrollPane);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

        JButton addButton = new JButton("Мап үүсгэх");
        JButton searchButton = new JButton("Түлхүүрээр утга хайх");
        JButton updateButton = new JButton("Түлхүүрээр утгыг солих");
        JButton removeButton = new JButton("Түлхүүрээр утгыг устгах");
        JButton containsButton = new JButton("Түлхүүрэнд утга байгаа эсэх");
        JButton displayButton = new JButton("Мапыг хэвлэх");

        inputPanel.add(addButton);
        inputPanel.add(searchButton);
        inputPanel.add(updateButton);
        inputPanel.add(removeButton);
        inputPanel.add(containsButton);
        inputPanel.add(displayButton);

        mainPanel.add(inputPanel);

        addButton.addActionListener(e -> {
            String key = JOptionPane.showInputDialog("Түлхүүр:");
            int value = Integer.parseInt(JOptionPane.showInputDialog("Утга:"));
            lab2.updateElementByKey(lab2.Uusgeh(), key, value);
        });

        searchButton.addActionListener(e -> {
            String searchKey = JOptionPane.showInputDialog("Түлхүүр:");
            Integer foundValue = lab2.getElementByKey(lab2.Uusgeh(), searchKey);
            outputTextArea.append(searchKey + " түлхүүрийн утга нь: " + foundValue + "\n");
        });

        updateButton.addActionListener(e -> {
            String updateKey = JOptionPane.showInputDialog("Түлхүүр:");
            int updateValue = Integer.parseInt(JOptionPane.showInputDialog("Утга:"));
            lab2.updateElementByKey(lab2.Uusgeh(), updateKey, updateValue);
        });

        removeButton.addActionListener(e -> {
            String removeKey = JOptionPane.showInputDialog("Түлхүүр:");
            lab2.removeElementByKey(lab2.Uusgeh(), removeKey);
        });

        containsButton.addActionListener(e -> {
            String checkKey = JOptionPane.showInputDialog("Түлхүүр:");
            boolean contains = lab2.containsKey(lab2.Uusgeh(), checkKey);
            outputTextArea.append("Түлхүүр: " + checkKey + "\n Утгатай эсэх: " + contains + "\n");
            if (contains) {
                Integer foundValue = lab2.getElementByKey(lab2.Uusgeh(), checkKey);
                outputTextArea.append("Утга: " + foundValue + "\n");
            } else {
                outputTextArea.append("\n");
            }
        });

        displayButton.addActionListener(e -> {
            outputTextArea.append("Мап:\n");
            lab2.Hevleh(lab2.Uusgeh());
        });

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Lab2Main app = new Lab2Main();
            app.setVisible(true);
        });
    }
}
