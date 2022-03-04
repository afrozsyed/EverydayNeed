package view.bean;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.binding.OperationBinding;

public class ChckOutBean {

    private RichInputText prdtId;
    private RichInputText prdtNm;
    private RichInputText prdtCat;

    public ChckOutBean() {
    }
    public void GetDetls(ValueChangeEvent valueChangeEvent) {
        FacesContext context = FacesContext.getCurrentInstance();
        Application app = context.getApplication();

        DCBindingContainer binding = (DCBindingContainer) app.evaluateExpressionGet(context, "#{bindings}",DCBindingContainer.class);

        // Call AM insContData Method

        OperationBinding callAmMethod =
        binding.getOperationBinding("GetPrdtDetails");
        callAmMethod.getParamsMap().put("val",getPrdtId());
        callAmMethod.execute();

    }

    public void setPrdtId(RichInputText prdtId) {
        this.prdtId = prdtId;
    }

    public RichInputText getPrdtId() {
        return prdtId;
    }

    public void setPrdtNm(RichInputText prdtNm) {
        this.prdtNm = prdtNm;
    }

    public RichInputText getPrdtNm() {
        return prdtNm;
    }

    public void setPrdtCat(RichInputText prdtCat) {
        this.prdtCat = prdtCat;
    }

    public RichInputText getPrdtCat() {
        return prdtCat;
    }
}
