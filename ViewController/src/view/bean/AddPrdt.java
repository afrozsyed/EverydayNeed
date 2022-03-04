package view.bean;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.event.DialogEvent.Outcome;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class AddPrdt {
    private RichPopup r2;
    private RichPopup r1;

    public AddPrdt() {
    }

    public void AddNewSup(ActionEvent actionEvent) {
        // Add event code here...
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bc = bctx.getCurrentBindingsEntry();
        OperationBinding ob = bc.getOperationBinding("CreateInsert1");
        ob.execute();
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        getR2().show(hints);
        
    }

    public void setR2(RichPopup r2) {
        this.r2 = r2;
    }

    public RichPopup getR2() {
        return r2;
    }

    public void AddNewCat(ActionEvent actionEvent) {
        // Add event code here...
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bc = bctx.getCurrentBindingsEntry();
        OperationBinding ob = bc.getOperationBinding("CreateInsert");
        ob.execute();
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        getR1().show(hints);
    }

    public void HandleOKCancel(DialogEvent dialogEvent) {
        // Add event code here...
        Outcome oc = dialogEvent.getOutcome();
        if(oc==Outcome.ok){
            BindingContext bctx = BindingContext.getCurrent();
            BindingContainer bc = bctx.getCurrentBindingsEntry();
            OperationBinding ob = bc.getOperationBinding("Commit");
            ob.execute();
    }
}

    public void setR1(RichPopup r1) {
        this.r1 = r1;
    }

    public RichPopup getR1() {
        return r1;
    }
}
