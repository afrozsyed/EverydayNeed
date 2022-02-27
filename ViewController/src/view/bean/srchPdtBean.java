package view.bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.view.rich.component.rich.input.RichInputNumberSpinbox;
import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.domain.Number;

public class srchPdtBean {
    Number qntynew;

    public srchPdtBean() {
    }
    

    public void updateQnty(ActionEvent actionEvent) {
        DCBindingContainer bindings =
        (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        // Provide the Iterator Name
        DCIteratorBinding iteratorBinding =
        (DCIteratorBinding)bindings.get("ProductsVO1Iterator");
        if(iteratorBinding != null){
        Row currentRow = iteratorBinding.getCurrentRow();
        if(currentRow != null){
        //Provide the attribute name
        System.out.println(currentRow.getAttribute("Qunty"));
        Number n2 = getQntynew();
            Number n = (Number)currentRow.getAttribute("Qunty");
            currentRow.setAttribute("Qunty", n.add(n2));
            System.out.println("value of quantity" + n);
            BindingContext bctx = BindingContext.getCurrent();
            BindingContainer bc = bctx.getCurrentBindingsEntry();
            OperationBinding ob = bc.getOperationBinding("Commit");
            ob.execute();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,null,null);
            fm.setDetail("Saved Sucessfully");
            FacesContext.getCurrentInstance().addMessage(null,fm);
        }
        }
    }


    public void setQntynew(Number qntynew) {
        this.qntynew = qntynew;
    }

    public Number getQntynew() {
        return qntynew;
    }
}
