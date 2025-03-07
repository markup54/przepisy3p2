package pl.zabrze.zs10.listy3p2;

import java.util.ArrayList;

public class Repozytorium {
        public Przepis[] wszystkiePrzepisy = new Przepis[]{

                new Przepis("sernik",
                        "ciasta",
                        R.drawable.sernik,
                        70,
                        new String[]{"ser", "ziemniaki", "masło"},
                        "wszystko wymiesz piec godzinę"),
                new Przepis("makowiec",
                        "ciasta",
                        R.drawable.makowiec,
                        80,
                        new String[]{"mak", "mąka", "drożdze","mleko", "masło"},
                        "wszystko wymiesz piec godzinę"),
                new Przepis("mufinki",
                        "ciastka",
                        R.drawable.mufinka,
                        40,
                        new String[]{"kakao", "mąka", "mleko", "masło"},
                        "wszystko wymiesz piec godzinę"),
                new Przepis("kakao",
                        "napoje",
                        R.drawable.kakao,
                        4,
                        new String[]{"kakao",  "mleko"},
                        "wsypać kako zalać gorącym mlekiem")
        };


}
