// <radialGradient>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class RadialGradient extends Gradient {
    private SVGLength cx = new SVGLength();
    private SVGLength cy = new SVGLength();
    private SVGLength r = new SVGLength();
    private SVGLength fx = new SVGLength();
    private SVGLength fy = new SVGLength();

    public RadialGradient(Document document) {
        super(document, "radialGradient");
    }

    public SVGLength getCX() {
        return this.cx;
    }

    public SVGLength getCY() {
        return this.cy;        
    }

    public SVGLength getR() {
        return this.r;
    }

    public SVGLength getFX() {
        return this.fx;
    }

    public SVGLength getFY() {
        return this.fy;
    }

    public void setCX(String cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    public void setCX(short unitType, float value) {
        this.cx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    public void setCX(float cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    public void setCX(int cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    public void setCX(SVGLength cx) {
        this.cx = cx;
        super.setAttribute("cx", this.cx.getValueAsString());
    }

    public void setCY(String cy) {
        this.cy.newValueSpecifiedUnit(cy);
        super.setAttribute("cy", this.cy.getValueAsString());
    }
    public void setCY(short unitType, float value) {
        this.cy.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("cy", this.cy.getValueAsString());
    }
    public void setCY(float cy) {
        this.cy.newValueSpecifiedUnit(cy);
        super.setAttribute("cy", this.cy.getValueAsString());
    }
    public void setCY(int cy) {
        this.cy.newValueSpecifiedUnit(cy);
        super.setAttribute("cy", this.cy.getValueAsString());
    }
    public void setCY(SVGLength cy) {
        this.cy = cy;
        super.setAttribute("cy", this.cy.getValueAsString());
    }

    public void setR(String r) {
        this.r.newValueSpecifiedUnit(r);
        super.setAttribute("r", this.r.getValueAsString());
    }
    public void setR(short unitType, float value) {
        this.r.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("r", this.r.getValueAsString());
    }
    public void setR(float r) {
        this.r.newValueSpecifiedUnit(r);
        super.setAttribute("r", this.r.getValueAsString());
    }
    public void setR(int r) {
        this.r.newValueSpecifiedUnit(r);
        super.setAttribute("r", this.r.getValueAsString());
    }
    public void setR(SVGLength r) {
        this.r = r;
        super.setAttribute("r", this.r.getValueAsString());
    }

    public void setFX(String fx) {
        this.fx.newValueSpecifiedUnit(fx);
        super.setAttribute("fx", this.fx.getValueAsString());
    }
    public void setFX(short unitType, float value) {
        this.fx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("fx", this.fx.getValueAsString());
    }
    public void setFX(float fx) {
        this.fx.newValueSpecifiedUnit(fx);
        super.setAttribute("fx", this.fx.getValueAsString());
    }
    public void setFX(int fx) {
        this.fx.newValueSpecifiedUnit(fx);
        super.setAttribute("fx", this.fx.getValueAsString());
    }
    public void setFX(SVGLength fx) {
        this.fx = fx;
        super.setAttribute("fx", this.fx.getValueAsString());
    }

    public void setFY(String fy) {
        this.fy.newValueSpecifiedUnit(fy);
        super.setAttribute("fy", this.fy.getValueAsString());
    }
    public void setXFY(short unitType, float value) {
        this.fy.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("fy", this.fy.getValueAsString());
    }
    public void setFY(float fy) {
        this.fy.newValueSpecifiedUnit(fy);
        super.setAttribute("fy", this.fy.getValueAsString());
    }
    public void setFY(int fy) {
        this.fy.newValueSpecifiedUnit(fy);
        super.setAttribute("fy", this.fy.getValueAsString());
    }
    public void setFY(SVGLength fy) {
        this.fy = fy;
        super.setAttribute("fy", this.fy.getValueAsString());
    }
}
