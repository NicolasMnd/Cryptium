package util;

import theorem.TheoremBezout;

import java.util.ArrayList;
import java.util.List;

/**
 * We define 'units' as numbers in a group that have an inverted
 */
public class Unit {

    public List<Integer> calculateUnits(int mod) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i < mod; i++) {

            TheoremBezout b = new TheoremBezout(i, mod, 1);
            if(b.isTheoremValid())
                list.add(b.getInversion());

        }

        return list;

    }

}
