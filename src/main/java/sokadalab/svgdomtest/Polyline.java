//ok
package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Polyline extends SVGAnimatedPoints {
    Polyline(Document document) {
        super(document, "polyline");
        super.setAttribute("fill", "none");
        super.setAttribute("stroke-width", "1");
        super.setAttribute("stroke", "black");
    }
}
