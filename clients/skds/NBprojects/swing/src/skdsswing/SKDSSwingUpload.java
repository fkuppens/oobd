/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SKDSSwingUpload.java
 *
 * Created on 30.04.2011, 16:21:35
 */

package skdsswing;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import org.jdesktop.application.Action;
/**
 *
 * @author maziar
 */
public class SKDSSwingUpload extends javax.swing.JDialog {

    /** Creates new form SKDSSwingUpload */
    private static boolean openSelected = false;;
   

    public static boolean getOpenSelected(){
        return openSelected;
    }
    public static void setOpenSelected(boolean value){
        openSelected = value;
    }


    public SKDSSwingUpload(java.awt.Frame parent) {
        super(parent);
        initComponents();
       

        if((SDKSSwingFileExplorer.getFileName()==null) ){
            TFFileName.setText("No File selected!!!!");
            TFFilePath.setText("No file available!!!");
            TFFilesize.setText("0 KB");
            ButtonSend.setEnabled(false);
            // SDKSSwingFileExplorer.getFileName()
        }
        else{
            TFFileName.setText(SDKSSwingFileExplorer.getFileName());
            TFFilePath.setText(SDKSSwingFileExplorer.getFilePath());
            ButtonSend.setEnabled(true);
        }

    }
    /*
     * Close the Frame Swing upload
     */
     @Action public void closeUploadDialog() {
       openSelected = true;
       dispose();
       
    }
     /*
      * Open the file explorer
      */
      @Action
    public void showFileExplorer() {
        if (SDKSSwingFileExplorer.getOpenSelected()) {
            SDKSSwingFileExplorer.setOpenSelected(false);
            fileExplorer = null;
        }

        if (fileExplorer == null) {
            javax.swing.JFrame mainFrame = SKDSSwingApp.getApplication().getMainFrame();
           // JFrame mainFrame = SKDSSwingApp.getApplication().getMainFrame();
            fileExplorer = new SDKSSwingFileExplorer(mainFrame, true);
            fileExplorer.setLocationRelativeTo(mainFrame);
            /*
            if((SDKSSwingFileExplorer.getFileName()==null) ){
                TFFileName.setText("No File selected!!!!");
                TFFilePath.setText("No file available!!!");
                TFFilesize.setText("0 KB");
                ButtonSend.setEnabled(false);
                // SDKSSwingFileExplorer.getFileName()
             }*/
             
                TFFileName.setText(SDKSSwingFileExplorer.getFileName());
                TFFilePath.setText(SDKSSwingFileExplorer.getFilePath());
                TFFilesize.setText(SDKSSwingFileExplorer.getFileSize()+ "KB");
                ButtonSend.setEnabled(true);
             
           

        }

        // SKDSSwingApp.getApplication().show(fileExplorer);

    }
      /*
       * Reset the OOD Cup 
       */
      @Action
      public void resetOOBDCup(){

      }


  

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonSend = new javax.swing.JButton();
        ButtonClose = new javax.swing.JButton();
        TFFileName = new javax.swing.JTextField();
        TFFilePath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonReset = new javax.swing.JButton();
        TFFilesize = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(skdsswing.SKDSSwingApp.class).getContext().getResourceMap(SKDSSwingUpload.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        ButtonSend.setText(resourceMap.getString("ButtonSend.text")); // NOI18N
        ButtonSend.setName("ButtonSend");

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(skdsswing.SKDSSwingApp.class).getContext().getActionMap(SKDSSwingUpload.class, this);
        ButtonClose.setAction(actionMap.get("closeUploadDialog")); // NOI18N
        ButtonClose.setText(resourceMap.getString("ButtonClose.text")); // NOI18N
        ButtonClose.setName("ButtonClose"); // NOI18N

        TFFileName.setEditable(false);
        TFFileName.setText(resourceMap.getString("TFFileName.text")); // NOI18N
        TFFileName.setName("TFFileName"); // NOI18N

        TFFilePath.setEditable(false);
        TFFilePath.setText(resourceMap.getString("TFFilePath.text")); // NOI18N
        TFFilePath.setName("TFFilePath"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jRadioButton1.setSelected(true);
        jRadioButton1.setText(resourceMap.getString("jRadioButton1.text")); // NOI18N
        jRadioButton1.setEnabled(false);
        jRadioButton1.setName("jRadioButton1"); // NOI18N

        jButton1.setAction(actionMap.get("showFileExplorer")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jButtonReset.setText(resourceMap.getString("jButtonReset.text")); // NOI18N
        jButtonReset.setName("jButtonReset"); // NOI18N

        TFFilesize.setEditable(false);
        TFFilesize.setText(resourceMap.getString("TFFilesize.text")); // NOI18N
        TFFilesize.setName("TFFilesize"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonSend)
                        .addGap(262, 262, 262)
                        .addComponent(jButtonReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonClose)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFFilePath, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFFileName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(72, 72, 72)
                                .addComponent(jButton1)))
                        .addGap(153, 153, 153))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(TFFilesize, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(562, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TFFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFFilesize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton1))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSend)
                    .addComponent(ButtonClose)
                    .addComponent(jButtonReset))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonClose;
    private javax.swing.JButton ButtonSend;
    private javax.swing.JTextField TFFileName;
    private javax.swing.JTextField TFFilePath;
    private javax.swing.JTextField TFFilesize;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
   private SDKSSwingFileExplorer fileExplorer;
}
