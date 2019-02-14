package com.example.mopapp05.Model;

import java.util.ArrayList;

public class MopDAO {

    private static final MopDAO ourInstance = new MopDAO();

    private ArrayList<Mop> mopLijst = new ArrayList<>();

    public static MopDAO getInstance() {
        return ourInstance;
    }

    private MopDAO() {
        mopLijst.add(new Mop("Het is oud en het vliegt", "Een bejaardelaar"));
        mopLijst.add(new Mop("Het is rood en het vliegt door de klas", "Ongestelde vraag"));
        mopLijst.add(new Mop("Het is geel en weegt niet veel","LichtGeel"));
        mopLijst.add(new Mop("Het is oranje en als het regent is het weg", "De mannen van de gemeente"));
        mopLijst.add(new Mop("Het is zwart en als het uit de boom valt is u stoof kapot","Uw stoof"));
        mopLijst.add(new Mop("Het is groen en het heeft een gewei","Een dophertje"));

    }

    public ArrayList<Mop> getMopLijst() {
        return mopLijst;
    }
}
