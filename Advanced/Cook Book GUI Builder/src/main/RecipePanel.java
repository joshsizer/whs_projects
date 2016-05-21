/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Josh
 */
public class RecipePanel extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public RecipePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RecipePanel = new javax.swing.JPanel();
        recipeDisplayScrollPane = new javax.swing.JScrollPane();
        recipeDisplayTextArea = new javax.swing.JTextArea();
        recipeListScrollPane = new javax.swing.JScrollPane();
        recipeList = new javax.swing.JList<>();
        recipeLabel = new javax.swing.JLabel();
        showAll = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        recipeNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test GUI");
        setName("Frame"); // NOI18N

        RecipePanel.setMinimumSize(new java.awt.Dimension(371, 287));
        RecipePanel.setName(""); // NOI18N
        RecipePanel.setPreferredSize(new java.awt.Dimension(400, 350));

        recipeDisplayScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        recipeDisplayTextArea.setColumns(20);
        recipeDisplayTextArea.setLineWrap(true);
        recipeDisplayTextArea.setRows(5);
        recipeDisplayScrollPane.setViewportView(recipeDisplayTextArea);

        recipeListScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        recipeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        recipeListScrollPane.setViewportView(recipeList);

        recipeLabel.setText("Recipes:");

        showAll.setText("Show All");

        edit.setText("Edit");

        recipeNameLabel.setText("Name: ");
        recipeNameLabel.setToolTipText("");

        javax.swing.GroupLayout RecipePanelLayout = new javax.swing.GroupLayout(RecipePanel);
        RecipePanel.setLayout(RecipePanelLayout);
        RecipePanelLayout.setHorizontalGroup(
            RecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecipePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RecipePanelLayout.createSequentialGroup()
                        .addGroup(RecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showAll)
                            .addComponent(recipeListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(RecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RecipePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edit))
                            .addGroup(RecipePanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(RecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RecipePanelLayout.createSequentialGroup()
                                        .addComponent(recipeNameLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(recipeDisplayScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(RecipePanelLayout.createSequentialGroup()
                        .addComponent(recipeLabel)
                        .addGap(149, 349, Short.MAX_VALUE))))
        );
        RecipePanelLayout.setVerticalGroup(
            RecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecipePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(RecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recipeNameLabel)
                    .addComponent(recipeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recipeListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(recipeDisplayScrollPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showAll)
                    .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RecipePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RecipePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecipePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RecipePanel;
    private javax.swing.JButton edit;
    private javax.swing.JScrollPane recipeDisplayScrollPane;
    private javax.swing.JTextArea recipeDisplayTextArea;
    private javax.swing.JLabel recipeLabel;
    private javax.swing.JList<String> recipeList;
    private javax.swing.JScrollPane recipeListScrollPane;
    private javax.swing.JLabel recipeNameLabel;
    private javax.swing.JButton showAll;
    // End of variables declaration//GEN-END:variables
}
