package com.company;


public class Controller {
    private View view;

    public Controller(){
        view = new View();
    }
    void start() {
        switch (view.getWorkMode()){
            case 1:         //check information about credit
                int number = view.getCreditNumber();

                if(number > 0){
                    getCreditInfo(number);
                }
                break;
            case 2:         //register new credit
                registerNewCredit();
                break;
            case 0:         //exit
                view.exit();
                break;
            default:
                view.sendReply("\n--------------------------------------------\n" +
                        "Введене значення не є коректним!");
                break;
        }

    }

    private void getCreditInfo(int id){
         //TODO:implement requsting data from db
        view.sendReply(new Credit(0,null, 0, 0,0,0));
    }

    private void registerNewCredit(){
        Customer customer = view.getCustomer();
    }
}
