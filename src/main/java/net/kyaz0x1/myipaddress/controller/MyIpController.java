package net.kyaz0x1.myipaddress.controller;

import net.kyaz0x1.myipaddress.service.WebService;

public final class MyIpController {

    private static MyIpController INSTANCE;

    private final WebService webService;

    private MyIpController(){
        this.webService = WebService.getInstance();
    }

    public String getAddress(){
        final String address = webService.read("http://checkip.amazonaws.com/").trim();
        return address;
    }

    public static MyIpController getInstance(){
        if(INSTANCE == null){
            synchronized(MyIpController.class){
                if(INSTANCE == null){
                    INSTANCE = new MyIpController();
                }
            }
        }
        return INSTANCE;
    }

}