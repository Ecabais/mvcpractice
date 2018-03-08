/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author elyvic
 */
public class GUI extends GridPane {
   
   private int chain = 0;
   
   private Label huntLabel = new Label("Currently Hunting: ");
   private TextField huntTF = new TextField();
   
   private Label chainLabel = new Label("Chain Count: ");
   private TextField chainTF = new TextField();
   private Label emptyLabel = new Label();
   
   private TextArea caughtTA = new TextArea(); 
   
   private Button addBtn = new Button("Add");
   private Button submitBtn = new Button("Submit");
   private Button resetBtn = new Button("Reset");
   private Button nextBtn = new Button(">>");
   private Button previousBtn = new Button("<<");
   private Button viewAllBtn = new Button("View All");
   
   private HBox huntHbox = new HBox(huntLabel, huntTF);
   private HBox chainHbox = new HBox(chainLabel, chainTF);
   private HBox viewHbox = new HBox(getPreviousBtn(), getNextBtn(), getViewAllBtn());
   private HBox btnHbox = new HBox(resetBtn, addBtn, submitBtn);
   
   public GUI(){
       
       chainTF.setEditable(false);
       caughtTA.setEditable(false);
       
       
       
       //all the positions of the gridpane
       this.addRow(0, huntHbox);
       this.addRow(1, chainHbox);
       this.addRow(2, btnHbox);
       this.addRow(3, emptyLabel);
       this.addRow(5, viewHbox);
       this.addRow(6, caughtTA);
       
       
   }
   
   public void AddCounter(){
       
       
       String chainString = Integer.toString(chain);
       chainTF.setText(chainString);
       chain++;
   }
   
   public void Clearfields(){
       huntTF.clear();
       chainTF.clear();
   }

    /**
     * @return the huntLabel
     */
    public Label getHuntLabel() {
        return huntLabel;
    }

    /**
     * @param huntLabel the huntLabel to set
     */
    public void setHuntLabel(Label huntLabel) {
        this.huntLabel = huntLabel;
    }

    /**
     * @return the huntTF
     */
    public TextField getHuntTF() {
        return huntTF;
    }

    /**
     * @param huntTF the huntTF to set
     */
    public void setHuntTF(TextField huntTF) {
        this.huntTF = huntTF;
    }

    /**
     * @return the chainLabel
     */
    public Label getChainLabel() {
        return chainLabel;
    }

    /**
     * @param chainLabel the chainLabel to set
     */
    public void setChainLabel(Label chainLabel) {
        this.chainLabel = chainLabel;
    }

    /**
     * @return the chainTF
     */
    public TextField getChainTF() {
        return chainTF;
    }

    /**
     * @param chainTF the chainTF to set
     */
    public void setChainTF(TextField chainTF) {
        this.chainTF = chainTF;
        
    }

    /**
     * @return the caughtTA
     */
    public TextArea getCaughtTA() {
        return caughtTA;
    }

    /**
     * @param caughtTA the caughtTA to set
     */
    public void setCaughtTA(TextArea caughtTA) {
        this.caughtTA = caughtTA;
    }

    /**
     * @return the addBtn
     */
    public Button getAddBtn() {
        return addBtn;
    }

    /**
     * @param addBtn the addBtn to set
     */
    public void setAddBtn(Button addBtn) {
        this.addBtn = addBtn;
    }

    /**
     * @return the submitBtn
     */
    public Button getSubmitBtn() {
        return submitBtn;
    }

    /**
     * @param submitBtn the submitBtn to set
     */
    public void setSubmitBtn(Button submitBtn) {
        this.submitBtn = submitBtn;
    }

    /**
     * @return the resetBtn
     */
    public Button getResetBtn() {
        return resetBtn;
    }

    /**
     * @param resetBtn the resetBtn to set
     */
    public void setResetBtn(Button resetBtn) {
        this.resetBtn = resetBtn;
    }

    /**
     * @return the huntHbox
     */
    public HBox getHuntHbox() {
        return huntHbox;
    }

    /**
     * @param huntHbox the huntHbox to set
     */
    public void setHuntHbox(HBox huntHbox) {
        this.huntHbox = huntHbox;
    }

    /**
     * @return the chainHbox
     */
    public HBox getChainHbox() {
        return chainHbox;
    }

    /**
     * @param chainHbox the chainHbox to set
     */
    public void setChainHbox(HBox chainHbox) {
        this.chainHbox = chainHbox;
    }

    /**
     * @return the btnHbox
     */
    public HBox getBtnHbox() {
        return btnHbox;
    }

    /**
     * @param btnHbox the btnHbox to set
     */
    public void setBtnHbox(HBox btnHbox) {
        this.btnHbox = btnHbox;
    }

    /**
     * @return the nextBtn
     */
    public Button getNextBtn() {
        return nextBtn;
    }

    /**
     * @param nextBtn the nextBtn to set
     */
    public void setNextBtn(Button nextBtn) {
        this.nextBtn = nextBtn;
    }

    /**
     * @return the previousBtn
     */
    public Button getPreviousBtn() {
        return previousBtn;
    }

    /**
     * @param previousBtn the previousBtn to set
     */
    public void setPreviousBtn(Button previousBtn) {
        this.previousBtn = previousBtn;
    }

    /**
     * @return the viewAllBtn
     */
    public Button getViewAllBtn() {
        return viewAllBtn;
    }

    /**
     * @param viewAllBtn the viewAllBtn to set
     */
    public void setViewAllBtn(Button viewAllBtn) {
        this.viewAllBtn = viewAllBtn;
    }
}
