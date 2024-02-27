import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.HashMap;
// 7:50
public class Lab2<K, V> implements Lab2Interface<K, V> {
    private Map<K, V> hashMap;
    private JTextArea outputTextArea;

    public Lab2() {
        hashMap = new HashMap<>();
        initializeUI();
    }

    private void initializeUI() {
        JFrame frame = new JFrame("Lab2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        outputTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        mainPanel.add(scrollPane);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

        JButton addButton = new JButton("Мап утга нэмэх");
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

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                K key = (K) JOptionPane.showInputDialog("Түлхүүр:");
                V value = (V) JOptionPane.showInputDialog("Утга:");

                if (key != null && value != null) {
                    updateElementByKey(hashMap, key, value);
                    updateTextArea();
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                K searchKey = (K) JOptionPane.showInputDialog("Түлхүүр:");
                V foundValue = getElementByKey(hashMap, searchKey);
                outputTextArea.append(searchKey + " түлхүүрийн утга нь: " + foundValue + "\n");
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                K updateKey = (K) JOptionPane.showInputDialog("Түлхүүр:");
                V updateValue = (V) JOptionPane.showInputDialog("Утга:");
                updateElementByKey(hashMap, updateKey, updateValue);
                updateTextArea();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                K removeKey = (K) JOptionPane.showInputDialog("Түлхүүр:");
                removeElementByKey(hashMap, removeKey);
                updateTextArea();
            }
        });

        containsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                K checkKey = (K) JOptionPane.showInputDialog("Түлхүүр:");
                boolean contains = containsKey(hashMap, checkKey);
                outputTextArea.append("Түлхүүр: " + checkKey + "\n Утгатай эсэх: " + contains + "\n");
                if (contains) {
                    V foundValue = getElementByKey(hashMap, checkKey);
                    outputTextArea.append("Утга: " + foundValue + "\n");
                } else {
                    outputTextArea.append("\n");
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputTextArea.append("Мап:\n");
                Hevleh(hashMap);
            }
        });

        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
    }

    @Override
    public Map<K, V> Uusgeh() {
        return new HashMap<>();
    }

    @Override
    public V getElementByKey(Map<K, V> hashMap, K key) {
        return hashMap.get(key);
    }

    @Override
    public void updateElementByKey(Map<K, V> hashMap, K key, V newValue) {
        hashMap.put(key, newValue);
    }

    @Override
    public void removeElementByKey(Map<K, V> hashMap, K key) {
        hashMap.remove(key);
    }

    @Override
    public boolean containsKey(Map<K, V> hashMap, K key) {
        return hashMap.containsKey(key);
    }

    @Override
    public void Hevleh(Map<K, V> hashMap) {
        outputTextArea.append("\n Утгууд:\n");
        for (Map.Entry<K, V> entry : hashMap.entrySet()) {
            outputTextArea.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        outputTextArea.append("\n");
    }


    private void updateTextArea() {
        System.out.println("\n Утгууд:");
        for (Map.Entry<K, V> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Lab2<String, Integer>();
        });
    }
}
