package gameComplet.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

    public enum House {
        GRYFFINDOR,
        HUFFLEPUFF,
        SLYTHERIN,
        RAVENCLAW;


        private static List<House> HOUSE_LIST = null;

        static {
            HOUSE_LIST = new ArrayList<>();
            HOUSE_LIST.addAll(Arrays.asList(House.values()));
        }

        public static List<House> getValues() {
            return Collections.unmodifiableList(HOUSE_LIST);

        }



}
