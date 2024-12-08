// <path>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;
import java.util.regex.Pattern;

public class Path extends SVGElement {
    private SVGPathSegList d = new SVGPathSegList();

    public Path(Document document) {
        super(document, "path");
    }

    public SVGPathSegList getD() {
        return this.d;
    }

    // 属性dの中身をすべてstrに書き直す
    public void setD(String str) {
        Pattern p = Pattern.compile("[Z,z,M,m,L,l,C,c,Q,q,A,a,H,h,V,v,S,s,T,t]");
        while (str != "") {
            switch (str.substring(0, 1)) {
                case " " :
                    str = str.substring(1);
                case "," :
                    str = str.substring(1);
                default :
                    String first = str.substring(0, 1); // 最初の1文字
                    String second = str.substring(1);   // 残りの文字列
                    String[] data = p.split(second, 2);
                    appendD(first, data[0]);
                    setD(data[1]);
            }

        }
    }

    // <path>の属性dの末尾に新しいデータを追加する
    public void appendD(String type, String data) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = type;
        newItem.pathSegType = newItem.letterToType(newItem.pathSegTypeAsLetter);
        Pattern p = Pattern.compile("\\s");    // 空白文字 (できればカンマ区切りも追加したい)
        while(data == "") {
            switch (data.substring(0, 1)) {
                case " " :
                    data = data.substring(1);
                case "," :
                    data = data.substring(1);
                default :
                    String[] first = p.split(data, 2);
                    newItem.data.add(Float.parseFloat(first[0]));
                    data = first[1];
            }
        }
        this.d.appendItem(newItem);
        super.setAttribute("d", this.d.getAllItem());
    }
    public void appendD(short type, String data) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = SVGPathSeg.typeToLetter(type);
        newItem.pathSegType = SVGPathSeg.letterToType(newItem.pathSegTypeAsLetter);
        Pattern p = Pattern.compile("\\s");    // 空白文字 (できればカンマ区切りも追加したい)
        while(data == "") {
            switch (data.substring(0, 1)) {
                case " " :
                    data = data.substring(1);
                case "," :
                    data = data.substring(1);
                default :
                    String[] first = p.split(data, 2);
                    newItem.data.add(Float.parseFloat(first[0]));
                    data = first[1];
            }
        }
        this.d.appendItem(newItem);        
        super.setAttribute("d", this.d.getAllItem());
    }
    public void appendD(String str) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = str.substring(0, 1);
        newItem.pathSegType = SVGPathSeg.letterToType(newItem.pathSegTypeAsLetter);
        Pattern p = Pattern.compile("\\s");    // 空白文字 (できればカンマ区切りも追加したい)
        String data = str.substring(1);
        while (str == "") {
            switch (data.substring(0, 1)) {
                case " " :
                    data = data.substring(1);
                case "," :
                    data = data.substring(1);
                default :
                    String[] first = p.split(data, 2);
                    newItem.data.add(Float.parseFloat(first[0]));
                    data = first[1];
            }
        }
        this.d.appendItem(newItem);
        super.setAttribute("d", this.d.getAllItem());
    }
}
