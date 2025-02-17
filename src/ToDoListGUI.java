import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListGUI {
    private TaskManager taskManager;
    private JFrame frame;
    private JTextArea taskArea;
    private JTextField taskField;

    public ToDoListGUI() {
        taskManager = new TaskManager();
        initialize();
    }

    private void initialize() {
        // Configuração da Janela
        frame = new JFrame("ToDo List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        // Área de Texto para Listar Tarefas
        taskArea = new JTextArea();
        taskArea.setEditable(false);
        taskArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(taskArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Painel Inferior para Adicionar Tarefas
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());

        taskField = new JTextField();
        taskField.setFont(new Font("Arial", Font.PLAIN, 14));
        bottomPanel.add(taskField, BorderLayout.CENTER);

        JButton addButton = new JButton("Adicionar");
        addButton.setFont(new Font("Arial", Font.BOLD, 12));
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String description = taskField.getText();
                if (!description.isEmpty()) {
                    taskManager.addTask(description);
                    taskField.setText("");
                    updateTaskList();
                }
            }
        });
        bottomPanel.add(addButton, BorderLayout.EAST);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Painel de Controles
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        JButton completeButton = new JButton("Concluir Tarefa");
        completeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(frame, "Digite o número da tarefa:");
                try {
                    int index = Integer.parseInt(input) - 1;
                    taskManager.markTaskAsCompleted(index);
                    updateTaskList();
                } catch (NumberFormatException | NullPointerException ex) {
                    JOptionPane.showMessageDialog(frame, "Entrada inválida!");
                }
            }
        });

        JButton removeButton = new JButton("Remover Tarefa");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(frame, "Digite o número da tarefa:");
                try {
                    int index = Integer.parseInt(input) - 1;
                    taskManager.removeTask(index);
                    updateTaskList();
                } catch (NumberFormatException | NullPointerException ex) {
                    JOptionPane.showMessageDialog(frame, "Entrada inválida!");
                }
            }
        });

        JButton editButton = new JButton("Editar Tarefa");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(frame, "Digite o número da tarefa:");
                try {
                    int index = Integer.parseInt(input) - 1;
                    String newDescription = JOptionPane.showInputDialog(frame, "Nova descrição:");
                    if (newDescription != null && !newDescription.isEmpty()) {
                        taskManager.editTask(index, newDescription);
                        updateTaskList();
                    }
                } catch (NumberFormatException | NullPointerException ex) {
                    JOptionPane.showMessageDialog(frame, "Entrada inválida!");
                }
            }
        });

        controlPanel.add(completeButton);
        controlPanel.add(removeButton);
        controlPanel.add(editButton);
        frame.add(controlPanel, BorderLayout.NORTH);

        // Atualizar a Lista de Tarefas
        updateTaskList();

        // Exibir a Janela
        frame.setVisible(true);
    }

    private void updateTaskList() {
        taskArea.setText("");
        for (int i = 0; i < taskManager.getTasks().size(); i++) {
            taskArea.append((i + 1) + ". " + taskManager.getTasks().get(i) + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToDoListGUI();
            }
        });
    }
}