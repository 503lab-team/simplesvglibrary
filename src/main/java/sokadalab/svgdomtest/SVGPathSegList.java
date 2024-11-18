package sokadalab.svgdomtest;

import java.util.ArrayList;
import java.util.List;

class SVGPathSegList extends ArrayList {
    List<SVGPathSeg> list = new ArrayList<SVGPathSeg>();
    private long numberOfItems;

    @Override
    public void clear() {
        this.list.clear();
        this.numberOfItems = 0;
    }

    void initialize(SVGPathSeg newItem) {
        clear();
        this.list.add(newItem);
        this.numberOfItems = 1;
    }

    SVGPathSeg getItem(int index) {
        return this.list.get(index);
    }

    String getAllItem() {
        String result = "";
        SVGPathSeg pathSeg = new SVGPathSeg();
        for (int i = 0; i < this.list.size(); i++) {
            pathSeg = this.list.get(i);
            result = result + pathSeg.pathSegTypeAsLetter;
            for (int j = 0; j < pathSeg.size(); j++) {
                result = " " + result + pathSeg.data.get(i);
            }
            if (i + 1 < this.list.size()) {
                result = result + " ";
            }
        }
        return result;
    }

    void insertItemBefore(SVGPathSeg newItem, int index) {
        if (index < 0) {
            this.list.add(0, newItem);
        } else if (index < this.numberOfItems) {
            this.list.add(index, newItem);
        } else {
            this.list.add(newItem);
        }
        this.numberOfItems += 1;
    }

    void replaceItem(SVGPathSeg newItem, int index) {
        removeItem(index);
        insertItemBefore(newItem, index);
    }

    void removeItem(int index) {
        this.list.remove(index);
        this.numberOfItems -= 1;
    }

    void appendItem(SVGPathSeg newItem) {
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    void appendItem(String pathSegTypeAsLetter) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = pathSegTypeAsLetter;
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
}
