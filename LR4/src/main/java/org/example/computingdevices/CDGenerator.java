package org.example.computingdevices;

import java.util.ArrayList;

public class CDGenerator {
    public static ArrayList<ComputingDevice> generateList(){
        ArrayList<ComputingDevice> list = new ArrayList<ComputingDevice>();
        list.add(new Laptop(
                "Honor Magicbook 14",
                8,
                2.9,
                8,
                222,
                new VideoGraphic("Radeon Vega 8", 1, Boolean.FALSE, Boolean.FALSE)
        ));
        list.add(new PC(
                "Custom PC",
                4,
                3.6,
                12,
                1024,
                new VideoGraphic("Nvidia GT 1030", 2, Boolean.FALSE, Boolean.FALSE),
                350
            )
        );
        list.add(new GamingPC(
                        "Custom PC",
                        16,
                        3.6,
                        32,
                        2 * 1024,
                        new VideoGraphic("Nvidia RTX 3060", 8, Boolean.FALSE, Boolean.FALSE),
                        750
                )
        );
        list.add(new Server(
                "DWH",
                64,
                4.1,
                128,
                15 * 1024,
                Boolean.TRUE
            )
        );
        list.add(new AIServer(
                        "AI Training Server",
                        64,
                        4.1,
                        128,
                        15 * 1024,
                        Boolean.TRUE
                )
        );
        list.add(new SelfHostServer(
                        "SelfHost Server",
                        16,
                        3.6,
                        64,
                        5 * 1024,
                        Boolean.FALSE,
                        "https://ecampus.ncfu.ru/"
                )
        );
        list.add(new ComputingDevice(
                "Unknown Device",
                4,
                1.8,
                1,
                16
            )
        );
        return list;
    }
}
